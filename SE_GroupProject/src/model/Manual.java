/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alex K Aidoo Micah
 */
public class Manual {
    
    private String man; 
    String[] description; 
    
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
    
    public String[] getManResults(){
        return description; 
    }
    
}
