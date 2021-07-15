package com.techelevator;

import com.techelevator.CustomClasses.Quiz;
import com.techelevator.FileReader.QuestionGenerator;

import java.io.File;

public class PopQuizApplication {

    public static void main(String[] args){
        QuestionGenerator newQuestionGenerator = new QuestionGenerator(new File("quiz.txt"));
        //create a new question generator that takes in the specified file

        Quiz popQuiz = new Quiz(newQuestionGenerator.generateQuizQuestions());
        //create a new quiz that takes in the array list of questions from the question generator as a parameter
    }
}
