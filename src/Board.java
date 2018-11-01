import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Board extends JPanel {
	
	private Dimension d = new Dimension(100, 100);
	private final JPanel[][] tiles = new JPanel[8][8];
	ArrayList<Piece> white_pieces = new ArrayList<Piece>();
	ArrayList<Piece> black_pieces = new ArrayList<Piece>();
//	private int oldX;
//	private int oldY;
//	private int newX;
//	private int newY;
	
	public Board(int size, JPanel game_panel) {

		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				JPanel tile = new JPanel();
				tile.setPreferredSize(d);
				tile.setMinimumSize(d);
				if((i + j) % 2 == 1) {
					tile.setBackground(Color.BLACK);
				}
				else {
					tile.setBackground(Color.WHITE);
				}
				game_panel.add(tile);
				tiles[i][j] = tile;
				tile.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						System.out.println();
					}
				});
			}
		}
		setUpBoard();
	}
	
	public void setUpBoard() {
		Pawn wp1 = new Pawn(0, 6, 0);
		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File("images/pawn_white.png"));
			myPicture.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			picLabel.setPreferredSize(d);
			picLabel.setMinimumSize(d);
			tiles[6][0].add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void resetBoard() {
		
	}
	
	public void movePiece(int oldX, int oldY, int newX, int newY) {
		
	}
	
	public void isCheckmate() {
		
	}
	
}
