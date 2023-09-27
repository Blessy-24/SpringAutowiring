package com.spring.autowiring;

public class Heart {
	
	private String nameOfHeart;
	private int noOfheart;
	
	
	
	public String getNameOfHeart() {
		return nameOfHeart;
	}



	public int getNoOfheart() {
		return noOfheart;
	}



	public void setNameOfHeart(String nameOfHeart) {
		this.nameOfHeart = nameOfHeart;
	}



	public void setNoOfheart(int noOfheart) {
		this.noOfheart = noOfheart;
	}



	public void pump() {
		System.out.println("Heart is pumping");
	}

}
