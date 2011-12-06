package model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rushi
 */
public class Computer extends Player {
   private BoardGame aBoard;
   private boolean isBumpable;
   private int distanceFromUser;
   private int distanceFromEnd;
   
   public Computer(){
		
   }
   
   public Computer(BoardGame aBoard,boolean isBumpable, int distanceFromUser, int distanceFromEnd){
       this.aBoard = aBoard;
       this.isBumpable= isBumpable;
       this.distanceFromEnd=distanceFromEnd;
       this.distanceFromUser=distanceFromUser;
   }
   public void calculateMove()
   { 
       
   }
   
   public void getPosition()
   {
       
   }
   private int getUsersPosition(){
       return -1; 
   }
}
