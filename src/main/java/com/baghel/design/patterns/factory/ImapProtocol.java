package com.baghel.design.patterns.factory;

public class ImapProtocol extends Protocol{

	@Override
	public void sendMail(String content) {
		System.out.println("send Mail by imap : "+content);
		
	}

	@Override
	public boolean receiveMail() {
		System.out.println("mail received by imap");
		return true;
	}

}
