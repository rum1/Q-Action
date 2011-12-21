package controller;

import model.*;
import view.*;

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
	private String dimensions;
	private String cmdEntd;
	private String exit;
	private String readyToStart;
	private String playerName;
	private String typeBoardSize;
        private String sizeType;

	public CmdController(Game game,CommandLine cmdLine){
            this.game = game;
            this.computer = computer;
            this.cmdLine = cmdLine;
            this.boardGame = boardGame;
        }
	
	public void getInputs(){
            playerName = cmdLine.getName();
            exit = cmdLine.getExit();
            dimensions =  cmdLine.getDimensions();
            readyToStart = cmdLine.getReady();
            typeBoardSize = cmdLine.getSizeType();
            cmdEntd = cmdLine.getCommand();
            sizeType = cmdLine.getSizeType();

	}
	
	public void calcDimensions(){
            String[] results = new String[2];
            results = dimensions.split("X");
            rows = Integer.parseInt(results[0]);
            cols = Integer.parseInt(results[1]);
	}

        //this is where the command from the user is given to the Game class!!
	public void setCmdHandler(){
            game.cmdHandler(cmdEntd);
        }

	public String getSizeType(){
            return sizeType; 
        }
        
}