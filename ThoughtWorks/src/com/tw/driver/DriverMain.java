package com.tw.driver;

import java.util.Scanner;
import com.tw.sms.SmsParser;
import com.tw.superheros.SuperHeroes;
import com.tw.telephone.Keypad;

public class DriverMain {
	public static void main(String args[]) {
		// Check super hero names record
		System.out.println("Intializing Project");
		Keypad keypadObj = new Keypad();
		Scanner stdIn = new Scanner(System.in);
		if (isHerosEmpty()) {
			System.out
					.println("OOPS..System has currently no Heroes record.\nEnter Number of records:");
			SuperHeroes heroes = new SuperHeroes();
			int noOfrecords = stdIn.nextInt();
			stdIn.nextLine(); // TO consume new line leftover after scanning int
			for (int i = 0; i < noOfrecords; i++) {
				String hero = stdIn.nextLine();
				heroes.addSuperHero(hero);
			}
		}
		SmsParser parser = new SmsParser();
		System.out.println("Intialization done\nListening to recieve SMS");
		System.out.println("Enter number of SMS to recieve");
		Integer noOfSms=stdIn.nextInt();
		stdIn.nextLine(); // TO consume new line leftover after scanning int
		for(int i=0;i<noOfSms;i++){
			String sms = stdIn.nextLine();
			System.out.println(parser.parser(sms));
		}
		
	}

	public static boolean isHerosEmpty() {
		return SuperHeroes.getSuperHeronames().isEmpty();
	}
}
