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
public class TennisSet {
    
    private int playerOneScore;
    private int playerTwoScore;
    private final TennisGame game;
    
    
    public TennisSet(){
        playerOneScore = 0;
        playerTwoScore = 0;
        game = new TennisGame();
    }
    
    public void playerOneScore(){
        playerOneScore++;    
    }
    
    public void playerTwoScore(){
        playerTwoScore++;     
    }
    
    public String getScores(){
        if(isPlayerOneWin()){
            return "Player One win the set";
        }
        else if(isPlayerTwoWin()){
            return "Player Two win the set";
        }
        else if(oneGameToPlay()){
            return "One game to play again";
        }
        else if(isTieBreak()){
            return "Tie Break";
        }
        else{
            if(game.isPlayerOneWin()){
                playerOneScore();
                return game.getScores();
            }else if(game.isPlayerTwoWin()){
                playerTwoScore();
                return game.getScores();
            }else {
                return playerOneScore + "-" + playerTwoScore + ", score : " + game.getScores();
            }
        }
    }
    
    public boolean isPlayerOneWin(){
        return playerOneScore > 6 && playerOneScore >= playerTwoScore + 2; 
    }
    
    public boolean isPlayerTwoWin(){
        return playerTwoScore > 6 && playerTwoScore >= playerOneScore + 2; 
    }
    
    public boolean isTieBreak(){
        return playerOneScore > 6 && playerTwoScore==playerOneScore;
    }
    
    public boolean oneGameToPlay(){
        return (playerOneScore > 6 && playerOneScore >= playerTwoScore + 1) || (playerTwoScore > 6 && playerTwoScore >= playerOneScore + 1 ); 
    }

    /**
     * @return the game
     */
    public TennisGame getGame() {
        return game;
    }
    
    public void initScores(){
        playerOneScore = 0;
        playerTwoScore = 0;
        game.initScores();
    }
    
}
