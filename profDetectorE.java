package com.profanityExperiment;

public class profDetectorE {

    private String abusiveWord;
    private String wordToBeChecked;
    private String checkedForShouting;

    public profDetectorE(String abusiveWord, String wordToBeChecked, String checkedForShouting)

    {
        this.abusiveWord = abusiveWord;
        this.wordToBeChecked = wordToBeChecked;
        this.checkedForShouting = checkedForShouting;
    }

    public String getWordToBeChecked() {
        return wordToBeChecked;
    }

    public void setWordToBeChecked(String wordToBeChecked) {
        this.wordToBeChecked = wordToBeChecked;
    }

    public String getAbusiveWord() {
        return abusiveWord;
    }

    public void setAbusiveWord(String abusiveWord) {
        this.abusiveWord = abusiveWord;
    }

    public String getCheckedForShouting() {
        return checkedForShouting;
    }

    public void setCheckedForShouting(String checkedForShouting) {
        this.checkedForShouting = checkedForShouting;
    }

    public String toString()

    {
        return "Abusive Word: " + this.abusiveWord + "Checked File Result" + this.wordToBeChecked + "Checked for Shouting" + this.checkedForShouting;
    }

}

