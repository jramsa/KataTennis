/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.katatennis;

/**
 *
 * @author jerry
 */
public class TennisGame {
    
    private int playerOneScore;
    private int playerTwoScore;
    private boolean isAdvantagePlayerOne;
    private boolean isAdvantagePlayerTwo;
    private boolean playerOneWin;
    private boolean playerTwoWin;
    
    public TennisGame(){
        playerOneScore = 0;
        playerTwoScore = 0;
        isAdvantagePlayerOne = false;
        isAdvantagePlayerTwo = false;
        playerOneWin = false;
        playerTwoWin = false;
    }
    
    public void setAdvantagePlayerOne(boolean value){
        isAdvantagePlayerOne = value; 
    }
    
    public void setAdvantagePlayerTwo(boolean value){
        isAdvantagePlayerTwo = value; 
    }
    
    public String getScores(){
        if(isAdvantagePlayerOne && playerOneScore > 40){
            playerOneWin = true;
            return "Player One win the game";
        }else if(isAdvantagePlayerTwo && playerTwoScore > 40){
            playerTwoWin = false;
            return "Player Two win the game";
        }else if(isDeuce()){
            return "Deuce";
        }else if(playerOneScore==playerTwoScore && !isDeuce()){
            return playerOneScore + "-A";
        }else{
            return playerOneScore + "-" + playerTwoScore;
        }
    }
    
    public boolean isDeuce(){
        return playerOneScore == 40 && playerTwoScore==playerOneScore;
    }
    
    public int manageScore(int score, boolean isAdvantage){
        if(score >= 30 && !isAdvantage){
            score = 40;
        }else{
            score +=15;
        }
        return score;
    }
    
    public void increasePlayerOneScore(){
        playerOneScore=manageScore(playerOneScore, isAdvantagePlayerOne);    
    }
    
    public void increasePlayerTwoScore(){
        playerTwoScore=manageScore(playerTwoScore, isAdvantagePlayerTwo);     
    }

    /**
     * @return the playerOneWin
     */
    public boolean isPlayerOneWin() {
        return playerOneWin;
    }

    /**
     * @return the playerTwoWin
     */
    public boolean isPlayerTwoWin() {
        return playerTwoWin;
    }
}
