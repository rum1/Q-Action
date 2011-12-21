/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import view.*;

/**
 *
 * @author aam30
 */
public class MVC {
    private static CommandLine cmdLine;



    public static void main(String[]args){
        cmdLine = new CommandLine();
        cmdLine.setName();
<<<<<<< HEAD




=======
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
        
        
>>>>>>> backupBranch
    }
}
