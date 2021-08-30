package com.bridgelabzs;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit Test case for validating the return statement
 * Validating with Multiple run cases
 * @author Sheetal
 * @since 2021-08-29
 */
public class MoodAnalyserTest {
		//Test case for Sad Mood
		@Test
		public void givenMessgae_WhenSad_ShouldReturn_Sad() {
			MoodAnalyser moodAnalyser = new MoodAnalyser(); //passed message to constructor
			String mood = moodAnalyser.analyseMood("I am in Sad Mood");
			Assert.assertEquals("SAD", mood);
		}
		
		//Test case for Happy Mood
		@Test
		public void givenMessage_whenNotSad_shouldReturn_Happy() {
			MoodAnalyser moodAnalyser = new MoodAnalyser(); //passed message to constructor
			String mood = moodAnalyser.analyseMood("I am in any Mood");
			Assert.assertEquals("HAPPY", mood);
		}
}
