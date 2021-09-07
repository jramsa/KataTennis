/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.katatennis;

import java.util.ArrayList;

/**
 *
 * @author jerry
 */
public class TennisSet {
    
    private int playerOneSetScore;
    private int playerTwoSetScore;
    private ArrayList<TennisGame> games;
    private int cptGames;
    private boolean playerOneWinSet;
    private boolean playerTwoWinSet;
    private boolean tieBreak;
    
    
    public TennisSet(){
        playerOneSetScore = 0;
        playerTwoSetScore = 0;
        games = new ArrayList<>();
        cptGames = 0;
        playerOneWinSet = false;
        playerTwoWinSet = false;
        tieBreak = false;
    }
    
    public void addGame(TennisGame game){
        getGames().add(game);
        cptGames +=1;
        
    }
    
    public void increasePlayerOneSetScore(){
        playerOneSetScore += 1;    
    }
    
    public void increasePlayerTwoSetScore(){
        playerTwoSetScore += 1;     
    }
    
    public String getSetScores(TennisGame game){
        if((playerOneSetScore >= 6 && playerTwoSetScore <= 4) ||( tieBreak && playerOneSetScore >= 6 && playerTwoSetScore <= playerOneSetScore-2)){
            playerOneWinSet = true;
            return "Player One win the set";
        }else if((playerTwoSetScore >= 6 && playerOneSetScore <= 4) || (tieBreak && playerTwoSetScore >= 6 && playerOneSetScore <= playerTwoSetScore-2)){
            playerTwoWinSet = true;
            return "Player Two win the set";
        }else if(playerTwoSetScore == 7 && !tieBreak){
            playerTwoWinSet = true;
            return "Player Two win the set";
        }else if(playerOneSetScore == 7 && !tieBreak){
            playerOneWinSet = true;
            return "Player One win the set";
        }else if(isTieBreak()){
            tieBreak = true;
            return "Tie Break";
        }
        return playerOneSetScore + "-" + playerTwoSetScore + " ,score game : " + game.getScores();
    }
    
    public boolean isTieBreak(){
        return playerOneSetScore == 6 && playerTwoSetScore==playerOneSetScore;
    }

    /**
     * @return the cptGames
     */
    public int getCptGames() {
        return cptGames;
    }

    /**
     * @return the games
     */
    public ArrayList<TennisGame> getGames() {
        return games;
    }

    /**
     * @return the playerOneWinSet
     */
    public boolean isPlayerOneWinSet() {
        return playerOneWinSet;
    }

    /**
     * @return the playerTwoWinSet
     */
    public boolean isPlayerTwoWinSet() {
        return playerTwoWinSet;
    }
    
}
