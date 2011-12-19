package controller;

import model.BoardGame;
import model.Computer;

/* Command line controller class in which the
 * game will essentially run on. 
 * Class sets motion for the game
 */

public class CmdController{
	private Game game;
	private Computer computer;
	private CommandLine cmdLine;
	private BoardGame boardGame;
	private int rows;
	private int cols;
	private int dimensions;
	private String cmdEntd;
	private char exit;
	private int start;
	private int playerName;
	private char typeBoardSize;
	
	public void CmdController(){
		rows = 0;
		cols = 0;
		dimensions = 0;
		playerName = 0; 
	}
	
	public void getInputs(){
            
	}
	
	public void calcDimensions(){
	}
	
        //this is where the command from the user is given to the Game class!!
	public void setCmdHandler(){
	}
	
	public void setExit(){
	}
	
	public void setGame(){
	}
	
	public void setPlayersName(){
	}
	
	public void checkSizeType(){
	}
	

}