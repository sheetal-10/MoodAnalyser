package com.bridgelabzs;

/**
 * Program to Handle custom Exceptions by Mood Analyzer Problem
 * @author Sheetal
 * @since 2021-08-29 
 */
public class MoodAnalyser {
	
	private String message;

	/**
	 * Default Constructor without parameter
	 */
	public MoodAnalyser() {
		
	}
	
	/**
	 * Constructor for the class with parameter
	 * @param message
	 */
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	/**
	 * Ability to check the given string in the given message
	 * @param message 
	 * @return HAPPY or SAD
	 */
	public String analyseMood(String message) {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}
