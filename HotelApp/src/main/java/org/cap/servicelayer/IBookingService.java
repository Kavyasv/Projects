package org.cap.servicelayer;

import java.util.List;

import org.cap.model.Client;

public interface IBookingService {

public	List<Client> getHotelDetails();

public Client findHotelName(String hname);



}
