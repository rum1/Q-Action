/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alex K Aidoo Micah
 */
public class UpOrDown {
    
    private int start, end; 
    
    public UpOrDown(){
        start =0; 
        end = 0;     
    }
    
    public UpOrDown(int start, int end){
        this.start = start; 
        this.end = end;
    }
    
    public void setStart(int start){
        this.start = start; 
    }
    
    public int getStart(int end){
        return start;         
    }
    
    public void setEnd(int end){
        this.end = end; 
    }
    
    public int getEnd(){
        return end; 
    }
  
}
