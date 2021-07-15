package com.techelevator.Interface;

import com.techelevator.CustomClasses.Question;
import com.techelevator.CustomClasses.Quiz;
import com.techelevator.PopQuizApplication;
import com.techelevator.QuizLogic;

import java.util.ArrayList;

public class TestMenuCLI {

    public Object run;
    private ArrayList<Question> questionsList;
    private ArrayList<String> testQuestions;
    private ArrayList<String> choices;
    private Menu menu;
    private QuizLogic quizLogic;
    private Quiz quiz;

    public TestMenuCLI(ArrayList<Question> questionList){
        this.questionsList = questionList;


    }

    //Who should handle the loop to go through each question on the test, get the test question and display possible answers?
    //Can I give the CLI a quiz as the parameter, have it cycle through and pull each individual question and then pull the
    //test question and possible answers? Or would that make my CLI too tightly joined?
    //QuizLogic will handle calling the QuestionGenerator, creating a quiz from the question list and
    // checking whether the answer is correct or not
    public void run(){
        int questionsAnswered = 0;

        while (quizLogic.isTestFinished(questionsAnswered) == false)
            System.out.println(testQuestion);
            String answer = menu.getChoiceFromOptions(choices.toArray()).toString();
            Boolean isCorrect = quizLogic.isAnswerCorrect(testQuestion, answer);
            if (isCorrect == true){
                quizLogic.markCorrect();}
    }
}
