package com.techelevator.FileReader;

import com.techelevator.CustomClasses.Question;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;


public class QuestionGenerator {
    private final File inputFile;
    private ArrayList<Question> questionList = new ArrayList();

    public QuestionGenerator(File inputFile) {
        this.inputFile = inputFile;
    }

    public ArrayList<Question> generateQuizQuestions() {
        //this takes the file & turns each line into an array list
        File inputFile = new File("quiz.txt");
        List<String> lineList = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(inputFile)) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }


        for (String line : lineList) {
            Question individualQuestion = new Question();
            String[] splitLines = line.split("\\|");

            individualQuestion.setTestQuestion(splitLines[0]);
            individualQuestion.setCorrectAnswer(splitLines[1]);
            for (int i = 2; i < splitLines.length; i++) {
                individualQuestion.addToChoiceArray(splitLines[i]);
            }

            this.questionList.add(individualQuestion);

        } return this.questionList;

    }
}

