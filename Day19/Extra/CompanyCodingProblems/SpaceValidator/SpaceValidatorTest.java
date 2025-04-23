package com.cdac.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.cdac.validator.SpaceValidator;

public class SpaceValidatorTest {

	@Test
	public void test() 
	{
		String strPunctuationMarks ="! , : ; ?";
		List<String> punctuationList = new ArrayList<String>(Arrays.asList(strPunctuationMarks.split(" ")));
		String input ="Hi! how are you?Should we meet,and discuss,about:technology";
		String expectedOutput ="Hi! how are you? Should we meet, and discuss, about: technology";
		SpaceValidator validator = new SpaceValidator();
		String actualOutput = validator.validate(input, punctuationList);
		assertEquals(expectedOutput, actualOutput);


	}

}
