package model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rushi
 */
public class HumanPlayer extends Player{

    private String name;
    

    public HumanPlayer(String playerName){
          name = playerName;
    }


    public void setPlayerName(String name){
         this.name = name;
    }
    
    public String getPlayerName(){
        return name;
    }
}

