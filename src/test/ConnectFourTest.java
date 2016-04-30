package test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import connect.four.Game;
import connect.four.ScoreChart;
import connect.four.board.Board;
import connect.four.gui.GUI;
import connect.four.player.ComputerPlayer;
import connect.four.player.ConsolePlayer;
import connect.four.player.Player;

public class ConnectFourTest {

	ConsolePlayer p1;
	Player p2;
	Player computer;
	Game gameWithPlayers;
	Game gameWithComputer;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		p1 = new ConsolePlayer("Player 1");
		p2 = new ConsolePlayer("Player 2");
		computer = new ComputerPlayer();
		gameWithPlayers = new Game(new Player[] {p1, p2}, new Board(7, 6), 4);
		gameWithComputer = new Game(new Player[] {p1, computer}, new Board(7, 6), 4);

		
		
	    
	}

	@After
	public void tearDown() throws Exception {
		p1 = null;
		p2 = null;
		computer = null;
		gameWithPlayers = null;
		gameWithComputer = null;
		
	}

	@Test
	public void test() {
		assertTrue(gameWithPlayers.getScore(p1) == 0);
		assertTrue(gameWithPlayers.getScore(p2) == 0);
		assertTrue(gameWithComputer.getScore(computer) == 0);
		assertTrue(gameWithPlayers.getCurrentPlayer() == p1);
	}

}
