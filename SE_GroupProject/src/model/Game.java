package model;

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
    private BoardGame board;
    private Score scoreLine;
    private Die die;
    private ArrayList<HumanPlayer> humanPlayers;
    private ArrayList<Computer> cpuPlayers;
    private Player player;
    
    public Game(){
       // manualAccess = new Manual();
        board = new BoardGame();
        scoreLine = new Score();
        die = new Die();
        humanPlayers = new ArrayList<HumanPlayer>();
        cpuPlayers = new ArrayList<Computer>();
        //player = new Player();
    }
    
    public void save(){
        //for(int i=0; i<humanPlayers.size(); i++)
            String stringName = "";
            String stringPos;
            String stringScore;
            String stringComPos;
            String stringComScore;
        
        String filename = name+".txt";
        try {   
            FileWriter writer = new FileWriter(filename, true); //puts text onto new line so doesnt overwrite
            BufferedWriter out = new BufferedWriter(writer);
            out.write(stringName+"\r\n"+stringPos+"\r\n"+stringScore+"\r\n"+stringComPos+"\r\n"+stringComScore);
            //out.write("hello");
            out.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "this is an error");
        }
    }
    public void load(){
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
    }
    public void start(){
        //this.drawBoard(board, humanPlayers, cpuPlayers);
        //for(ArrayList<HumanPlayer> i: humanPlayer)
    }
    public void end(){
        
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
    public ArrayList<HumanPlayer> getHumanPlayer(){
        return humanPlayers;
    }
    public void cmdHandler(String cmd){
        
    }
    public void setHumanPlayer(){
       // humanPlayers.add()
    }
    
            
            
}
