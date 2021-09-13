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
public class TennisGameTest{
    
    public TennisGameTest() {
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
    
    TennisGame game = new TennisGame();
    
    private void manageScoreGame(int scorePlayerOne, int scorePlayerTwo ) {
        game.initScores();
	for (int i = 0; i < scorePlayerOne; i++) {
            game.playerOneScore();
	}
        for (int i = 0; i < scorePlayerTwo; i++) {
            game.playerTwoScore();
	}
    }
    
    @Test
    public void testScore0A(){
	assertEquals("0-A", game.getScores());
    }
    
    @Test
    public void testScore150(){
        manageScoreGame(1,0);
	assertEquals("15-0", game.getScores());
    }
    
    @Test
    public void testScore3015(){
        manageScoreGame(2,1);
	assertEquals("30-15", game.getScores());
    }
    
    @Test
    public void testScoreDeuce(){
        manageScoreGame(3,3);
	assertEquals("Deuce", game.getScores());
    }
    
    @Test
    public void testScoreAdvantageP1(){
        manageScoreGame(5,4);
	assertEquals("Advantage Player One", game.getScores());
    }
    
    @Test
    public void testScoreP1Win(){
        manageScoreGame(4,2);
	assertEquals("Player One win the game", game.getScores());
    }
    
    @Test
    public void testScoreAdvantageP2(){
        manageScoreGame(4,5);
	assertEquals("Advantage Player Two", game.getScores());
    }
    
    @Test
    public void testScoreP2Win(){
        manageScoreGame(10,12);
	assertEquals("Player Two win the game", game.getScores());
    }
    
}
