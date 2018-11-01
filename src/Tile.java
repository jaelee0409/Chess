import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Tile extends JPanel {
	
	private int row;
	private int col;
	private int size;
	private boolean occupied;
	
	public Tile(int row, int col, int size) {
		this.size = size;
		this.row = row;
		this.col = col;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(100, 100, 100, 100);;
	}
		
	public boolean isOccupied() {
		return occupied;
	}
	
	public void setOccupied(boolean b) {
		occupied = b;
	}
}