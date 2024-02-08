package model;

import java.util.Random;

/**
 * Audrey N. Johnston - ajohnston10
 * CIS175
 * Feb 6, 2024
 */
public class NumberGuesser {

	private int randomNumber;
	private int userNumber;
	private String highOrLow;

	
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}


	public int getRandomNumber() {
		return randomNumber;
	}
	public void setRandomNumber() {
		Random rand = new Random();
		this.randomNumber= rand.nextInt(9)+1;;
	}
	
	public String getHighOrLow() {
		return highOrLow;
	}
	public void setHighOrLow(String highOrLow) {
		this.highOrLow = highOrLow;
	}
	
	public NumberGuesser(int userNumber) {
		super();
		this.userNumber = userNumber;
		setRandomNumber();
	}
	
	public NumberGuesser(String highOrLow) {
		super();
		this.highOrLow = highOrLow.toLowerCase();
		setRandomNumber();
	}
	
	
	public String exactNumber() {
		String message;
		if(this.randomNumber == this.userNumber) {
			message = userNumber + " is the right answer!";
		}
		else {
			message = "Sorry, " + userNumber + " is not the right answer, it is " + this.randomNumber;		}
		return message;
	}
	
	public String higherOrLower() {
		String message;
		int numToCompare = 5;
		
		if(this.highOrLow.equals("higher")) {
			if(this.randomNumber >= numToCompare) {
				message =  "You got it! " + this.randomNumber + " is higher/equal to 5";
			}
			else {
				message = "Sorry, " + this.randomNumber + " is lower than 5";
			}
		}
		else if(this.highOrLow.equals("lower")) {
			if(this.randomNumber >= numToCompare) {
				message = "Sorry, " + this.randomNumber + " is higher/equal than 5";
			}
			else {
				message =  "You got it! " + this.randomNumber + " is lower than 5";;
			}
		}
		else {
			message = "Not valid input";
		}
		return message;
	}
	
	
	
}
