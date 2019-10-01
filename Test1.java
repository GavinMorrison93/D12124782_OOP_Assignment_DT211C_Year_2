package com.test.justForTestCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {

	private static final String FILENAME = "C:\\Users\\Gavin\\Desktop\\Java_Workspace\\General_Labs\\src\\com\\test\\justForTestCode\\Trainspotting_chapter_1.txt";

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
