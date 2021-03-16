package com.baghel.design.patterns.factory;
public class SmtpProtocol extends Protocol {

	@Override
	public void sendMail(String content) {
		System.out.println("Send mail : "+ content);
		mail = content;
	}

	@Override
	public boolean receiveMail() {
		if(!mail.isEmpty()) {
			System.out.println("mail received by smtp. And mail content is : "+ mail);
			return true;
		}
		return false;
	}

}
