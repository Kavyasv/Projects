package org.cap.daolayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.cap.model.Client;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("bookingDao")
@Transactional
public class BookingDAOImpl implements IBookingDAO {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Client> getHotelDetails() {
		
		/**
		
		 Method:getHotelDetails
		 purpose:This method gets the rooms from the database
		 		 Date:28th,july,2018
		**/
		
		List<Client> clients=entityManager.createQuery("from Client").getResultList();
		return clients;
	}

	@Override
	public Client findHotelName(String hname) {
		
		/**
		
		 Method:findHotelName
		 purpose:This method finds the room from the database
		 		 Date:28th,july,2018
		**/
		Query query=entityManager.createQuery("from Client where name=?");
		query.setParameter(0, hname);
		List<Client>hotelname=query.getResultList();
		return hotelname.get(0);
	}
	
}
