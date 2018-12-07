package com.example.servletdemo.domain;
import java.util.*;
import java.text.ParseException;

public class Pen {

	private long id;
	private String producer;
	private boolean isBlack;
	private String dateOfProduction;
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

	public String getDateOfProduction() {
		return dateOfProduction;
	}

	public void setDataOfProduction(String dateOfProduction) throws ParseException{
		this.dateOfProduction = dateOfProduction;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String toString() {
		return "Pen [id=" + this.id + ", producer=" + this.producer + ", isBlack=" + this.isBlack + ", dateOfProduction="
				+ this.dateOfProduction + ", size=" + this.size + "]";
	}

	public Pen(long id ,String producer, boolean isBlack, String dateOfProduction, double size) {
		super();
		this.id = id;
		this.producer = producer;
		this.isBlack = isBlack;
		this.dateOfProduction = dateOfProduction;
		this.size = size;
	}
	
	public Pen() {
		super();
	}
}
