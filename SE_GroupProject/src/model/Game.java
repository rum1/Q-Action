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
    private Game game;
    private BoardGame board;
    private Score scoreLine;
    private Die die;
    private ArrayList<Player> players;
    
    private Player player;
    
    public Game(){
       // manualAccess = new Manual();

        board = new BoardGame();
        scoreLine = new Score();
        die = new Die();
        players = new ArrayList<Player>();
<<<<<<< HEAD

=======
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
>>>>>>> backupBranch
    }
    
    public void save(){
//        for(int i=0; i<humanPlayers.size(); i++)
//            String string = string+humanPlayers.get(i)+","+cpuPlayers.get(i)+";";
//        
//        String filename = "save.txt";
//        try {   
//            FileWriter writer = new FileWriter(filename, true); //puts text onto new line so doesnt overwrite
//            BufferedWriter out = new BufferedWriter(writer);
//            out.write(string+"\r\n");
//            //out.write("hello");
//            out.close();
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(null, "this is an error");
//        }
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
         game = new Game();
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
    public ArrayList<Player> getPlayer(){
        return players;
    }
    


    public void cmdHandler(String cmd){
         switch(cmd){
            case "start":
                     start();
                     break;
            case "move":
                     move(0,0);
                     break;



        }


    }


    public void addPlayer(Player aPlayer, String name){
        aPlayer = new HumanPlayer(name);
        players.add(player);
        aPlayer = new Computer();
        players.add(player);

    }
    
            
            
}
