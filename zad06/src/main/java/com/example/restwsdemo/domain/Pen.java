package com.example.restwsdemo.domain;

public class Pen {

	private int id;
	private String producer;
	private double size;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Pen [id=" + id + ", producer=" + producer +", size=" + size + "]";
	}

	public Pen(int id ,String producer, double size) {
		super();
		this.id = id;
		this.producer = producer;
		this.size = size;
	}
}