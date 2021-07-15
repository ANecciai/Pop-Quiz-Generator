package com.techelevator.CustomClasses;

import java.util.ArrayList;
import java.util.Queue;

public class Question {
    private String testQuestion;
    private String correctAnswer;
    private ArrayList <String> possibleChoices = new ArrayList<>();
    private int selectedAnswer;

    public Question(String testQuestion, String correctAnswer, ArrayList<String> choices){
        this.testQuestion = testQuestion;
        this.correctAnswer = correctAnswer;
        this.possibleChoices = choices;
    }

    public Question(){

    }
    public String getTestQuestion() {
        return testQuestion;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public ArrayList getAllChoices() {
        return possibleChoices;
    }

    public int returnTotalNumberOfChoices(){
        return possibleChoices.size();
    }

    public String getIndividualChoice(int arrayIndex){
        return (String) possibleChoices.get(arrayIndex);
    }

    public void setTestQuestion(String testQuestion) {
        this.testQuestion = testQuestion;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setChoices(ArrayList choiceArray) {
        this.possibleChoices = choiceArray;
    }

    public void addToChoiceArray(String choiceToAdd){
        possibleChoices.add(choiceToAdd);
    }

    public void setSelectedAnswer(int selectedAnswer){
        this.selectedAnswer = selectedAnswer;
    }
}

