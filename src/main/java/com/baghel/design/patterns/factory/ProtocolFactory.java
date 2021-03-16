package com.baghel.design.patterns.factory;
public class ProtocolFactory {
	
	public static Protocol getProtocol(String type)
	{
		
		if("SMTP".equalsIgnoreCase(type))
			return new SmtpProtocol();
		else if("IMAP".equalsIgnoreCase(type))
			return new ImapProtocol();
		return null;
	}

}
