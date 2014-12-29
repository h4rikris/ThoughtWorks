package com.tw.sms;

import com.tw.superheros.SuperHeroCodes;
import com.tw.utility.StringUtil;

public class SmsParser {
	public String parser(String message) {
		String heroName;
		StringBuilder tmpHero = new StringBuilder(message.substring(2));
		StringUtil strObj = new StringUtil();
		Integer code = strObj.StringToInt(tmpHero.toString());
		heroName = SuperHeroCodes.getSuperHeroCodes().get(code);
		return heroName;
	}
}
