package org.cap.springcontroller;

import java.util.List;

import org.cap.model.Client;
import org.cap.servicelayer.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookingController {
	
	/**
	 Author:Kavya S.V.
	 Method:Controller
	 purpose: To navigate to all the services avaliable
	 
	 Date:28th,july,2018
	**/

	@Autowired
	private IBookingService bookingService;
	private String clName;
		
	@RequestMapping("/")
	public String displayHotelDetails(ModelMap map) {
		List<Client> clients=bookingService.getHotelDetails();
		

		/**
		
		 Method:displayHotelDetails
		 purpose: To get all hotel rooms available
		 		 Date:28th,july,2018
		**/
		
		map.put("clients",clients);
		
		return "HotelDetails";
		
	}
	
/*	@RequestMapping("/HotelBooking/{name}")
	private String bookHotel(@PathVariable("id") String name,ModelMap map) {

		*//**
		Method:bookHotel
		 
		 purpose: To book the room
		 		 Date:28th,july,2018
		**//*
		
		Client client=bookingService.findHotelName(id);
		map.put("name", client);
		return "HotelBooking";
	}
	*/
		@RequestMapping("/HotelBooking/{name}")
		public String getHotelName(ModelMap map,@PathVariable("name") String hname)
		{	
			Client hotelname=bookingService.findHotelName(hname);
			clName=hotelname.getName();
			return "HotelBooking";
		}
	
		@RequestMapping("/HotelBooking/confirmBooking")
		public String bookHotel(ModelMap map)
		{
			map.put("cl",clName);
			return "BookingConfirmation";
		}
}
	

