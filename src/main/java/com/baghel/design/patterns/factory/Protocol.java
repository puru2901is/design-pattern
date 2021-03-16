package com.baghel.design.patterns.factory;
public abstract class Protocol {

		protected String mail;
		
		public abstract void sendMail(String content);
		
		public abstract boolean receiveMail();
		
}
