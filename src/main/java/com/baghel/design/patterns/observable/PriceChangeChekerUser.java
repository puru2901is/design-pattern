package com.baghel.design.patterns.observable;

import java.util.Observable;
import java.util.Observer;

public class PriceChangeChekerUser implements Observer {

	private String userId;
	private String name;
	
	
	public PriceChangeChekerUser(String userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof Integer) {
			sendPriceChangeNotification((int)arg);
		}
		
	}
	
	private void sendPriceChangeNotification(int price) {
		System.out.println(this.toString() + " is notified price is changed "+ price);

	}

	@Override
	public String toString() {
		return "PriceChangeChekerUser [userId=" + userId + ", name=" + name + "]";
	}
	
	
	
}
