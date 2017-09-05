package com.example.android.reportcardapp;

/**
 * Created by Alistair on 9/4/2017.
 */


public class ReportCard {
    //Declare variables
    private String studentName;
    private int mathsResults;
    private int englishResults;
    private int geographyResults;
    private int biologyResults;
    private int historyResults;

    /*Create a new ReportCard Constructor

    @param studentName is the Student's name
    @param mathsResults is the Student's math results
    @param englishResults is the Student's english results
    @param geographyResults is the Student's geo results
    @param biologyResults is the Student's bio results
    @param historyResults is the Student's history results*/

    public ReportCard(String studentName,
                      int mathsResults,
                      int englishResults,
                      int geographyResults,
                      int biologyResults,
                      int historyResults) {
        this.studentName = studentName;
        this.mathsResults = mathsResults;
        this.englishResults = englishResults;
        this.geographyResults = geographyResults;
        this.biologyResults = biologyResults;
        this.historyResults = historyResults;
    }

    //Set and Get Methods for the Student Name.
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    //Set and Get Methods for the Maths Results.
    public void setMathsResults(int mathsResults) {
        this.mathsResults = mathsResults;
    }

    public int getMathsResults() {
        return mathsResults;
    }

    //Set and Get Methods for the English Results.
    public void setEnglishResults(int englishResults) {
        this.englishResults = englishResults;
    }

    public int getEnglishResults() {
        return englishResults;
    }

    //Set and Get Methods for the Geography Results.
    public void setGeographyResults(int geographyResults) {
        this.geographyResults = geographyResults;
    }

    public int getGeographyResults() {
        return geographyResults;
    }
    //Set and Get Methods for the Biology Results.
    public void setBiologyResults(int biologyResults) {
        this.biologyResults = biologyResults;
    }

    public int getBiologyResults() {
        return biologyResults;
    }

    //Set and Get Methods for the History Results.
    public void setHistoryResults(int historyResults) {
        this.historyResults = historyResults;
    }

    public int getHistoryResults() {
        return historyResults;
    }

    //Creates String using reportCard ArrayList.
    @Override
    public String toString() {
        String fullReport = "Student Name: " + getStudentName() + "\n" +
                            "Mathematics: " + getMathsResults() + "\n" +
                            "English: " + getEnglishResults() + "\n" +
                            "Geography: " + getGeographyResults() + "\n" +
                            "Biology: " + getBiologyResults() + "\n" +
                            "History: " + getHistoryResults();
        return fullReport;
    }
}
