package sis.action;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExamScheduleAction {
	private InputStream fileStream1;
	public InputStream getFileStream1() {
		return fileStream1;
	}
	public void setFileStream1(InputStream fileStream1) {
		this.fileStream1 = fileStream1;
	}
	/*public void setFileStream(InputStream arg) {
		fileStream1 = arg;
	}
	public InputStream getFileStream() {
		return fileStream;
	}*/
	public String examScheduleDownload() throws Exception {
		try{
			fileStream1 = new DataInputStream(
			  new FileInputStream("/home/arpit/workspace/DSIS/WebContent/Examschedule.pdf"));
		} catch (IOException ioEx) {
			ioEx.printStackTrace();
		}
		return "exam-schedule";
	}
}