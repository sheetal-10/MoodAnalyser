package com.bridgelabzs;

/**
 * Program to Handle custom Exceptions by Mood Analyzer Problem
 * @author Sheetal
 * @since 2021-08-29 
 */
public class MoodAnalyser {
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
