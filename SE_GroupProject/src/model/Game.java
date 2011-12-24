package model;

import java.io.*;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivia Cheung
 */
public class Game {
   // private Manual manualAccess;
    private Game game;
    private BoardGame board;
    private Score scoreLine;
    private Die die;
    private ArrayList<Player> players;
    
    private Player player;
    //private Manual manual; 
    
    private HumanPlayer humanPlyrsID; 
    private Computer compPlyrsID; 
    private String humanPlyrName; 
    
    public Game(){
       // manualAccess = new Manual();
        board = new BoardGame();
        scoreLine = new Score();
        die = new Die(); 
        players = new ArrayList<Player>();
    }
    
    public void setPlayerID(){
        int counter =0; 
        for(Player x : players){
            if(x instanceof HumanPlayer)
                if(humanPlyrName.equalsIgnoreCase(((HumanPlayer)x).getPlayerName())){
                    humanPlyrsID = (HumanPlayer)x;
                    //counter++; 
                }
                compPlyrsID = (Computer)players.get(counter+1);
        }
    }
    
//    public void save(){
//
//        //for(int i=0; i<humanPlayers.size(); i++)
//            String humName = humanPlyrsID.getPlayerName();
//            int humPos = humanPlyrsID.getToken();
//            int humScore = humanPlyrsID.getScores();
//            int comPos = compPlyrsID.getToken();
//            int comScore =compPlyrsID.getScores();
//        
//        String filename = "Uppers-and-Downers.txt";
//        try {   
//            FileWriter writer = new FileWriter(filename, true); //puts text onto new line so doesnt overwrite
//            BufferedWriter out = new BufferedWriter(writer);
//            
//            
//            //out.write(stringName+"\r\n"+stringPos+"\r\n"+stringScore+"\r\n"+stringComPos+"\r\n"+stringComScore);
//            //out.write("hello");
//            out.close();
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(null, "this is an error");
//        }
//
//       
////        for(int i=0; i<humanPlayers.size(); i++)
////            String string = string+humanPlayers.get(i)+","+cpuPlayers.get(i)+";";
////        
////        String filename = "save.txt";
////        try {   
////            FileWriter writer = new FileWriter(filename, true); //puts text onto new line so doesnt overwrite
////            BufferedWriter out = new BufferedWriter(writer);
////            out.write(string+"\r\n");
////            //out.write("hello");
////            out.close();
////        } catch (IOException e) {
////            JOptionPane.showMessageDialog(null, "this is an error");
////        }
//
//    }
  //  public void load(String fileName){
//        ArrayList<String> saves = new ArrayList<String>();
//        String filename = "save.txt";
//        try {
//            File file = new File(filename);
//            FileReader reader = new FileReader(file);
//            BufferedReader buffer = new BufferedReader(reader);
//            while (buffer.ready()) {
//                String string_from_file = buffer.readLine();
//                saves.add(string_from_file);
//            }
//        } catch (IOException e) {
//        	e.printStackTrace();
//        }
 //   }
    
    
    
    public void start(String name, int rows, int cols){
        humanPlyrName = name;
        //game = new Game();         
        // int count =0; 
         
         players.add(new HumanPlayer(humanPlyrName));
         players.add(new Computer());
         
         setPlayerID();
         
         humanPlyrsID.setToken(0);
         compPlyrsID.setToken(0);
         
         board.setBoardSize(rows,cols);
         board.makeBoard();
    }
    
    
    public void quit(){
        System.exit(0);
    }
    
    
    public void roll(){
        die.roll();
        
        if(die.getNumberRolled() == die.getNumberOfSides())
            new Score(10);
    }
    
    public int getNumberRolled(){
        return die.getNumberRolled();
    }
    public void move(int x, int y){
        
        //int x += die.getNumberRolled()
                
    }
    public void drawBoard(BoardGame aBoard, ArrayList<HumanPlayer> humanPlayers, ArrayList<Computer> cpuPlayers){
       // aBoard.setBoardSize(20,20,dimensions);
    }
    public void bump(){
        //if(humanPlayer.get(i))
    }
    public ArrayList<Player> getPlayer(){
        return players;
    }
    
    public void pause(){

    }

    public void addPlayer(Player aPlayer, String name){
        aPlayer = new HumanPlayer(name);
        players.add(player);
        aPlayer = new Computer();
        players.add(player);

    }

    public void resume() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void manCaller(String command, int length) {
        manual = new Manual(command, length); 
        
    }
    
            
            
}
