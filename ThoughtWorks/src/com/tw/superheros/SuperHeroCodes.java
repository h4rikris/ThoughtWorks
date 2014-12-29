package com.tw.superheros;

import java.util.HashMap;
import java.util.Map;
import com.tw.telephone.Keypad;

//Singleton Class
public class SuperHeroCodes {
	private static Map<Integer, String> superHeroCodes = new HashMap<Integer, String>();

	public SuperHeroCodes() {

	}

	public static void generateCodes() {
		for (String name : SuperHeroes.getSuperHeronames()) {
			superHeroCodes.put(generateHeroCode(name), name);
		}
		return;
	}

	public static void generateCodeForSingleHero(String name) {
		superHeroCodes.put(generateHeroCode(name), name);
	}

	public static Integer generateHeroCode(String name) {
		int index, tmp;
		Integer code = 0;
		for (index = 0; index < name.length(); index++) {
			tmp = Keypad.getLayout().get(name.charAt(index));
			code += tmp;
			code *= 10;
		}
		return code;
	}

	public static Map<Integer, String> getSuperHeroCodes() {
		return superHeroCodes;
	}

	public static void setSuperHeroCodes(Map<Integer, String> superHeroCodes) {
		SuperHeroCodes.superHeroCodes = superHeroCodes;
	}
}
