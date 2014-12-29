package com.tw.telephone;

import java.util.HashMap;
import java.util.Map;

public class Keypad {
	private static final Map<Character, Integer> layout = new HashMap<Character, Integer>();

	public Keypad() {
		Keypad.layout.put('A', 2);
		Keypad.layout.put('B', 2);
		Keypad.layout.put('C', 2);
		Keypad.layout.put('D', 3);
		Keypad.layout.put('E', 3);
		Keypad.layout.put('F', 3);
		Keypad.layout.put('G', 4);
		Keypad.layout.put('H', 4);
		Keypad.layout.put('I', 4);
		Keypad.layout.put('J', 5);
		Keypad.layout.put('K', 5);
		Keypad.layout.put('L', 5);
		Keypad.layout.put('M', 6);
		Keypad.layout.put('N', 6);
		Keypad.layout.put('O', 6);
		Keypad.layout.put('P', 7);
		Keypad.layout.put('Q', 7);
		Keypad.layout.put('R', 7);
		Keypad.layout.put('S', 7);
		Keypad.layout.put('T', 8);
		Keypad.layout.put('U', 8);
		Keypad.layout.put('V', 8);
		Keypad.layout.put('W', 9);
		Keypad.layout.put('X', 9);
		Keypad.layout.put('Y', 9);
		Keypad.layout.put('Z', 9);
	}

	public static Map<Character, Integer> getLayout() {
		return layout;
	}

}
