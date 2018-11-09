package com.example.servletdemo.domain;


import java.util.Date;

public class Pen {

	private long id;
	private String producer;
	private boolean isBlack;
	private Date dataOfProduction;
	private double size;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public boolean isBlack() {
		return isBlack;
	}

	public void setBlack(boolean isBlack) {
		this.isBlack = isBlack;
	}

	public Date getDataOfProduction() {
		return dataOfProduction;
	}

	public void setDataOfProduction(Date dataOfProduction) {
		this.dataOfProduction = dataOfProduction;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Pen [id=" + id + ", producer=" + producer + ", isBlack=" + isBlack + ", dataOfProduction="
				+ dataOfProduction + ", size=" + size + "]";
	}

	public Pen(long id ,String producer, boolean isBlack, java.util.Date dateOfProduction, double size) {
		super();
		this.id = id;
		this.producer = producer;
		this.isBlack = isBlack;
		this.dataOfProduction = dateOfProduction;
		this.size = size;
	}
}
