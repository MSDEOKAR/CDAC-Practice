package com.congnizant;

import java.util.List;


public class SpaceValidator {
	public static final String SPACE=" ";
	
	public String validate(String input, List<String> punctuationList)
	{
		StringBuffer sbuff = new StringBuffer(input);
		for(int index =0 ; index < sbuff.length(); index++)
		{
			String  str = sbuff.substring(index, index+1);
			if(punctuationList.contains(str))
			{
				char nextChar = sbuff.charAt(index+1);
				if(nextChar!= ' ')
				{
					sbuff.insert(index+1,' ');
				}

			}
		}
		return sbuff.toString();
	}	
}
