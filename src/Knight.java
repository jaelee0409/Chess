
public class Knight implements Piece {

	private boolean white;
	private boolean black;
	private int x;
	private int y;
	
	public Knight(int team, int x, int y) {
		if(team == 0) {
			white = true;
			black = false;
		}
		else {
			white = false;
			black = true;
		}
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean isBlack() {
		// TODO Auto-generated method stub
		return black;
	}

	@Override
	public boolean isWhite() {
		// TODO Auto-generated method stub
		return white;
	}

	@Override
	public boolean canMove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		if(isWhite()) {
			return "White Knight";
		}
		else {
			return "Black Knight";
		}
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getPieceNumber() {
		// TODO Auto-generated method stub
		if(isWhite()) {
			return 5;
		}
		else {
			return 6;
		}
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

}
