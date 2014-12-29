package com.tw.utility;

public class StringUtil {
	public Integer StringToInt(String var){
		Integer value=0;
		for(int i=0;i<var.length();i++){
			value+=(var.charAt(i)-48);
			value*=10;
		}
		return value;
	}
}
