package application;

import java.util.Scanner;

import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Position pos = new Position(3, 5);

		ChessMatch chessMath = new ChessMatch();

		while (true) {
			UI.printBoard(chessMath.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);

			System.out.println();

			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturedPiece = chessMath.performChessMove(source, target);

		}

	}
}
