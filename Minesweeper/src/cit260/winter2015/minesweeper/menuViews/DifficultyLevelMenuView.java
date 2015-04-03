/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.winter2015.minesweeper.menuViews;

import cit260.winter2015.minesweeper.menuControls.LevelSelectionControl;
import cit260.winter2015.minesweeper.exceptions.EndGameException;

public class DifficultyLevelMenuView extends Menu {

    private final static String[][] menuItems = {
        {"B", "Beginner"},
        {"I", "Intermediate"},
        {"E", "Expert"},
        {"P", "Preset Demo"},
        {"X", "Exit To Main Menu"}
    };
    private static final long serialVersionUID = 1L;

    LevelSelectionControl difficultyLevelMenuControl = new LevelSelectionControl();

    public DifficultyLevelMenuView() {
        super("Difficulty Level Menu", DifficultyLevelMenuView.menuItems);
    }

    @Override
    public void executeCommands() throws EndGameException {
        String command;

        do {
            display(); // display the menu

            command = getInput();

            switch (command) {
                case "B":
                    difficultyLevelMenuControl.beginner();
                    break;
                case "I":
                    difficultyLevelMenuControl.intermediate();
                    break;
                case "E":
                    difficultyLevelMenuControl.expert();
                    break;
                case "P":
                    difficultyLevelMenuControl.beginnerPreset();
                    break;
                case "X":
                    break;
                default:
                    System.out.println("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("X"));
    }
}