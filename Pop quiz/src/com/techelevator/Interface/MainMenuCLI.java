package com.techelevator.Interface;

public class MainMenuCLI {

    private static final String MAIN_MENU_BEGIN_QUIZ = "Begin Quiz";
    private static final String MAIN_MENU_EXIT = "Exit";

    private static final String[] MAIN_MENU_OPTIONS =
            {
                    MAIN_MENU_BEGIN_QUIZ, MAIN_MENU_EXIT
            };

    private final Menu menu;
    private final TestMenuCLI testMenu;

    public MainMenuCLI(Menu menu, TestMenuCLI testMenu){ //by feeding the menu and popQuizApp into the CLI method, it allows other menus or quizzes to be swapped in and out while leaving the CLI the same
        this.menu = menu;
        this.testMenu = testMenu;
    }

    public void run(){
        while (true){
            //feeds the Main_Menu_Options array into the getChoiceFromOptions method in the Menu.java to get the user's choice
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

            if (choice == MAIN_MENU_BEGIN_QUIZ){
                this.testMenu.run();
            } else if (choice == MAIN_MENU_EXIT){
                System.out.println("Goodbye!");
                System.exit(0);
            }
        }
    }
}
