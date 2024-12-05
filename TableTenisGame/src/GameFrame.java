import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	GamePanel panel;

	public GameFrame() {
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Table Tenis Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
