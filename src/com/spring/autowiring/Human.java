package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("octopusheart")
	private Heart heart;
	
	public Human() {
		
	}
	public Human(Heart heart) {
		this.heart = heart;
	}
  
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("method called");
	}

	public void startPumping() {
		if(heart!=null) 
		{
		heart.pump();
		System.out.println("Name of heart is:"+ heart.getNameOfHeart()+"No of heart" +heart.getNoOfheart());
		}
		else
		{
			System.out.println("You are not alive now");
		}
	}

}
