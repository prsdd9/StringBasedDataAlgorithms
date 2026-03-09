package com.psd;

import java.util.ArrayList;
import java.util.List;

public class CountOfSubStringsStartEnd1InBynary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "0001001010001";
		getSubStrings(str);
		
	}
	
	public static List<String> getSubStrings(String str) {
		
		List<String> resultList = new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {			
			if(str.charAt(i) == '1') {
				for(int j=i+1;j<str.length();j++) {
				  if(str.charAt(j)=='1') {
					  resultList.add(str.substring(i,j+1));
					  System.out.println(str.substring(i,j+1));
				  }					
				}				
			}
		}
		
		
		return resultList;
	}
	

}
