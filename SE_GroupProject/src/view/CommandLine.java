/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

/**
 *
 * @author ruhelmalique
 */

import java.util.Scanner;

public class CommandLine {

    private Scanner scan;
    //private int noOfSides;
    private String sizeType, dimensions, command, name, exit;

    public CommandLine() {
        scan = new Scanner(System.in);
        name = "";
        dimensions = "";
        command = "";    
    }


    public void welcomeMessage(){
        System.out.println("Hey "+name+", welcome to the game of Uppers&Downers");
    }


    public void setName(){
        System.out.println("Please enter your name: ");
        name = scan.nextLine();
    }


    public String getName(){
        return name;
    }

    public void setExit(){
        System.out.println("Are you sure you want to quit the game? (y/n)");
        exit = scan.nextLine(); 
    }

    
    public String getExit(){
        return this.exit;
    }

    public void setSizeType(){
        System.out.println("Would you like to use the default board size (10X10)");
        sizeType = scan.nextLine();
    }
    
    public void startMessage(){
        System.out.println("Type in a command to play the game. \n For list of commands, you can check the manual using the 'man' command");
    }


    public void setCommand(){
        System.out.print("Q> ");
        command = scan.nextLine();
    }


    public String getCommand(){
        return command;
    }

    public void showResults(String results){
        System.out.println(results);
    }


    public void setDimensions(){
        System.out.println("What's the size of the board dimension do you want (rowXcolumn e.g (12X12)?");
        dimensions = scan.nextLine();
    }

    public String getDimensions(){
        return dimensions;
    }

    public String getSizeType(){
        return this.sizeType;
    }
    
    public void cmdError(String err){
        System.out.println (err);  
    }

    public void setDefault() {
        dimensions = "10X10";
    }
    
    public void startGame(){
        System.out.println("Game has began. You go first so in order to roll the die type in the 'roll' command");
    }
    
    public void printRolled(int rolled){
        System.out.println("You rolled "+rolled);
    }
    
}
