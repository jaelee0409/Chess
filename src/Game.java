import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Game extends JFrame {

	private boolean player1;
	private boolean player2;
	private Button new_button, undo_button;
	
	public Game() {
		// MENU BAR
		JToolBar menu = new JToolBar();
        menu.setFloatable(false);
		new_button = new Button("NEW");
		menu.add(new_button);
		undo_button = new Button("UNDO");
		menu.add(undo_button);
		
		add(menu, BorderLayout.PAGE_START);
		
        // CHESS TILES
        JPanel game_panel = new JPanel();
		game_panel.setBorder(new EmptyBorder(20, 20, 20, 20));
		game_panel.setLayout(new GridLayout(8, 8));
		
		Board board = new Board(100, game_panel);
		
		add(game_panel);
		
		// APP FRAME
		setTitle("My Chess Program");
		setSize(1000, 1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Game();
	}
}
