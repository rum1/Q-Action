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
    private String ready,sizeType, dimensions, command, name, exit;

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
  
   
    public void setReady(){
        System.out.println("Are you ready to play? (y/n)");
        ready = scan.nextLine();
    }

    public String getReady(){
        return ready;
    }

    public void setSizeType(){
        System.out.println("Whats size of the board do you want?");
        sizeType = scan.nextLine();
    }


    public void setCommand(){
        System.out.println("Type in a command to play the game. \n For list of commands, you can check the manual using the 'man' command");
        command = scan.nextLine();
    }


    public String getCommand(){
        return this.command;
    }

    public void showResults(String results){
        System.out.println(results);
    }


    public void setDimensions(){
        System.out.println("What's the size of the dimension you in place on the board game?");
        dimensions = scan.nextLine();
    }

    public String getDimensions(){
        return dimensions;
    }

    public String getSizeType(){
        return this.sizeType;
    }

    public void setBoardType(){
        System.out.println("Would you like to use the default board size?(10X10)");
        sizeType = scan.nextLine();
    }
}
