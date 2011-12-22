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
        private String[] commands = {"start","quit", "save", "pause", "re{sume", "load", "roll", "move", "man"};
        private String sizeType;

	public CmdController(Game game, CommandLine cmdLine){
            this.game = game;
            this.cmdLine = cmdLine;
        }
	
	public void getInputs(){
            playerName = cmdLine.getName();
            exit = cmdLine.getExit();
            dimensions =  cmdLine.getDimensions();
            //readyToStart = cmdLine.getReady();
            typeBoardSize = cmdLine.getSizeType();
            cmdEntd = cmdLine.getCommand();
            sizeType = cmdLine.getSizeType();
	}
	
	public void calcDimensions(){
            String[] results = new String[2];
            results = dimensions.split("X");
            rows = Integer.parseInt(results[0]);
            cols = Integer.parseInt(results[1]);
                        
//            System.out.println(rows);
//            System.out.println(cols);
	}

        //this is where the command from the user is given to the Game class!!
	
	public String getSizeType(){
            return sizeType; 
        }
        
        public String getCmdEntered(){
            return cmdEntd;
        }

    public void cmdHandler(String cmd){
        String errMessage = "";
        String instruction = cmd.trim(); 
        String[]results = instruction.split(" ");
        
         if(results[0].equalsIgnoreCase(commands[0]))
             game.start(cmdLine.getName(), rows, cols); 
        else if(results[0].equalsIgnoreCase(commands[1]))
             game.quit(); 
        //else if(results[0].equalsIgnoreCase(commands[2]))
            // game.save(); 
        else if(results[0].equalsIgnoreCase(commands[3]))
             game.pause(); 
         
        else if(results[0].equalsIgnoreCase(commands[4]))
             game.resume();
        
//        else if(results[0].equalsIgnoreCase(commands[5])){
//           try{
//                if(results[1] != null)
//                //game.load(results[1]);
//           }
//           catch(Exception e){
//                errMessage = "No filename specified. To use load command type 'load filename'. For more info type man load"; 
//                cmdLine.cmdError(errMessage);
//           }       
      //  }
        
        else if(results[0].equalsIgnoreCase(commands[6]))
             game.roll(); 
        else if(results[0].equalsIgnoreCase(commands[7]))
        {}  //game.move(); 
        
        else if(results[0].equalsIgnoreCase(commands[8]))
            try{
                if(results[1] != null)
                    game.manCaller(results[1], commands.length);  
            }catch(Exception e){
                errMessage = "No command specified. To use man command type 'man' and the name of command in query";
                cmdLine.cmdError(errMessage);
            }
        else
             System.out.println("Unknown command. To see the list of possible commands type in 'man'");
        }
    
    public int getRow(){
        return rows;
    }
    
    public int getCols(){
        return cols;
    }
        
        
}