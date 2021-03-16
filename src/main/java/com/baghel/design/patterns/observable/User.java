package com.baghel.design.patterns.observable;
import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
	private String userId;
	private String name;
	
	
	
	public User(String userId, String name) {
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
		if(o instanceof Product) {
			Product p = (Product)o;
			if(p.getNumberOfAvailableProducts() > 0) {
				sendNotification(p);
			}
		}
		
	}

	private void sendNotification(Product p) {
		System.out.println(this.toString() + " is notified successfully about the availability of "+p.toString());
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + "]";
	}
	
	

}
