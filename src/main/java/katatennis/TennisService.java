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
public class TennisService {
    
    private final TennisSet tennisSet;
    
    public TennisService(){
        this.tennisSet = new TennisSet();
    }
    
    public TennisSet getTennisSet(){
        return this.tennisSet;
    }
    
    public static void main(String[] args){  
        
        TennisService ts = new TennisService();
        
        while(!ts.getTennisSet().isPlayerOneWin() && !ts.getTennisSet().isPlayerTwoWin()){
            
            ts.getTennisSet().getGame().initScores();      
            
            ts.getTennisSet().getGame().playerTwoScore();
            System.out.println(ts.getTennisSet().getScores());
            ts.getTennisSet().getGame().playerOneScore();
            System.out.println(ts.getTennisSet().getScores());
            ts.getTennisSet().getGame().playerTwoScore();
            System.out.println(ts.getTennisSet().getScores());
            ts.getTennisSet().getGame().playerOneScore();
            System.out.println(ts.getTennisSet().getScores());
            ts.getTennisSet().getGame().playerOneScore();
            System.out.println(ts.getTennisSet().getScores());
            ts.getTennisSet().getGame().playerTwoScore();
            System.out.println(ts.getTennisSet().getScores());
            
            ts.getTennisSet().getGame().playerOneScore();
            System.out.println(ts.getTennisSet().getScores());
            ts.getTennisSet().getGame().playerOneScore();
            System.out.println(ts.getTennisSet().getScores());
        } 
        System.out.println(ts.getTennisSet().getScores());
    }
}
