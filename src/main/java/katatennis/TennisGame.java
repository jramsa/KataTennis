/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katatennis;

/**
 *
 * @author jerry
 */
public class TennisGame {
    
    private int playerOneScore;
    private int playerTwoScore;
    
    private final int FORTY = 40;
    private final int THIRTY = 30;
    private final int FIFTEEN = 15;
    private final int ZERO = 0;
    
    public TennisGame(){
        playerOneScore = 0;
        playerTwoScore = 0;
    }
    
    public String getScores(){
        if(isPlayerOneWin()){
            return "Player One win the game";
        }
        else if(isPlayerTwoWin()){
            return "Player Two win the game";
        }
        else if(isAdvantagePlayerOne()){
            return "Advantage Player One";
        }
        else if(isAdvantagePlayerTwo()){
            return "Advantage Player Two";
        }
        else if(isDeuce()){
            return "Deuce";
        }
        else if(playerOneScore==playerTwoScore && !isDeuce()){
            return showScores(playerOneScore) + "-A";
        }
        else{
            return showScores(playerOneScore) + "-" + showScores(playerTwoScore);
        }
    }
    
    public boolean isDeuce(){
        return playerOneScore >= 3 && playerTwoScore==playerOneScore;
    }
    
    public boolean isAdvantagePlayerOne(){
        return playerOneScore >= 4 && playerOneScore == playerTwoScore + 1;
    }
    
    public boolean isAdvantagePlayerTwo(){
        return playerTwoScore >= 4 && playerTwoScore == playerOneScore + 1;
    }
    
    public boolean isPlayerOneWin(){
        return playerOneScore >= 4 && playerOneScore >= playerTwoScore + 2; 
    }
    
    public boolean isPlayerTwoWin(){
        return playerTwoScore >= 4 && playerTwoScore >= playerOneScore + 2; 
    }
    
    public int showScores(int score){
        switch (score) {
            case 0 -> {
                return ZERO;
            }
            case 1 -> {
                return FIFTEEN;
            }
            case 2 -> {
                return THIRTY;
            }
            case 3 -> {
                return FORTY;
            }
            default -> {
                return ZERO;
            }
        }
    }
    
    public void initScores(){
        playerOneScore = 0;
        playerTwoScore = 0;
    }
    
    public void playerOneScore(){
        playerOneScore++;    
    }
    
    public void playerTwoScore(){
        playerTwoScore++;     
    }
}
