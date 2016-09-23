package com.customized.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
/**
 * 
 * @author gu
 * 邮件发送类
 *
 */
public class SendEmail {
	private static JavaMailSenderImpl mailSender;
    private static SimpleMailMessage simpleMailMessage; 
    /**
     * @param subject 邮件主题
     * @param content 邮件正文(文本)
     * @param to 目标邮箱
     * @see 文本邮件发送方法
     */
    public  static void  sendMail(String subject, String content, String to) {
        simpleMailMessage.setSubject(subject); //设置邮件主题
        simpleMailMessage.setTo(to);             //设定收件人
        simpleMailMessage.setText(content);  //设置邮件主题内容
        mailSender.send(simpleMailMessage); //发送邮件
    }
    /**
     * 
     * @param subject 邮件主题
     * @param htmlcontent 邮件正文(html)
     * @param to 目标邮箱
     * @throws MessagingException 发送失败
     * @see html邮件发送方法
     */
    public static void sendHTMLMail(String subject, String htmlcontent, String to) throws MessagingException{
      MimeMessage mimeMsg = mailSender.createMimeMessage();
	  MimeMessageHelper helper = new MimeMessageHelper(mimeMsg , true, "utf-8");  
	  helper.setTo(to); // 发送给谁  
	  helper.setSubject(subject); // 标题 
	  helper.setFrom(simpleMailMessage.getFrom());
	  // 邮件内容，第二个参数指定发送的是HTML格式
	  helper.setText(htmlcontent,true);  
	  mailSender.send(mimeMsg); // 发送 
    }
    
    public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
        SendEmail.simpleMailMessage = simpleMailMessage;
    }

	public void setMailSender(JavaMailSenderImpl mailSender) {
		SendEmail.mailSender = mailSender;
	}
	public JavaMailSenderImpl getMailSender() {
		return SendEmail.mailSender;
	}
	public SimpleMailMessage getSimpleMailMessage() {
		return SendEmail.simpleMailMessage;
	}
    
}
