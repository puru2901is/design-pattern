package com.baghel.design.patterns.observable;
import java.util.Observable;
import java.util.Observer;

public class Product extends Observable {

	private String productId;
	private int numberOfAvailableProducts;
	private int price;
	
	public Product(String productId) {
		this.productId = productId;
	}
	
	public Product(String productId,int price) {
		this.productId = productId;
		this.price = price;
	}
		
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		this.setChanged();
		this.notifyObservers(price);
	}

	public int getNumberOfAvailableProducts() {
		return numberOfAvailableProducts;
	}

	public void setNumberOfAvailableProducts(int availableNumberOfProducts) {	
			this.numberOfAvailableProducts = availableNumberOfProducts;
			this.setChanged();
			this.notifyObservers();
	}


	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	@Override
	public synchronized void addObserver(Observer o) {
		System.out.println("Subscribing "+ o.toString()+ " for notification of "+ this.toString());
		super.addObserver(o);
	}
	
	@Override
	public synchronized void deleteObserver(Observer o) {
		System.out.println("Un-subscribing "+ o.toString()+ " for notification of "+ this.toString());
		super.deleteObserver(o);
	}
	
	@Override
	public void notifyObservers() {
		System.out.println("Notifying observers for availability of "+ this.toString());
		super.notifyObservers();
		
	}

	@Override
	public void notifyObservers(Object args) {
		System.out.println("Notifying observers for availability of "+ this.toString());
		super.notifyObservers(args);
		
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + "]";
	}
}
