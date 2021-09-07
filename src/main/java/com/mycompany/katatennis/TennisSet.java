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
    
    
    public TennisSet(){
        playerOneSetScore = 0;
        playerTwoSetScore = 0;
        games = new ArrayList<>();
        cptGames = 0;
        playerOneWinSet = false;
        playerTwoWinSet = false;
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
        if(playerOneSetScore >= 6 && playerTwoSetScore <= 4){
            playerOneWinSet = true;
            return "Player One win the set";
        }else if(playerTwoSetScore >= 6 && playerOneSetScore <= 4){
            playerTwoWinSet = true;
            return "Player Two win the set";
        }else if(playerTwoSetScore == 7 ){
            playerTwoWinSet = true;
            return "Player Two win the set";
        }else if(playerOneSetScore == 7 ){
            playerOneWinSet = true;
            return "Player One win the set";
        }
        return playerOneSetScore + "-" + playerTwoSetScore + " ,score game : " + game.getScores();
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
