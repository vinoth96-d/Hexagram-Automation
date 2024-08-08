package com.Hexagon.pom.util;

	
	import java.io.File;
	import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


import javax.mail.Message;
	import javax.mail.MessagingException;
	import javax.mail.Multipart;
	import javax.mail.PasswordAuthentication;
	import javax.mail.Session;
	import javax.mail.Transport;
	import javax.mail.internet.InternetAddress;
	import javax.mail.internet.MimeBodyPart;
	import javax.mail.internet.MimeMessage;
	import javax.mail.internet.MimeMultipart;

import com.Hexagon.base.BasePage;
import com.Hexagon.base.BaseProjectMethods;
import com.Hexagon.pom.testcases.MoneyMarket_FullMaturity_MultiCurrency.MM_Full_FutureDate_ChangeINT;

	public class SendMail extends BaseProjectMethods {
	

	    public static void mail(String name) {
	      
	    	DateFormat dform = new SimpleDateFormat(" d MMM yyyy HH:mm:ss");
	    	Date obj = new Date();
	    	String date=dform.format(obj);
	    	
	    	
	    	
	    	   Date thisdate =new Date();
		       SimpleDateFormat dateformat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
		       String date1=dateformat.format(thisdate);
	    	
	        //Recipient's email ID:
	        String toID = "vinothleo96@gmail.com";
	        //Sender's email ID:
	         String fromID = "vinoth.periyasamy@ta3s.com";
	        //Sender's Email Password:
	         String password = "94869@vinoth.p";
	        //Subject of the Email:
	        String subject = "Hexagram - "+ name + date +" - Successful!";
	        //Body of the Email:
	        String bodyText ="Hi Team,"
	        		+ "\r\n"
	        		+ "\r\n"
	        		+ "Please find out the attached Test and Loadtime report."
	        		+ "\r\n"
	        		+ "\r\n"
	        		+ "Project Name - Hexagram"
	        		+ "\r\n"
	        		+ "Date and Time - " + date1
	        		+ "\r\n"
	        		+ "Status - PASS"
	        		+ "\r\n"
	        		+ "\r\n"
	        		+ "Thank you,"
	        		+ "\r\n"
	        		+ "Automation Team";
	        //Change the location of the required attachment file, the format can by anything like jpg, png, pdf etc:
	    //    String path = System.getProperty("user.dir") + "/extentreports/Hexagram.xlsx";
	        String path1 = System.getProperty("user.dir") + "/extentreports.zip";
	        String attachmentLocation = path1;
	 //       String attachmentLocation1 = path;
		       
	        // Host is Gmail's SMTP
	        String host = "smtp.gmail.com";
	        //Getting system properties
	        Properties pr = System.getProperties();
	        
	        //Setting up Email server
	        pr.put("mail.smtp.host", host);
	        pr.put("mail.smtp.port", "465");
	        pr.put("mail.smtp.ssl.enable", "true");
	        pr.put("mail.smtp.auth", "true");

	        //pass the Email and password to the session object
	        Session ss = Session.getInstance(pr, new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(fromID, password);
	            }
	        });

	        try {
	            MimeMessage mm = new MimeMessage(ss);
	            //Set the 'From:' header field
	            mm.setFrom(new InternetAddress(fromID));
	            //Set the 'To:' header field
	            mm.addRecipient(Message.RecipientType.TO, new InternetAddress(toID));
	            //Set the 'Subject:' header field
	            mm.addRecipients(Message.RecipientType.CC,InternetAddress.parse(""));
	            mm.setSubject(subject);

	            MimeBodyPart attachment = new MimeBodyPart();
	       //     MimeBodyPart attachment1=new MimeBodyPart();
	            MimeBodyPart text = new MimeBodyPart();
	            
	            //Change the location of the attachment file:
	            File file = new File(attachmentLocation);
	            attachment.attachFile(file);
	            
	        //    File file1 = new File(attachmentLocation1);
	        //    attachment1.attachFile(file1);
	            
	            //Set the actual message of the Email:
	            text.setText(bodyText);

	            Multipart mp = new MimeMultipart();
	            mp.addBodyPart(text);
	            mp.addBodyPart(attachment);
	       //     mp.addBodyPart(attachment1);
	            
	            mm.setContent(mp);
	            
	            System.out.println("sending the Email...");
	            //send the mail:
	            Transport.send(mm);
	            System.out.println("\nEmail sent successfully!!");
	            
	        } 
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


