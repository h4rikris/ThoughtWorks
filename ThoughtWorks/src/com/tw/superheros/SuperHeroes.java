package com.tw.superheros;

import java.util.ArrayList;

public class SuperHeroes {
	private static ArrayList<String> SuperHeronames = new ArrayList<String>();

	public SuperHeroes() {

	}

	public void addSuperHero(String superHeroName) {
		SuperHeronames.add(superHeroName);
		SuperHeroCodes.generateCodeForSingleHero(superHeroName);
		return;
	}

	public static ArrayList<String> getSuperHeronames() {
		return SuperHeronames;
	}

	public static void setSuperHeronames(ArrayList<String> superHeronames) {
		SuperHeronames = superHeronames;
	}
}
