package org.cap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="hoteldetails")
@Entity
public class Client {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String rating;
	private double rate;
	private int availableRooms;
	public Client() {
	}
	public Client(int id, String name, String rating, double rate, int availableRooms) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.rate = rate;
		this.availableRooms = availableRooms;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getAvailableRooms() {
		return availableRooms;
	}
	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}
	/*@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", rating=" + rating + ", rate=" + rate + ", availableRooms="
				+ availableRooms + "]";
	}*/
	
}
