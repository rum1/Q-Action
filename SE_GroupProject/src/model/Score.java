package model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivia Cheung
 */
public class Score {
    private double finishTime;
    private int bumpNumber;
    private int currentPoints;
    
    public Score(){
    
    }
    
    public Score(int finishTime, int bumpNumber){
        this.finishTime = finishTime;
        this.bumpNumber = bumpNumber;
    }
    
    public int getPoints(){
        return currentPoints;
    }
    
    public int getBumpNumber(){
        return bumpNumber;
    }
    public void setFinishTime(double endTime){
        finishTime = endTime;
    }
    public double getFinishTime(){
        return finishTime;
    }
    
}
