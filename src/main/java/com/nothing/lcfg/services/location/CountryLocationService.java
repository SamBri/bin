 package com.nothing.lcfg.services.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nothing.lcfg.IPWhoIsClient;
import com.nothing.lcfg.wsresponses.ipwhois.IpWhoIsResponse;

@Service
public class CountryLocationService implements ICountryLocationService {


	@Autowired
	IPWhoIsClient ipWhoIsClient;

     	
	
	@Override
	public String getRequesterCountry(String requesterIpAddress) {
		
	  IpWhoIsResponse ipWhoIsResponse =	ipWhoIsClient.doWhoIsIpOn(requesterIpAddress);
		
	  String theOriginatingCountry =null;
	  if(ipWhoIsResponse != null) {
		  theOriginatingCountry = ipWhoIsResponse.getCountry();
	  }else {
		  
	  }
	  
	  return theOriginatingCountry;
		
		
	}
	
	

}
