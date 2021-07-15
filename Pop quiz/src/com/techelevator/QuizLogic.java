package com.techelevator;

import com.techelevator.CustomClasses.Question;
import com.techelevator.CustomClasses.Quiz;
import com.techelevator.FileReader.QuestionGenerator;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuizLogic {
    Quiz quiz;

    //takes in the input file, calls the QuestionGenerator to parse the file, assign the values, and create a list of questions
    //to be added to the quiz
    public QuizLogic(File inputFile) {
        QuestionGenerator createQuestionList = new QuestionGenerator(inputFile);
        quiz.setQuestionList(createQuestionList.generateQuizQuestions());
    }

   public Quiz getQuiz(){
        return quiz;
   }

   public boolean isAnswerCorrect(String question, String answer) {
        if (answer.equalsIgnoreCase(question)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTestFinished(int questionsAnswered) {
        if (questionsAnswered == quiz.getTotalQuestions()) {
            return true;
        } else {
            return false;
        }
    }

    public void markCorrect(){
        quiz.setCorrectAnswers(quiz.getCorrectAnswers() + 1);
}
    public ArrayList<Question> getQuestionList(){
        return quiz.getQuestionList();
    }

    public ArrayList<String> testQuestion(){
        ArrayList<String> testQuestions = new ArrayList<>();
        for (Question question : quiz.getQuestionList()){
            testQuestions.add(question.getTestQuestion());
        } return testQuestions;
    }



}
