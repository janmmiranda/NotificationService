package com.sapient.NotificationService.Entity;

import java.util.Date;

public class Trade {
	
	int tradeId;
	
	/*
	 * True  Buy
	 * False Sell
	 */
	Boolean side;
	/*
	 * True  Completed
	 * False Open
	 */
	Boolean status;
	
	int quantity;
	float price;
	Date date;
	
	String commodity;
	String counterParty;
	String location;
	
	public Boolean getSide() {
		return side;
	}
	public void setSide(Boolean side) {
		this.side = side;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getCounterParty() {
		return counterParty;
	}
	public void setCounterParty(String counterParty) {
		this.counterParty = counterParty;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTradeId() {
		return tradeId;
	}
	
	public Trade() {
		super();
	}
	
	public Trade(Boolean side, int quantity, float price, Date date) {
		this.side = side;
		this.status = false;
		this.quantity = quantity;
		this.price = price;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "TradeEntity [tradeId=" + tradeId + ", side=" + side + ", status=" + status + ", quantity=" + quantity
				+ ", price=" + price + ", date=" + date + ", commodity=" + commodity + ", counterParty=" + counterParty
				+ ", location=" + location + "]";
	}
	
	
}

