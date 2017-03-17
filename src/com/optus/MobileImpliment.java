package com.optus;

import java.util.LinkedHashSet;
import java.util.Set;

public class MobileImpliment implements MobileService {
	
	private static Set allMobiles = new LinkedHashSet();
	
	 public Set getAllMobiles(){
		 
		 
		    allMobiles.add(new Mobile("Samsung Prime", 12000));
	        allMobiles.add(new Mobile("Oppo", 18000));
	        allMobiles.add(new Mobile("Iphone", 25000));
	        return allMobiles;
	        
	 }

	@Override
	public Set getAllMoblies() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
