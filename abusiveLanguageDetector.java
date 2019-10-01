package com.assignment.firstDraft;

public class abusiveLanguageDetector 
{
	private String abusiveWord;
	private String bullyWord;
	private String negativeFeelingWord;
		
	abusiveLanguageDetector (String abusiveWord, String bullyWord, String negativeFeelingWord)
	
	{
		this.abusiveWord = abusiveWord;
		this.bullyWord = bullyWord;
		this.negativeFeelingWord = negativeFeelingWord;
	}

	public String getAbusiveWord() {
		return abusiveWord;
	}

	public void setAbusiveWord(String abusiveWord) {
		this.abusiveWord = abusiveWord;
	}

	public String getBullyWord() {
		return bullyWord;
	}

	public void setBullyWord(String bullyWord) {
		this.bullyWord = bullyWord;
	}

	public String getNegativeFeelingWord() {
		return negativeFeelingWord;
	}

	public void setNegativeFeelingWord(String negativeFeelingWord) {
		this.negativeFeelingWord = negativeFeelingWord;
	}
	
	public String toString()
	
	{
		return "Abusive Word: " + this.abusiveWord + "Bully Word: " + this.bullyWord + "Negative Feeling Word:" + this.negativeFeelingWord;
	}
}