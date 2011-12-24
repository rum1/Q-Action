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
        description[0] = "This command will start the game!!... To use it type just type 'start'. \n This command can only be used in the beginnig of the game and when the game is ended or paused";
        description[1] = "This command will start the game!!... To use it type just type 'start'. \n This command can only be used in the beginnig of the game and when the game is ended or paused";
        description[2] = "This command will start the game!!... To use it type just type 'start'. \n This command can only be used in the beginnig of the game and when the game is ended or paused";
        description[3] = "This command will start the game!!... To use it type just type 'start'. \n This command can only be used in the beginnig of the game and when the game is ended or paused";
        description[4] = "This command will start the game!!... To use it type just type 'start'. \n This command can only be used in the beginnig of the game and when the game is ended or paused";
        description[5] = "This command will start the game!!... To use it type just type 'start'. \n This command can only be used in the beginnig of the game and when the game is ended or paused";
        description[6] = "This command will start the game!!... To use it type just type 'start'. \n This command can only be used in the beginnig of the game and when the game is ended or paused";
        description[7] = "This command will start the game!!... To use it type just type 'start'. \n This command can only be used in the beginnig of the game and when the game is ended or paused";
        description[8] = "This command will start the game!!... To use it type just type 'start'. \n This command can only be used in the beginnig of the game and when the game is ended or paused";
 
    }
    
    public String getManResults(){
       
        return ""; 
    }
    
}
