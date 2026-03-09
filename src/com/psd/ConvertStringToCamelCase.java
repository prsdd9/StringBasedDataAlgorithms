package com.psd;

public class ConvertStringToCamelCase {
	
	
	public static String ConvertStringToCamelCase(String str) {
		StringBuilder sb =  new StringBuilder();
		boolean isConvertRequired=false;
		for(int i=0;i<str.length();i++) {
			char srcChar= str.charAt(i);
			if(str.charAt(i)== ' ') {
				isConvertRequired=true;
			}else if(isConvertRequired) {
				sb.append(Character.toUpperCase(srcChar));
				isConvertRequired=false;
			}
			else {
				sb.append(srcChar);
			}
			
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i am a software development engineer and working in idbi intech as a project lead";
		System.out.println(ConvertStringToCamelCase(str));
		
		
		
	}

}
