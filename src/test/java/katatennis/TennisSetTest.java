/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katatennis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author jerry
 */
public class TennisSetTest{
    
    public TennisSetTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    TennisSet set = new TennisSet();
    String score = null;
    
    private void manageScoreSet(int scorePlayerOne, int scorePlayerTwo ) {
        set.initScores();
	for (int i = 0; i < scorePlayerOne; i++) {
            set.playerOneScore();
	}
        for (int i = 0; i < scorePlayerTwo; i++) {
            set.playerTwoScore();
	}
    }
    
    @Test
    public void testStartSet(){
        set.initScores();
	score = set.getScores();
	assertEquals("0-0, score : 0-A", score);
    }
    
    @Test
    public void testPlayerOneWin(){
        manageScoreSet(7,4);
        set.getGame().playerTwoScore();
	assertEquals("Player One win the set", set.getScores());
    }
    
    @Test
    public void testTieBreak(){
        manageScoreSet(7,7);
	assertEquals("Tie Break", set.getScores());
    }
    
    @Test
    public void testScoreSet76(){
        manageScoreSet(7,6);
	assertEquals("One game to play again", set.getScores());
    }
    
    @Test
    public void testPlayerTwoWinAfterTieBreak(){
        manageScoreSet(7,7);
        set.playerTwoScore();
        set.playerTwoScore();
	assertEquals("Player Two win the set", set.getScores());
    }
}
