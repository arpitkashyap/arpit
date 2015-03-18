package sis.action;

import sis.db.*;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.opensymphony.xwork2.ActionSupport;

import sis.model.AddStudentModel;

import com.opensymphony.xwork2.ModelDriven;

public class AddStudentAction extends ActionSupport implements ModelDriven<AddStudentModel> {

	public AddStudentModel addStudentModel=new AddStudentModel() ;
	private static final long serialVersionUID = 8472136069243128329L;
	
	 /*
    private String from = "guptagazal9@gmail.com";
    private String password = "prankzgazal09";
    private String to=" ";
    private String subject=" Welcome to IIIT B. ";   
  
     private String body = " ";

   static Properties properties = new Properties();
   static
   {
	   properties.put("mail.smtp.host", "smtp.gmail.com");
	      properties.put("mail.smtp.socketFactory.port", "465");
	      properties.put("mail.smtp.socketFactory.class",
	                     "javax.net.ssl.SSLSocketFactory");
	      properties.put("mail.smtp.auth", "true");
	      properties.put("mail.smtp.port", "465");
   }
	*/
	
	
	   
	   	
	   				DBhandler studentDb; 
		         public String execute()
		         {  
		        	/* to=addStudentModel.getEmail();
		        	 subject=" Welcome to IIIT B. ";
		        	 System.out.println("to"+to);
		        	 */try
		        	 {
		        		 
		        	 studentDb = new  DBhandler();
		        	 System.out.println("addstudentmodel"+addStudentModel.getAddress());
		        	 int i= studentDb.Save(addStudentModel);  
		        	 
		        	 //Email Code
		        	/* body= "Your IIITB Id is "+addStudentModel.getEnroll()+"and your password is:"+addStudentModel.getPassword();
		             Session session = Session.getDefaultInstance(properties,  
		             new javax.mail.Authenticator() { 
		             protected PasswordAuthentication
		             getPasswordAuthentication() {
		             return new
		             PasswordAuthentication(from,password);
		             }});
		             Message message=new MimeMessage(session);
		             
		             message.setFrom(new InternetAddress(from));
		             message.setRecipients(Message.RecipientType.TO, 
		                InternetAddress.parse(to));
		             
		          message.setSubject(subject);
		          message.setText(body);
		          Transport.send(message);
		          */
		        	 if(i>0)
		        	 {  
		        		 return "success";  
		        	 }  
		        	 return "error";  
		         } 
		         
		         catch(Exception e)
		         {
		        	 e.printStackTrace();
		        	 return("failure");
		         }
		         }
				/*public static Properties getProperties() {
					return properties;
				}
				public static void setProperties(Properties properties) {
					AddStudentAction.properties = properties;
				}*/
				@Override
				public AddStudentModel getModel() {
					// TODO Auto-generated method stub
					return addStudentModel;
				}
				
		
}
