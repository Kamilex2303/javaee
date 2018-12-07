package com.example.servletdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletdemo.domain.Pen;

public class StorageService {
	
	private List<Pen> db = new ArrayList<Pen>();
	private List<Pen> shoppingCart = new ArrayList<Pen>();
	
	public void addToDatabase(Pen pen) {
		Pen newPen = new Pen(pen.getId(), pen.getProducer(), pen.isBlack(), pen.getDateOfProduction(), pen.getSize());
		db.add(newPen);
	}
	
	public void addToShoppingCart(Pen pen) {
		Pen newPen = new Pen(pen.getId(), pen.getProducer(), pen.isBlack(), pen.getDateOfProduction(), pen.getSize());
		shoppingCart.add(newPen);
	}
	
	public List<Pen> getAllPens() {
		return db;
	}
	
	public List<Pen> getShoppingCart() {
		return shoppingCart;
	}

}
