package model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rushi
 */
public abstract class Player {
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private int timespent;
    private int token;
    private Score playerScore;

    public int getGamesLost() {
        return gamesLost;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    

    public int getTimespent() {
        return timespent;
    }

    public int getToken() {
        return token;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public void setToken(int token) {
        this.token = token;
    }
    
    
}
