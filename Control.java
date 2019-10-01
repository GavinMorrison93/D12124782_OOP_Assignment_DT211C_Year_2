package com.assignment.firstDraft;

public class Control {
	
	public static void main(String[] args)
	
	{
		abusiveLanguageDetector abusivelanguagedetector1 = new abusiveLanguageDetector("bum", "poo", "arse");
		System.out.println("Abusive Language Is: " + abusivelanguagedetector1 );
		
	}
	{
		List<String> bullyWords = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("bully_words.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
		    words.add(line);
		}
		reader.close();
	}
	{
		List<String> negativeFeelingWords = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("negative_feeling_words.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
		    words.add(line);
		}
		reader.close();
	}
	{
		List<String> googleBannedWords = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("full-list-of-bad-words-banned-by-google-txt-file_2013_11_26_04_53_31_867.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
		    words.add(line);
		}
		reader.close();
	}
	{
		List<String> trainspottingWords = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("Trainspotting_chapter_1.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
		    words.add(line);
		}
		reader.close();
	}
}
