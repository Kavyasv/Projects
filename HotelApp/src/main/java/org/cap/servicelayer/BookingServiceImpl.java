package org.cap.servicelayer;

import java.util.List;

import org.cap.daolayer.IBookingDAO;
import org.cap.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookingService")
public class BookingServiceImpl implements IBookingService {

	@Autowired
private	IBookingDAO bookingDao;

	@Override
	public List<Client> getHotelDetails() {
		/**
		
		 Method:displayHotelDetails
		 purpose: To get all hotel rooms available
		 		 Date:28th,july,2018
		**/
		
		return bookingDao.getHotelDetails();
	}

	@Override
	public Client findHotelName(String hname) {
		/**
		
		 Method:findHotelName
		 purpose:This method gets the rooms from DAO layer
		 		 Date:28th,july,2018
		**/
		
		return bookingDao.findHotelName(hname);
	}
}
