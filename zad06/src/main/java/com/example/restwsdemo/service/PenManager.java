package com.example.restwsdemo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ejb.Singleton;

import com.example.restwsdemo.domain.Pen;

@Singleton
public class PenManager {
	
	private List<Pen> db = Collections.synchronizedList(new ArrayList<>());

	public void addPen(Pen pen) {
		db.add(pen);
	}

	public void deletePen(Pen pen){
		db.remove(pen);
 	}
	
	public Pen getPen(int id) {
		return db.get(id);
	}
	
	public void updatePen(int id, String producer, double size) {
		Pen p = db.get(id);
		p.setSize(size);
		p.setProducer(producer);
	}
	
	public List<Pen> getAllPens(){
		return db;
	}
	
	public void deleteAllPens(){
		db.clear();
	}
}