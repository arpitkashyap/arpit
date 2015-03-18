 <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="AdminHome.jsp">
                       Home
                    </a>
                </li>
                <li>
                    <a href="First.jsp">Register</a>
                </li>
                <li>
                	 <a href="GetDetail">Modify</a>
                </li>
                <li>
                    <a href="AddNews.jsp">News</a>
                </li>
                <li>
                    <a href="AddAnnouncement.jsp">Announcement</a>
                </li>
                <li>
                <s:url id="url" action="ShowInterest">
                </s:url>
                 <s:a href="%{url}" >Interest</s:a>
                 </li>
                 <li>
                <s:url id="urltest" action="testInterest">
                </s:url>
                 <s:a href="%{urltest}" >Test Interest</s:a>
                 </li>
                <li>
                 <s:url id="urlann" action="AnnInterest">
                </s:url>
                
                    <s:a href="%{urlann}">Announcement</s:a>
                </li>
                <li>
                    <a href="AddSubject.jsp">Add Subject</a>
                </li>
                <li>
                    <a href="UpdateGrades.jsp">Update Grades</a>
                </li>
                <li>
                    <a href="AssignSubjectFaculty">Assign Faculty Subjects</a>
                </li>
                   <li>
                    <a href="AssignSubjectStudent">Assign Student Subjects</a>
                </li>
                 <li>
                    <a href="LibraryAdmin.jsp">Library</a>
                </li>
                <li>
                    <a href="FinancialInsert.jsp">Financial</a>
                </li>
                 <li>
                    <a href="Contact.jsp">Contact</a>
                </li>
                
                <li>
                    <a href="logout">Logout</a>
                </li>
           
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid" align="center">
                <div class="row">
                    <div class="col-lg-12">
                        <h1>Student Information System</h1>
                       
                    </div>
                </div>
            </div>
             <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Menu</a>
               <!-- /#page-content-wrapper -->

</div>
