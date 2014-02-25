package com.test.xss;

import java.io.DataInputStream;
import java.io.IOException;

public class HTMLFilterTest {

	public static void main(String[] args) throws IOException {
		HTMLFilter vFilter = new HTMLFilter();

		String input = "";
		System.out.println("Enter the URL:");
		DataInputStream dis = new DataInputStream(System.in);
		input = dis.readLine();

		String output = vFilter.filter(input);
		System.out.println("Ouput URL:");
		System.out.println(output);
	}

}
