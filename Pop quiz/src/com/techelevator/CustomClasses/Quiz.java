package com.techelevator.CustomClasses;

import com.techelevator.CustomClasses.Question;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questionList = new ArrayList<>();
    private int totalQuestions = questionList.size();
    private int correctAnswers;
    private int finalScore;

    public Quiz(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }

    public Quiz() {
    }

    public Question getQuestion(int questionIndex) {
        return this.questionList.get(questionIndex);
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }


    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getFinalScore() {
        return this.finalScore = correctAnswers / totalQuestions;
    }

    public void setQuestionList(ArrayList<Question> questionList){
        this.questionList = questionList;
    }
    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }


}

