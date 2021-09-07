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
public class Main {
    public static void main(String[] args){  
        
        TennisSet set = new TennisSet();
        
        while(!set.isPlayerOneWinSet() && !set.isPlayerTwoWinSet()){
            
            //game 
            TennisGame game = new TennisGame();
            game.increasePlayerTwoScore();
            System.out.println(set.getSetScores(game));//0-15
            game.increasePlayerOneScore();
            System.out.println(set.getSetScores(game));//15-15
            game.increasePlayerTwoScore();
            System.out.println(set.getSetScores(game));//15-30
            game.increasePlayerOneScore();
            System.out.println(set.getSetScores(game));//30-30
            game.increasePlayerOneScore();
            System.out.println(set.getSetScores(game));//40-30
            game.increasePlayerTwoScore();
            System.out.println(set.getSetScores(game));//40-40 DEUCE

            game.setAdvantagePlayerTwo(true);
            System.out.println(set.getSetScores(game));//40-40 DEUCE, Player Two loses
            game.setAdvantagePlayerOne(true);
            game.increasePlayerOneScore();
            System.out.println(set.getSetScores(game));//Player One 

            if(game.isPlayerOneWin()){
                set.increasePlayerOneSetScore();
            }else if(game.isPlayerTwoWin()){
                set.increasePlayerTwoSetScore();
            }

            if(game.isPlayerOneWin() || game.isPlayerTwoWin()){
                set.addGame(game);
            }

            //System.out.println(set.getGames().size());
            System.out.println(set.getCptGames());
            
        } 
    }
}
