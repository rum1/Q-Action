/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import view.CommandLine;

/**
 *
 * @author Alex K Aidoo Micah
 */
public class Manual {
    
    private String man; 
    String[] description; 
    private CommandLine cmdLine;

    public Manual(String man, int arraySize){
        this.man = man; 
        description = new String[arraySize]; 
    }
    
    public void setDescription(){
        description[0] = "Start: this command lets you start the game";
        description[1] = "Quit: this command lets you quit the game";
        description[2] = "Save: this command lets you save the game";
        description[3] = "Pause: this command lets you pause the game";
        description[4] = "Resume: this command lets you carry on playing the game after put on pause";
        description[5] = "Load: this command lets you load a saved game previously";
        description[6] = "Roll: this command lets you roll the dice";
        description[7] = "Move: this command lets you move around the board";
        description[8] = "Man: this command gives brief description on specific command controls";
 
    }
    
    public String getManResults(){
        if (man.equals("start")){
            return description[0];
        }
        else if(man.equals("quit")){
            return description[1];
        }
        else if(man.equals("save")){
            return description[2];
        }
        else if(man.equals("pause")){
            return description[3];
        }
        else if(man.equals("resume")){
            return description[4];
        }
        else if(man.equals("load")){
            return description[5];
        }
        else if(man.equals("roll")){
            return description[6];
        }
        else if(man.equals("move")){
            return description[7];
        }
        else if(man.equals("man")){
            return description[8];
        }
        else{
        cmdLine = new CommandLine();
        cmdLine.cmdError("This command doesn't exist");
        }
       return "-1";
    }
}
