package com.shad.SpringBootRest.entity;

import java.util.TreeMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String pnr;
	private String date;
	private int trainNo;
	
	public int getPassenger1Id() {
		return passenger1Id;
	}
	public void setPassenger1Id(int passenger1Id) {
		this.passenger1Id = passenger1Id;
	}
	public int getPassenger2Id() {
		return passenger2Id;
	}
	public void setPassenger2Id(int passenger2Id) {
		this.passenger2Id = passenger2Id;
	}
	public int getPassenger3Id() {
		return passenger3Id;
	}
	public void setPassenger3Id(int passenger3Id) {
		this.passenger3Id = passenger3Id;
	}
	private int passenger1Id;
	private int passenger2Id;
	private int passenger3Id;

	
//	private TreeMap<Customer,Integer> passengers = new TreeMap<Customer,Integer>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
//	public TreeMap<Customer, Integer> getPassengers() {
//		return passengers;
//	}
//	public void setPassengers(TreeMap<Customer, Integer> passengers) {
//		this.passengers = passengers;
//	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", pnr=" + pnr + ", date=" + date + ", trainNo=" + trainNo  + "]";
	}
	
}