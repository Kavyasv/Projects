package org.cap.daolayer;

import java.util.List;

import org.cap.model.Client;

public interface IBookingDAO {
	public	List<Client> getHotelDetails();
	public Client findHotelName(String hname);
}
