/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alex K Aidoo Micah
 */
public class Square {
    
    private int sqNumber; 
    private boolean isOccupied, isSpecial; 
    private UpOrDown aUpDowner; 
    
    public Square(){
        sqNumber =0; 
        isOccupied = false; 
        isSpecial = false;      
        aUpDowner = null; 
    }
    
    public Square(int sqNumber, boolean isOccupied, boolean isSpecial, UpOrDown aUpDowner){
        this.sqNumber =0; 
        this.isOccupied = isOccupied; 
        this.isSpecial = isSpecial;
        this.aUpDowner = aUpDowner; 
    }
    
    public int getSquareNum(){
        return sqNumber;     
    }
    
    public void setIsSpecial(boolean special){
        isSpecial = special; 
    }
    public boolean getIsSpecial(){
        return isSpecial; 
    }
    
    public void setIsClimbable(){
        this.aUpDowner = new UpOrDown(); 
    }
}
