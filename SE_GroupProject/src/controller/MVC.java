/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.*;
import view.*;

/**
 *
 * @author aam30
 */
public class MVC {
    private static CommandLine cmdLine;
    private static CmdController cmdController;
    private static Game gameModel;
    private static BoardGame board;


    public static void main(String[]args){
        gameModel = new Game(); 
        cmdLine = new CommandLine(); 
        cmdController= new CmdController(gameModel, cmdLine); 
        board = new BoardGame(); 
        
        
        MVC anMVC = new MVC(); 
        anMVC.useConsoleView(); 
    }

    public void useConsoleView() {
        cmdLine.setName();
        cmdLine.welcomeMessage();
        cmdLine.setSizeType();
        
        String type = cmdLine.getSizeType();
        if(type.equalsIgnoreCase("n")){
            cmdLine.setDimensions();
            cmdController.getInputs(); 
            cmdController.calcDimensions();
        }
        else if(type.equalsIgnoreCase("y")){
            cmdLine.setDefault();
            cmdController.getInputs();
            cmdController.calcDimensions();
        }
        
        cmdLine.startMessage();
        String command = cmdLine.getCommand();
        while(!command.equalsIgnoreCase("quit")){
            cmdLine.setCommand();
            command = cmdLine.getCommand();
            cmdController.cmdHandler(command);
        }
        cmdController.cmdHandler(command);
        
        
        
        
        //cmdLine.setCommand();
        //String command = cmdLine.getCommand();
        cmdController.cmdHandler(command);
        
        
    }
}
