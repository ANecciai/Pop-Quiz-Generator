package com.techelevator.Interface;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {

    private Scanner in;
    private PrintWriter out;

    public Menu(InputStream input) {
        this.in = new Scanner(input);
    }

    //feeds in Object array options from the PopQuizCLI
    //begins a while loop that continues until choice does not equal null
    //to get choice, it executes the getChoiceFromUserInput method and then returns that choice
    public Object getChoiceFromOptions(Object[] options) {
        Object choice = null;
        while (choice == null) {
            displayMenuOptions(options);
            choice = getChoiceFromUserInput(options);
        }
        return choice;
    }

    //works with the getChoiceFromOptions method
    //uses Scanner in to get the user input and puts it in a string
    //begins a try-catch to deal with any exceptions
    //in the try, it sets the selectedOption in to the value of the string
    //if the option is more than zero and less than the length of the array Options the it
    //sets choice to array index that matches selectedOption - 1 as the array starts at 0 so the index will be
    //one less than the choice number
    private Object getChoiceFromUserInput(Object[] options) {
        Object choice = null;
        String userInput = in.nextLine();
        try {
            int selectedOption = Integer.valueOf(userInput);
            if (selectedOption > 0 && selectedOption <= options.length) {
                choice = options[selectedOption - 1];
            }
        } catch (NumberFormatException e) {
        }
        if (choice == null) {
            out.println(userInput + " is not a valid option");
        }
        return choice;
    }

    //this method begins a loop that takes the length of the options array
    //the loop will continue to print out each object in the array that contains the menu options until
    //i is equal to the length of the array, meaning all menu options have been printed
    private void displayMenuOptions(Object[] options) {
        out.println();
        for (int i = 0; i < options.length; i++) {
            int optionNum = i + 1;
            out.println(optionNum + ". " + options[i]);
        }
        out.println("Please choose an option:");
        out.flush();
    }
}
