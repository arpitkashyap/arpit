package sis.db;

import sis.model.*;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.sql.Date;

import org.apache.commons.io.FileUtils;

public class DBhandler {
	ArrayList<GradeModel> name = new ArrayList<GradeModel>();
	ArrayList<NewsModel> news = new ArrayList<NewsModel>();
	ArrayList<String> intereststudent = new ArrayList<String>();
	ArrayList<String> interestAll = new ArrayList<String>();
	GradeModel lm = new GradeModel();

	// admin handler
	public ArrayList<TestInterest> searchTestInterest(String in) {

		ArrayList<TestInterest> TestInterest_name = new ArrayList<TestInterest>();

		try {
			int i = 0;
			DBconnection db = new DBconnection();
			System.out.println("connection");
			String abc;
			Connection con = db.createConnection();
			System.out.println("get add interest=" + in);

			PreparedStatement ps = (PreparedStatement) con
					.prepareStatement("SELECT distinct(s_id) FROM SIS.TESTINTEREST where INTEREST=?");
			System.out.println("before set ");

			ps.setString(1, in);
			System.out.println("before executequery ");
			ResultSet rs = ps.executeQuery();
			System.out.println("before rs and ");
			while (rs.next()) {
				// TestInterest nm=new TestInterest();
				System.out.println("inside loop ");
				abc = rs.getString(1);
				PreparedStatement ps1 = con
						.prepareStatement("select S_ID,F_NAME,L_NAME,PHOTO,CURRENT_SEMESTER from STUDENT where S_ID = ? ");
				System.out.println("apterps1 " + abc);

				ps1.setString(1, abc);
				System.out.println("AFTER ps1.setString(1,abc); " + abc);
				ResultSet rs1 = ps1.executeQuery();
				System.out.println("after rs1 and " + abc);
				while (rs1.next()) {
					TestInterest nm = new TestInterest();
					nm.setSid(rs1.getString(1));
					nm.setFname(rs1.getString(2));
					System.out.println("value for sid is" + nm.getSid());
					nm.setLname(rs1.getString(3));

					nm.setDestpath(rs1.getString(4));
					String p = "image/" + nm.getDestpath();
					nm.setDestpath(p);
					nm.setSemester(rs1.getString(5));

					TestInterest_name.add(i, nm);
					i++;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return (TestInterest_name);
	}

	public ArrayList<NewsModel> searchNews() {

		ArrayList<NewsModel> News_name = new ArrayList<NewsModel>();

		try {
			int i = 0;
			DBconnection db = new DBconnection();
			System.out.println("connection");
			Connection con = db.createConnection();
			PreparedStatement ps = (PreparedStatement) con
					.prepareStatement("SELECT * FROM NEWSADD");
			ResultSet rs = ps.executeQuery();
			// System.out.println("rs is\n"+rs);
			while (rs.next()) {
				NewsModel nm = new NewsModel();
				System.out.println("in while rs");
				nm.setNewsHeading(rs.getString(2));

				News_name.add(i, nm);
				i++;
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return (News_name);
	}

	public void dbFinancialInsert(FinancialInsertModel usr)
			throws FileNotFoundException {
		try {
			DBconnection db = new DBconnection();
			Connection con = db.createConnection();
			String query2 = "INSERT INTO STU_FEE(S_ID,TOTAL_FEE,FEE_PAID,PAY_DATE,SEMESTER)values(?,?,?,?,?)";
			// System.out.println(query2);
			PreparedStatement stmt = (PreparedStatement) con
					.prepareStatement(query2);
			stmt.setString(1, usr.getS_id());
			stmt.setString(2, usr.getTOTAL_FEE());
			stmt.setString(3, usr.getFEE_PAID());
			stmt.setDate(4, usr.getPAY_DATE());
			stmt.setInt(5, usr.getSEMESTER());
			stmt.executeUpdate();
			System.out.println("date is=" + usr.getPAY_DATE());

		}

		catch (Exception e) {
			System.out.println("Error.." + e);
		}
	}

	public ArrayList<AnnouncementModel> searchAnnouncement(UserModel user) {

		ArrayList<AnnouncementModel> Announcement_name = new ArrayList<AnnouncementModel>();

		try {
			String sid = (String) user.getSession().get("userid");
			int i = 0, j = 0;
			DBconnection db = new DBconnection();
			System.out.println("connection search ann");
			Connection con = db.createConnection();
			PreparedStatement ps1 = (PreparedStatement) con
					.prepareStatement("select s.INTEREST from STUDENT s where S_ID=?");
			ps1.setString(1, sid);
			ResultSet rs = ps1.executeQuery();
			rs.next();
			String interest = rs.getString(1);
			System.out.println("interest" + interest);
			StringTokenizer st = new StringTokenizer(interest);
			String[] tok = new String[10];
			while (st.hasMoreTokens()) {
				tok[j] = st.nextToken(", ");

				System.out.println("token:" + tok[j]);
				j++;
			}
			j--;
			while (j >= 0) {

				System.out.println(j);
				PreparedStatement ps = (PreparedStatement) con
						.prepareStatement("SELECT DESCRIPTION FROM ANNOUNCEMENT a where a.INTEREST IN (?)");
				System.out.println(tok[j]);
				ps.setString(1, tok[j]);
				ResultSet rs1 = ps.executeQuery();
				String query2 = "INSERT INTO TESTINTEREST (S_id,INTEREST) VALUES(?,?)";
				PreparedStatement prep1 = con.prepareStatement(query2);
				prep1.setString(1, sid);
				prep1.setString(2, tok[j]);
				prep1.executeUpdate();

				System.out.println("after insert of test interest");
				// System.out.println(rs1.next());
				while (rs1.next()) {
					AnnouncementModel Am = new AnnouncementModel();
					System.out.println("annuncement heading="
							+ rs1.getString(1));
					Am.setAnnouncementHeading(rs1.getString(1));
					Announcement_name.add(i, Am);
					i++;
				}
				j--;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return (Announcement_name);
	}

	public void insertNews(ArrayList<NewsModel> array) throws Exception {
		System.out.println("insert news");
		DBconnection db = new DBconnection();
		Connection con = (Connection) db.createConnection();
		java.util.Date date = new java.util.Date();
		Timestamp time = new Timestamp(date.getTime());
		// System.out.println("hello2" );
		System.out.println("heading is :" + array.get(0).getNewsHeading());
		String query = "INSERT INTO NEWSADD (HEADING,DESCRIPTION,TIMESTAMP) VALUES(?,?,?)";
		PreparedStatement prep1 = con.prepareStatement(query);
		prep1.setString(1, array.get(0).getNewsHeading());
		prep1.setString(2, array.get(0).getNewsDescription());
		prep1.setTimestamp(3, time);
		prep1.execute();
	}

	public void insertAnnouncement(ArrayList<AnnouncementModel> array)
			throws Exception {
		DBconnection db = new DBconnection();
		Connection con = (Connection) db.createConnection();
		java.util.Date date = new java.util.Date();
		Timestamp time = new Timestamp(date.getTime());
		System.out.println("heading");
		System.out.println(array.get(0).getAnnouncementHeading());
		String query = "INSERT INTO ANNOUNCEMENT (HEADING,DESCRIPTION,TIMESTAMP,INTEREST) VALUES(?,?,?,?)";
		PreparedStatement prep1 = con.prepareStatement(query);

		prep1.setString(1, array.get(0).getAnnouncementHeading());
		prep1.setString(2, array.get(0).getAnnouncementDescription());
		prep1.setTimestamp(3, time);
		System.out.println("interest" + array.get(0).getInterest());
		prep1.setString(4, array.get(0).getInterest());
		prep1.execute();
	}

	static DBconnection dbc;

	public void editFaculty(FacultyModel getFaculty) {
		Connection c = null;
		PreparedStatement pstmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		dbc = new DBconnection();
		// int status=0;
		try {
			c = dbc.createConnection();

			pstmt = c
					.prepareStatement("select FACULTY_NAME , EMAIL from FACULTY where FACULTY_ID='"
							+ getFaculty.getFaculty_Id() + "';");
			// System.out.println(getFaculty.getFaculty_Id());
			rs = pstmt.executeQuery();
			while (rs.next()) {

				getFaculty.setFaculty_Name(rs.getString(1));
				getFaculty.setEmail(rs.getString(2));

			}

			ps = c.prepareStatement("select PASSWORD from CREDENTIALS where U_ID='"
					+ getFaculty.getFaculty_Id() + "';");
			rs = ps.executeQuery();

			while (rs.next()) {
				getFaculty.setPassword(rs.getString(1));
			}
		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}

	}

	public static void updateFaculty(FacultyModel updateFaculty) {
		Connection c = null;
		PreparedStatement pstmt = null;
		PreparedStatement ps = null;
		// ResultSet rs = null;
		dbc = new DBconnection();
		// int status=0;
		try {
			c = dbc.createConnection();

			pstmt = c.prepareStatement("update FACULTY SET FACULTY_NAME = ?"
					+ "," + "EMAIL=?" + " where FACULTY_ID='"
					+ updateFaculty.getFaculty_Id() + "';");
			// System.out.println(getFaculty.getFaculty_Id());
			pstmt.setString(1, updateFaculty.getFaculty_Name());
			pstmt.setString(2, updateFaculty.getEmail());
			pstmt.executeUpdate();

			ps = c.prepareStatement("update CREDENTIALS SET PASSWORD = ?"
					+ " where U_ID='" + updateFaculty.getFaculty_Id() + "';");
			ps.setString(1, updateFaculty.getPassword());
			ps.executeUpdate();
		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}

	}

	public static void deleteFaculty(FacultyModel deleteFaculty) {
		Connection c = null;
		PreparedStatement pstmt = null;
		PreparedStatement ps = null;
		// ResultSet rs = null;
		dbc = new DBconnection();
		// int status=0;
		try {
			c = dbc.createConnection();

			pstmt = c.prepareStatement("DELETE FROM FACULTY WHERE FACULTY_ID='"
					+ deleteFaculty.getFaculty_Id() + "';");
			// System.out.println(getFaculty.getFaculty_Id());
			pstmt.executeUpdate();
			ps = c.prepareStatement("DELETE FROM CREDENTIALS WHERE U_ID='"
					+ deleteFaculty.getFaculty_Id() + "';");
			// System.out.println(getFaculty.getFaculty_Id());
			ps.executeUpdate();

		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}

	}

	public void getDetails(StudentModel getStudent, String userid) {
		Connection c = null;
		PreparedStatement pstmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		dbc = new DBconnection();
		try {
			c = dbc.createConnection();

			pstmt = c
					.prepareStatement("select ADDRESS,DOB,F_NAME,L_NAME,EMAIL,PHONE,CURRENT_SEMESTER from STUDENT where S_ID=?");
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			while (rs.next()) {

				getStudent.setAddress(rs.getString(1));
				getStudent.setDob(rs.getDate(2));
				getStudent.setFname(rs.getString(3));
				getStudent.setLname(rs.getString(4));
				getStudent.setEmail(rs.getString(5));
				getStudent.setPhno(rs.getInt(6));
				getStudent.setSemester(rs.getString(7));

			}
			ps = c.prepareStatement("select PASSWORD from CREDENTIALS where U_ID=?");
			ps.setString(1, userid);
			rs = ps.executeQuery();
			while (rs.next()) {
				getStudent.setPassword(rs.getString(1));
			}

		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}

	}

	public int updateDetails(StudentModel updateStudent, String tok) {
		Connection c = null;
		PreparedStatement pstmt = null;
		PreparedStatement ps = null;
		// ResultSet rs = null;
		dbc = new DBconnection();
		int status = 0;
		try {
			c = dbc.createConnection();

			pstmt = c.prepareStatement("update STUDENT SET ADDRESS = ?" + ","
					+ "F_NAME = ? " + "," + "L_NAME = ?" + "," + "EMAIL = ?"
					+ "," + "PHONE = ?" + "," + "CURRENT_SEMESTER = ? "
					+ " where S_ID=?");
			pstmt.setString(7, tok);

			System.out.println(updateStudent.getSid() + "sdfg");
			pstmt.setString(1, updateStudent.getAddress());
			pstmt.setString(2, updateStudent.getFname());
			pstmt.setString(3, updateStudent.getLname());
			pstmt.setString(4, updateStudent.getEmail());
			pstmt.setInt(5, updateStudent.getPhno());
			pstmt.setString(6, updateStudent.getSemester());

			status = pstmt.executeUpdate();

			ps = c.prepareStatement("update CREDENTIALS SET PASSWORD = ? "
					+ "where U_ID='" + updateStudent.getSid() + "';");

			ps.setString(1, updateStudent.getPassword());
			ps.executeUpdate();
		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}
		return status;

	}

	public void deleteDetails(StudentModel deleteStudent) {
		Connection c = null;
		PreparedStatement pstmt = null;
		PreparedStatement ps = null;
		// ResultSet rs = null;
		dbc = new DBconnection();
		// int status=0;
		try {
			c = dbc.createConnection();

			pstmt = c.prepareStatement("DELETE FROM STUDENT WHERE S_ID='"
					+ deleteStudent.getSid() + "';");
			pstmt.executeUpdate();

			ps = c.prepareStatement("DELETE FROM CREDENTIALS WHERE U_ID='"
					+ deleteStudent.getSid() + "';");
			ps.executeUpdate();
		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}

	}

	public ArrayList<StudentModel> display(String RollNumber)
			throws ClassNotFoundException, SQLException {
		dbc = new DBconnection();
		Connection c = null;
		c = dbc.createConnection();

		ArrayList<StudentModel> u1 = new ArrayList<StudentModel>();
		System.out.println(RollNumber);
		PreparedStatement ps = c
				.prepareStatement("select * from STUDENT where S_ID =?");
		ps.setString(1, RollNumber);
		ResultSet rs = (ResultSet) ps.executeQuery();
		while (rs.next()) {
			StudentModel getStudentModel = new StudentModel();
			getStudentModel.setSid(rs.getString("S_ID"));
			getStudentModel.setEmail(rs.getString("EMAIL"));
			getStudentModel.setDestpath(rs.getString("PHOTO"));
			getStudentModel.setFname(rs.getString("F_NAME"));

			getStudentModel.setDob(rs.getDate("DOB"));
			u1.add(getStudentModel);

		}
		return u1;
	}

	public ArrayList<String> fetchallstudents() throws ClassNotFoundException,
			SQLException {
		dbc = new DBconnection();
		Connection c = null;
		c = dbc.createConnection();

		ArrayList<String> u1 = new ArrayList<String>();

		PreparedStatement ps = c
				.prepareStatement("select S_ID, F_NAME, L_NAME from STUDENT");
		ResultSet rs = (ResultSet) ps.executeQuery();
		while (rs.next()) {
			String list;
			rs.getString("S_ID");
			rs.getString("F_NAME");
			rs.getString("L_NAME");
			String concat = rs.getString("S_ID") + "-" + rs.getString("F_NAME")
					+ " " + rs.getString("L_NAME");
			list = concat;

			u1.add(list);
			System.out.println("list" + list);
		}
		return u1;
	}

	public ArrayList<String> fetchallsubject() throws ClassNotFoundException,
			SQLException {
		dbc = new DBconnection();
		Connection c = null;
		c = dbc.createConnection();

		ArrayList<String> u1 = new ArrayList<String>();

		PreparedStatement ps = c
				.prepareStatement("SELECT SUBJECT_ID, SUBJECT_NAME from SUBJECT");
		ResultSet rs = (ResultSet) ps.executeQuery();
		while (rs.next()) {
			String list;
			rs.getString("SUBJECT_ID");
			rs.getString("SUBJECT_NAME");
			// rs.getString("L_NAME");
			String concat = rs.getString("SUBJECT_ID") + "-"
					+ rs.getString("SUBJECT_NAME");
			list = concat;

			u1.add(list);
			System.out.println("list" + list);
		}
		return u1;
	}

	public ArrayList<String> fetchallFaculty() throws ClassNotFoundException,
			SQLException {
		dbc = new DBconnection();
		Connection c = null;
		c = dbc.createConnection();

		ArrayList<String> u1 = new ArrayList<String>();
		PreparedStatement ps = c
				.prepareStatement("select FACULTY_ID, FACULTY_NAME from FACULTY");
		ResultSet rs = (ResultSet) ps.executeQuery();
		while (rs.next()) {
			String list = rs.getString("FACULTY_ID") + "-"
					+ rs.getString("FACULTY_NAME");

			u1.add(list);
			System.out.println("list" + list);

		}
		return u1;
	}

	public static int Save(AddFacultyModel addFacultyModel) {

		dbc = new DBconnection();

		int status = 0;
		try {
			Connection c = (Connection) dbc.createConnection();

			PreparedStatement ps = c
					.prepareStatement("insert into FACULTY(FACULTY_ID,FACULTY_NAME,EMAIL) values(?,?,?)");
			ps.setString(1, addFacultyModel.getId());
			ps.setString(2, addFacultyModel.getName());
			ps.setString(3, addFacultyModel.getEmail());

			status = ps.executeUpdate();

			PreparedStatement pstmt = c
					.prepareStatement("insert into CREDENTIALS(PASSWORD,U_ID,ROLE) values(?,?,?);");
			pstmt.setString(1, addFacultyModel.getPassword());
			pstmt.setString(2, addFacultyModel.getId());
			pstmt.setString(3, "faculty");
			if (status != 0) {
				status = pstmt.executeUpdate();
			}

		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}
		return status;
	}

	// Vijaya Add Student

	public int Save(AddStudentModel sm) {

		Connection c = null;
		dbc = new DBconnection();
		int status = 0;
		try {
			c = dbc.createConnection();

			// System.out.println("Src File name: " + sm.getDestpath());
			// System.out.println("Dst File name: " + sm.getPhotoFileName());
			//File destFile = new File(sm.getDestpath(), sm.getPhotoFileName());
			System.out.println(sm.getServletRequest().getContextPath());
			File destFile = new File(sm.getServletRequest().getContextPath()+"/image", sm.getPhotoFileName());
			FileUtils.copyFile(sm.getPhoto(), destFile);
			// System.out.println(sm.getPhotoFileName());
			// System.out.println(sm.getDestpath());

			// System.out.println(sm.getEnroll());
			PreparedStatement ps = c
					.prepareStatement("insert into STUDENT(S_ID,ADDRESS,PHOTO,F_NAME,L_NAME,EMAIL,PHONE,CURRENT_SEMESTER,Birthplace015) values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, sm.getEnroll());
			ps.setString(6, sm.getEmail());
			ps.setString(4, sm.getName());
			ps.setString(7, sm.getContact());
			ps.setString(2, sm.getAddress());
			ps.setString(3, sm.getPhotoFileName());
			ps.setString(5, sm.getLastname());
			ps.setString(9, sm.getBirthplace015());
			// ps.setString(9,sm.getInterest());

			ps.setString(8, "1");
			status = ps.executeUpdate();
			PreparedStatement pstmt = c
					.prepareStatement("insert into CREDENTIALS(PASSWORD,U_ID,ROLE) values(?,?,?);");
			pstmt.setString(1, sm.getPassword());
			pstmt.setString(2, sm.getEnroll());
			pstmt.setString(3, "student");

			if (status != 0) {
				status = pstmt.executeUpdate();
			}
			System.out.println(status);
		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}
		return status;
	}

	public static void addSubject(ArrayList<SubjectModel> array)
			throws Exception {
		DBconnection db = new DBconnection();
		Connection con = db.createConnection();
		String query = "INSERT INTO SUBJECT(SUBJECT_ID,SYLLABUS,CREDIT,SPECIALIZATION,SUBJECT_NAME,SEMESTER) VALUES(?,?,?,?,?,?)";
		PreparedStatement prep1 = con.prepareStatement(query);

		prep1.setString(1, array.get(0).getSubject_Id());
		prep1.setString(2, array.get(0).getSyllabus());
		prep1.setString(3, array.get(0).getCredit());
		prep1.setString(4, array.get(0).getSpecialization());
		prep1.setString(5, array.get(0).getSubject_Name());
		prep1.setString(6, array.get(0).getSemester());
		int k = prep1.executeUpdate();
		if (k == 1)
			System.out.println(" DBhandler sucess");

	}

	public static void updateSubject(SubjectModel updateSubject) {

		java.sql.Connection c = null;
		PreparedStatement pstmt = null;
		// ResultSet rs = null;
		dbc = new DBconnection();
		// int status=0;
		try {
			c = dbc.createConnection();

			pstmt = c.prepareStatement("update SUBJECT SET SUBJECT_NAME = ?"
					+ "," + "SYLLABUS = ?" + ",CREDIT=?"
					+ ",SPECIALIZATION = ?" + ",SEMESTER = ?"
					+ " where FACULTY_ID='" + updateSubject.getSubject_Id()
					+ "';");
			// System.out.println(getFaculty.getFaculty_Id());
			pstmt.setString(1, updateSubject.getSubject_Name());
			pstmt.setString(2, updateSubject.getSyllabus());
			pstmt.setString(2, updateSubject.getCredit());
			pstmt.setString(2, updateSubject.getSpecialization());
			pstmt.setString(2, updateSubject.getSemester());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}

	}

	public static void deleteSubject(SubjectModel deleteSubject) {
		java.sql.Connection c = null;
		PreparedStatement pstmt = null;
		dbc = new DBconnection();
		try {
			c = dbc.createConnection();

			pstmt = c.prepareStatement("DELETE FROM SUBJECT WHERE SUBJECT_ID='"
					+ deleteSubject.getSubject_Id() + "';");
			// System.out.println(getFaculty.getFaculty_Id());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}

	}

	public ArrayList<NewsModel> getNews() {
		PreparedStatement ps = null;
		DBconnection db = new DBconnection();
		Connection con = db.createConnection();
		try {
			int i = 0;
			String sql;
			sql = "SELECT * FROM NEWSADD";
			ps = (PreparedStatement) con.prepareStatement(sql);

			System.out.println(" query" + sql);
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				NewsModel nm = new NewsModel();

				System.out.println(" rs=" + rs);
				nm.setNewsHeading(rs.getString(2));
				nm.setNewsDescription(rs.getString(3));

				news.add(i, nm);

				i++;
			}

		} catch (Exception e) {
			System.out.println("Error.." + e);
		}
		return news;
	}

	public static void updateGrades(User u) {

		try {
			int i = 0;

			String grade = null;
			String result = null;
			DBconnection db = new DBconnection();
			Connection con = db.createConnection();
			System.out.println("" + u.getSubject().get(i));
			for (i = 0; i < u.getSubject().size(); i++) {
				PreparedStatement ps1 = con
						.prepareStatement("select SUBJECT_ID from SUBJECT where SUBJECT_NAME =?");
				ps1.setString(1, u.getSubject().get(i));
				ResultSet rs = ps1.executeQuery();
				rs.next();
				System.out.println("subject id " + rs.getString(1));
				PreparedStatement ps = con
						.prepareStatement("update STU_SUB set marks=?, grade=?, result=? where SUBJECT_ID = ? and S_ID=?");
				ps.setInt(1, u.getMarks().get(i));
				if (u.getMarks().get(i) >= 80) {
					grade = "A";
					result = "PASS";
				}
				if (u.getMarks().get(i) >= 60 && u.getMarks().get(i) < 80) {
					grade = "B";
					result = "PASS";
				}
				if (u.getMarks().get(i) <= 60 && u.getMarks().get(i) > 40) {
					grade = "C";
					result = "PASS";
				}
				if (u.getMarks().get(i) < 40) {
					result = "FAIL";
					grade = "F";
				}
				ps.setString(2, grade);
				ps.setString(4, rs.getString(1));
				ps.setString(3, result);
				ps.setString(5, u.getS_id());

				ps.executeUpdate();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void searchSubject(User u) {
		ArrayList<String> subject = new ArrayList<String>();
		try {
			int i = 0;
			DBconnection db = new DBconnection();
			Connection con = db.createConnection();
			PreparedStatement ps1 = con
					.prepareStatement("select CURRENT_SEMESTER from STUDENT WHERE S_ID=?");
			ps1.setString(1, u.getS_id());
			ResultSet rs1 = ps1.executeQuery();
			rs1.next();
			String sem = rs1.getString(1);
			PreparedStatement ps = con
					.prepareStatement("select SUBJECT_NAME from SUBJECT where SEMESTER=? and SUBJECT_ID in(select SUBJECT_ID from STU_SUB WHERE S_ID=?)");
			ps.setString(1, sem);
			ps.setString(2, u.getS_id());
			// System.out.println(u.getS_id());
			// System.out.println("subject selected");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				subject.add(i, rs.getString(1));
				// System.out.println(subject.get(i));
				i++;
			}
			u.setSubject(subject);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	// admin handler ends

	public ArrayList<String> getSubjects(sis.model.User u, String sid) {
		int i = 0;

		ArrayList<String> list = new ArrayList<String>();

		try {
			System.out.println("Reached handler class");
			DBconnection db = new DBconnection();

			Connection con = db.createConnection();

			String query = "Select SUBJECT_NAME from SUBJECT where SEMESTER=? and SUBJECT_ID in (select SUBJECT_ID from STU_SUB where S_ID='"
					+ sid + "')";
			System.out.println(query);
			PreparedStatement stmt = con.prepareStatement(query);
			System.out.println("Executed query2");
			stmt.setInt(1, u.getSemlist());

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// User user=new User();
				System.out.println("in while of get subject");
				list.add(i, rs.getString(1));
				u.setValid("true");
				System.out.println(list.get(i));
				i++;

			}
			if (list.isEmpty()) {

				// u.setValid("true");
				list.add(u.getValid());

			}
		} catch (Exception e) {
			System.out.println("Error.." + e);
		}
		return list;
	}

	public void getFinancial(StudentModel student, FinancialModel usr)
			throws FileNotFoundException {
		try {
			DBconnection db = new DBconnection();
			Connection con = db.createConnection();

			String sql;
			// sql =
			// "select SEMESTER,TOTAL_FEE,FEE_PAID,PAY_DATE from ooad_db.STU_FEE where S_ID =' "
			// +output.getS_id()+"';";

			sql = "select SEMESTER,TOTAL_FEE,FEE_PAID,PAY_DATE from STU_FEE where S_ID=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, student.getSid());
			System.out.println(usr.getS_id());
			ResultSet rs = stmt.executeQuery();

			rs.next();

			usr.setSEMESTER(rs.getInt(1));
			// usr.setSEMESTER(rs.getString(1));
			usr.setTOTAL_FEE(rs.getString(2));
			usr.setFEE_PAID(rs.getString(3));
			usr.setPAY_DATE(rs.getDate(4));

		} catch (Exception e) {
			System.out.println("Error.." + e);
		}
	}

	static String image, role;

	public void checkdb(UserModel retrieve) throws FileNotFoundException {

		try {
			int a = 0;
			DBconnection db = new DBconnection();
			Connection po = db.createConnection();
			if (retrieve.getSession().isEmpty()) {
				retrieve.getSession().put("userid", retrieve.getUserid());
				String sid = (String) retrieve.getSession().get("userid");
				Sid = sid;
				System.out.println("userid in login" + sid);
				String sql;
				sql = "select ROLE from CREDENTIALS where U_ID= '"
						+ retrieve.getUserid() + "' and PASSWORD='"
						+ retrieve.getPwd() + "'";
				PreparedStatement stmt = po.prepareStatement(sql);
				// stmt.setString(1,retrieve.getUserid());
				// stmt.setString(2,retrieve.getPwd());
				ResultSet rs = stmt.executeQuery();
				PreparedStatement stmt1 = po
						.prepareStatement("select PHOTO from STUDENT where S_ID=?");
				stmt1.setString(1, retrieve.getUserid());
				ResultSet rs1 = stmt1.executeQuery();
				while (rs1.next()) {
					retrieve.setDestpath(rs1.getString(1));
					image = rs1.getString(1);
				}
				while (rs.next()) {
					a = 1;
					retrieve.setRole(rs.getString(1));
					role = rs.getString("ROLE");
					// System.out.println("m in while");
				}
				if (a == 0) {
					retrieve.setRole("NONE");
					System.out.println("m out of while");
				}

			} else {
				retrieve.setRole(role);
				retrieve.setDestpath(image);

			}

		}

		catch (Exception e) {
			System.out.println("Error.." + e);
		}

	}

	public StudentModel fetchInfo(StudentModel student) {

		DBconnection db = new DBconnection();
		Connection con = db.createConnection();

		String queryint = "select INTEREST from INTEREST";
		String query = "select F_NAME,L_NAME,ADDRESS,EMAIL,PHONE ,DOB,INTEREST from STUDENT where S_ID=?";
		try {

			PreparedStatement ps = null;
			PreparedStatement ps1 = null;

			ps = con.prepareStatement(query);
			ps1 = con.prepareStatement(queryint);

			ps.setString(1, student.getSid());
			ResultSet rs = ps.executeQuery();
			ResultSet rs1 = ps1.executeQuery();
			rs.next();
			while (rs1.next()) {

				interestAll.add(rs1.getString(1));

			}
			String fname = rs.getString(1);
			String lname = rs.getString(2);
			String address = rs.getString(3);

			String email = rs.getString(4);
			int phno = Integer.parseInt(rs.getString(5));
			Date dob = rs.getDate(6);
			StringTokenizer st = new StringTokenizer(rs.getString(7), ", \0");

			while (st.hasMoreTokens()) {
				;
				intereststudent.add(st.nextToken());

			}
			student.setFname(fname);
			student.setAddress(address);
			student.setLname(lname);
			student.setPhno(phno);
			student.setEmail(email);
			student.setDob(dob);

			student.setIntereststudent(intereststudent);
			student.setInterestAll(interestAll);
		} catch (Exception ex) {
			System.out.println("" + ex);

		}
		return student;
	}

	public ArrayList<GradeModel> getdetails(String sid, String sem) {
		PreparedStatement ps = null;
		DBconnection db = new DBconnection();

		Connection con = db.createConnection();
		try {
			int i = 0;
			String sql;
			sql = "SELECT SUBJECT.SUBJECT_ID,SUBJECT_NAME,GRADE,RESULT FROM STU_SUB,SUBJECT  where STU_SUB.SUBJECT_ID=SUBJECT.SUBJECT_ID AND S_ID= '"
					+ sid + "' and SEMESTER='" + sem + "'";
			ps = (PreparedStatement) con.prepareStatement(sql);

			// System.out.println(" query"+sql);
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				GradeModel gm = new GradeModel();

				// System.out.println(" rs="+rs);
				gm.setSubject_id(rs.getString("SUBJECT_ID"));
				gm.setSubject_name(rs.getString("SUBJECT_NAME"));
				gm.setGrade(rs.getString("GRADE"));
				gm.setResult(rs.getString("RESULT"));
				name.add(i, gm);

				System.out.println(name.get(i).getSubject_name());
				i++;
			}

			if (name.isEmpty()) {
				lm.setValid("false");
				name.add(i, lm);
			}

		} catch (Exception e) {
			System.out.println("Error.." + e);
		}
		return name;
	}

	public ArrayList<LibraryModel> searchBook(String sid) {

		ArrayList<LibraryModel> book_name = new ArrayList<LibraryModel>();

		try {
			int i = 0;
			System.out.println("in db serchbook");
			DBconnection db = new DBconnection();
			System.out.println("connection");
			Connection con = db.createConnection();
			PreparedStatement ps = (PreparedStatement) con
					.prepareStatement("SELECT * FROM LIBRARY where S_ID=?");
			ps.setString(1, sid);
			System.out.println("ps is" + ps);
			System.out.println("Issued Books");
			ResultSet rs = ps.executeQuery();
			System.out.println("rs is\n" + rs);
			while (rs.next()) {
				LibraryModel lm = new LibraryModel();
				System.out.println("in while rs");
				lm.setBook_name(rs.getString(3));
				lm.setIssued_Date(rs.getDate(4));// System.out.println("in search sub");
				lm.setReturn_Date(rs.getDate(5));// Date Return_date;
				lm.setFine(rs.getInt(6));
				System.out.println("in search sub" + lm.getBook_name());// Date
																		// Issue_date;

				book_name.add(i, lm);

				i++;
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return (book_name);
	}

	String interest = "";

	public void updateInfo(StudentModel studentinfo) {

		DBconnection db = new DBconnection();
		Connection con = db.createConnection();
		String query = "UPDATE STUDENT SET F_NAME= ?,L_NAME= ?,DOB= ?,ADDRESS= ?,EMAIL= ?,PHONE= ? ,INTEREST=? where S_ID=? ";
		try {

			System.out.println("sid new" + studentinfo.getSid() + "name"
					+ studentinfo.getFname() + "dob" + studentinfo.getDob());
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(8, studentinfo.getSid());
			ps.setString(1, studentinfo.getFname());
			ps.setString(2, studentinfo.getLname());
			ps.setString(4, studentinfo.getAddress());
			ps.setInt(6, studentinfo.getPhno());
			ps.setDate(3, studentinfo.getDob());
			ps.setString(5, studentinfo.getEmail());
			int limit = studentinfo.getIntereststudent().size();

			// System.out.println("lim"+limit);

			for (int i = 0; i < limit; i++) {
				String s = studentinfo.getIntereststudent().get(i) + " ,";

				interest = interest.concat(s);
			}
			// System.out.println("int"+interest);
			ps.setString(7, interest);
			// System.out.println("interest in db"+interest);
			ps.executeUpdate();
		} catch (Exception ex) {
			System.out.println("" + ex);

		}
	}

	public int insertStudentSubject(String subj, String tok1) {

		dbc = new DBconnection();

		int status = 0;
		try {
			Connection c = (Connection) dbc.createConnection();

			PreparedStatement ps = c
					.prepareStatement("select CURRENT_SEMESTER FROM STUDENT where S_ID =?");
			PreparedStatement ps1 = c
					.prepareStatement("select SEMESTER FROM SUBJECT where SUBJECT_ID =?");
			ps.setString(1, tok1);
			ps1.setString(1, subj);

			ResultSet rs1 = ps.executeQuery();
			String SEM = null, SEM1 = null;
			while (rs1.next()) {
				SEM = rs1.getString(1);
			}
			System.out.println(SEM + "asd");

			ResultSet rs2 = ps1.executeQuery();
			while (rs2.next()) {
				SEM1 = rs2.getString(1);
			}

			System.out.println(SEM1);
			if (SEM1.equalsIgnoreCase(SEM)) {

				ps = c.prepareStatement("insert into STU_SUB(S_ID,SUBJECT_ID) values(?,?)");
				ps.setString(1, tok1);
				ps.setString(2, subj);
				status = ps.executeUpdate();
			}

			else {
				return 0;
			}
		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}
		return status;
	}

	public ArrayList<StudentModel> fetchStudentSubject(
			StudentModel studentModel, String userid) {
		dbc = new DBconnection();
		ArrayList<StudentModel> al = new ArrayList<StudentModel>();
		int i = 0;
		try {
			Connection c = (Connection) dbc.createConnection();

			PreparedStatement ps = c
					.prepareStatement("select SUBJECT_NAME from SUBJECT where SUBJECT_ID in(select SUBJECT_ID from STU_SUB where S_ID = ?);");

			ps.setString(1, userid);
			ResultSet rs = ps.executeQuery();
			// System.out.println("GazalGupta");
			while (rs.next()) {
				StudentModel assignSubject = new StudentModel();
				// System.out.println("Dhruv shah");
				System.out.println(rs.getString(1));
				assignSubject.setSubject_Name(rs.getString(1));
				al.add(assignSubject);
				System.out.println(al.get(i).getSubject_Name() + "123");
				i++;

				System.out.println(assignSubject);

			}

		}

		catch (Exception e) {
			// e.getLocalizedMessage();
			e.printStackTrace();
		}
		return al;

	}

	public int insertFacultySubject(String sub, String tok) {
		dbc = new DBconnection();

		int status = 0;
		try {
			Connection c = (Connection) dbc.createConnection();

			PreparedStatement ps = c
					.prepareStatement("insert into FACULTY_SUB(FACULTY_ID,SUBJECT_ID) values(?,?)");
			ps.setString(1, tok);

			ps.setString(2, sub);

			status = ps.executeUpdate();
		} catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}
		return status;
	}

	public ArrayList<FacultyModel> fetchFacultySubject(FacultyModel facultyModel) {

		dbc = new DBconnection();
		ArrayList<FacultyModel> al = new ArrayList<FacultyModel>();
		int i = 0;
		try {
			Connection c = (Connection) dbc.createConnection();

			PreparedStatement ps = c
					.prepareStatement("select SUBJECT_NAME from SUBJECT where SUBJECT_ID in(select SUBJECT_ID from FACULTY_SUB where FACULTY_ID = '"
							+ facultyModel.getFaculty_Id() + "');");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				FacultyModel assignSubject = new FacultyModel();
				System.out.println(rs.getString(1));
				assignSubject.setSubject_Name(rs.getString(1));
				al.add(assignSubject);
				System.out.println(al.get(i).getSubject_Name());
				i++;
				System.out.println(assignSubject);
			}

		}

		catch (Exception e) {
			e.getLocalizedMessage();
			e.printStackTrace();
		}
		return al;

	}

	public static void InsertLibrary(LibraryModel lm) {
		try {

			DBconnection db = new DBconnection();
			Connection con = db.createConnection();

			PreparedStatement ps1 = con
					.prepareStatement("insert into LIBRARY values (?,?,?,?,?,?)");
			ps1.setString(1, lm.getS_ID());
			ps1.setString(2, lm.getBOOK_ID());
			ps1.setString(3, lm.getBook_name());
			ps1.setDate(4, lm.getIssued_Date());
			ps1.setDate(5, lm.getReturn_Date());
			ps1.setInt(6, lm.getFine());
			ps1.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int checkNoOfsubject(String tok1) {
		dbc = new DBconnection();
		int status = 1;
		try {
			Connection c = (Connection) dbc.createConnection();
			PreparedStatement ps = c
					.prepareStatement("select SUBJECT_ID from STU_SUB where S_ID = ? and SUBJECT_ID in( select SUBJECT_ID from SUBJECT where SEMESTER = (select CURRENT_SEMESTER from STUDENT where S_ID = ?));");
			ps.setString(1, tok1);
			ps.setString(2, tok1);
			int count = 0;
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				count++;
			}
			if (count == 4) {
				status = 0;
			}

			else {
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public ArrayList<InterestModel> searchInterest() {

		ArrayList<InterestModel> Interest_name = new ArrayList<InterestModel>();

		try {
			int i = 0;
			DBconnection db = new DBconnection();
			System.out.println("connection");
			Connection con = db.createConnection();
			PreparedStatement ps = (PreparedStatement) con
					.prepareStatement("SELECT * FROM INTEREST");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				InterestModel nm = new InterestModel();
				System.out.println("in while rs");
				nm.setInterest(rs.getString(2));
				Interest_name.add(i, nm);
				i++;
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return (Interest_name);
	}

	public void insertInterest(ArrayList<InterestModel> array) throws Exception {
		System.out.println("insert Interest");
		DBconnection db = new DBconnection();
		Connection con = (Connection) db.createConnection();
		System.out.println("Interest is :" + array.get(0).getInterest());
		String query = "INSERT INTO INTEREST (INTEREST) VALUES(?)";
		PreparedStatement prep1 = con.prepareStatement(query);
		prep1.setString(1, array.get(0).getInterest());
		prep1.execute();
	}

	// friend ..............

	static String frndname, address, id, Sid;

	ArrayList<FriendModel> fname = new ArrayList<FriendModel>();

	public ArrayList<FriendModel> retriveFriend() {
		PreparedStatement ps = null;
		DBconnection db = new DBconnection();

		Connection con = db.createConnection();

		try {
			int i = 0;
			String sql;
			System.out.println("SID in frnd function:" + Sid);
			sql = "SELECT FRIEND_ID ,FRIEND_NAME from FRIEND where S_ID=?";
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, Sid);
			System.out.println(" query" + sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				FriendModel fm = new FriendModel();

				System.out.println(" rs=" + rs);
				fm.setFriend_name(rs.getString("FRIEND_NAME"));
				fm.setFriend_id(rs.getString("FRIEND_ID"));

				fname.add(i, fm);

				i++;
			}

		} catch (Exception e) {
			System.out.println("Error.." + e);
		}
		return fname;

	}

	public ArrayList<StudentModel> retriveTestFriend() {
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
		ArrayList<StudentModel> fname = new ArrayList<StudentModel>();
		DBconnection db = new DBconnection();

		Connection con = db.createConnection();

		try {
			int i = 0;
			String sql, sql2, bp = null;
			// System.out.println("SID in frnd function:"+Sid);
			sql2 = "SELECT BIRTHPLACE015 from STUDENT where S_ID=?";

			ps1 = (PreparedStatement) con.prepareStatement(sql2);
			ps1.setString(1, Sid);
			ResultSet rs1 = ps1.executeQuery();
			while (rs1.next()) {
				bp = rs1.getString(1);
			}
			sql = "SELECT S_ID ,F_NAME,CURRENT_SEMESTER from FRIEND where S_ID=?";
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, bp);
			System.out.println(" query" + sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StudentModel fm = new StudentModel();
				fm.setSid(rs.getString(1));
				fm.setFname(rs.getString(2));

				fm.setSemester(rs.getString(2));

				fname.add(i, fm);

				i++;
			}
		} catch (Exception e) {
			System.out.println("Error.." + e);
		}
		return fname;

	}

	// frind detail show................
	static String delectfrnd;

	public void showFriendDetail(FriendModel fm) {

		DBconnection db = new DBconnection();

		Connection con = db.createConnection();

		try {

			String sql;
			sql = "SELECT F_NAME,ADDRESS,PHOTO,PHONE from SIS.STUDENT where S_ID=?";

			PreparedStatement prep1 = con.prepareStatement(sql);

			prep1.setString(1, fm.getSelectfrnd());
			fm.setDelFrnd(fm.getSelectfrnd());
			delectfrnd = fm.getSelectfrnd();
			System.out.println("delet id:" + fm.getDelFrnd());
			ResultSet rs = prep1.executeQuery();
			while (rs.next()) {
				fm.setFrndtry_name(rs.getString("F_NAME"));

				fm.setFrnd_Address(rs.getString("ADDRESS"));
				fm.setDestpath(rs.getString("PHOTO"));
				fm.setFrnd_phone(rs.getString("PHONE"));
				System.out.println("fname" + rs.getString("F_NAME"));
			}
			System.out.println(fm.getFrndtry_name());
			System.out.println(fm.getFrnd_Address());
			System.out.println(fm.getFrnd_phone());
			String p = "image/" + fm.getDestpath();
			fm.setDestpath(p);
			System.out.println(fm.getDestpath());
		} catch (Exception e) {
			System.out.println("Error.." + e);
		}
	}

	// delete frind----------------------

	public void deletFrnd(FriendModel fm) {

		DBconnection db = new DBconnection();
		Connection con = db.createConnection();

		try {
			String sql;
			sql = "delete  FROM SIS.FRIEND where FRIEND_ID=?";

			PreparedStatement prep1 = con.prepareStatement(sql);
			System.out.println("selected" + delectfrnd);
			prep1.setString(1, delectfrnd);

			prep1.executeUpdate();
			System.out.println("suscesss");
		} catch (Exception e) {
			System.out.println("Error.." + e);
		}

	}

	public void srchFrnd(FriendModel fm) {

		DBconnection db = new DBconnection();

		Connection con = db.createConnection();

		try {

			String sql;
			sql = "SELECT F_NAME,ADDRESS from SIS.STUDENT where S_ID=?";

			PreparedStatement prep1 = con.prepareStatement(sql);

			prep1.setString(1, fm.getSrch_frnd());

			ResultSet rs = prep1.executeQuery();
			while (rs.next()) {
				fm.setFrndtry_name(rs.getString("F_NAME"));

				fm.setFrnd_Address(rs.getString("ADDRESS"));
				System.out.println("fname" + rs.getString("F_NAME"));
				frndname = fm.getFrndtry_name();
				address = fm.getFrnd_Address();
				id = fm.getSrch_frnd();
				System.out.println("id" + id + frndname);
				fm.setCheck(true);
			}
			System.out.println(fm.getFrndtry_name());
			System.out.println(fm.getFrnd_Address());
		} catch (Exception e) {
			System.out.println("Error.." + e);
		}
	}

	// ADD frnds to database frnd table

	public void insertfrnd(FriendModel f) {

		DBconnection db = new DBconnection();

		Connection con = db.createConnection();
		FriendModel fm = new FriendModel();
		try {

			String sql;
			System.out.println("in handler start");
			System.out.println("sid" + Sid);
			System.out.println(fm.getFrndtry_name() + fm.getSrch_frnd());
			sql = "insert into SIS.FRIEND (S_ID,FRIEND_NAME,FRIEND_ID) values(?,?,?)";
			PreparedStatement prep1 = con.prepareStatement(sql);
			prep1.setString(1, Sid);
			prep1.setString(2, frndname);
			prep1.setString(3, id);
			prep1.execute();
			System.out.println(id + frndname);
			System.out.println("handlerfethched");
		} catch (Exception e) {
			System.out.println("Error.." + e);
		}
	}

}
