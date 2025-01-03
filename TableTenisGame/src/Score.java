import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Score extends Rectangle {

	private static final long serialVersionUID = 1L;

	static int GAME_WIDTH;
	static int GAME_HEIHT;
	int player1;
	int player2;

	public Score() {

	}

	public Score(int GAME_WIDTH, int GAME_HEIHT) {
//		super();
		Score.GAME_WIDTH = GAME_WIDTH;
		Score.GAME_HEIHT = GAME_HEIHT;
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("Consolas", Font.PLAIN, 60));
		g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIHT);
		g.drawString(String.valueOf(player1 / 10) + String.valueOf(player1 % 10), (GAME_WIDTH / 2) - 85, 50);
		g.drawString(String.valueOf(player2 / 10) + String.valueOf(player2 % 10), (GAME_WIDTH / 2) + 20, 50);
	}

}
