package application;

import boardgame.Position;
import chess.ChessMatch;

public class Program {
	public static void main(String[] args) {
		Position pos = new Position(3, 5);
		
		
		ChessMatch chessMath = new ChessMatch(); 
		UI.printBoard(chessMath.getPieces());
	}
}
