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
    


    public static void main(String[]args){
        gameModel = new Game(); 
        cmdLine = new CommandLine(); 
        cmdController= new CmdController(gameModel, cmdLine); 
        
        MVC anMVC = new MVC(); 
        anMVC.useConsoleView(); 
    }

    public void useConsoleView() {
        cmdLine.setName();
        cmdLine.welcomeMessage();
        cmdLine.setReady();
        cmdLine.setSizeType();
        
        String type = cmdLine.getSizeType();
        if(type.equalsIgnoreCase("n"))
            cmdLine.setDimensions();
        cmdController.calcDimensions();    
        cmdController.getInputs();
        cmdController.calcDimensions();
        
        //cmdLine.setCommand();
        String command = cmdLine.getCommand();
        cmdController.cmdHandler(command);
        
        
    }
}
