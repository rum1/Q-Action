/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alex K Aidoo Micah
 */
public class BoardGame {
    private int position, rows, cols;
    private Die aDie; 
    private Square square; 
    private Square[][] boardDimensions; 
    
    public BoardGame(){
        rows =  0; 
        cols = 0;
        position=0; 
        
    
    }
    
    public BoardGame(Die aDie, Square sqr, Square [][]brdDimensions, int rows, int cols, int position){
        this.aDie = aDie;
        square = sqr; 
        boardDimensions = brdDimensions; 
        this.rows = rows;
        this.cols = cols; 
        this.position = position;
    }
    
    public void setRows(int rows){
        this.rows = rows; 
    }
    
    public void setColumns(int cols){
        this.cols = cols; 
    }
    
    public void setBoardSize(int rows, int cols){
        boardDimensions = new Square[rows][cols];
            
    }
    
    public void makeBoard(){
        for(int i =0; i<rows; i++){
            for(int k=0; k<cols; k++)
                boardDimensions[rows][cols] = new Square();
        }
    }
    
   
    
    
}
