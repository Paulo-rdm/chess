package chess.pieces;

public class Rook extends chess.ChessPiece {

        public Rook(boardgame.Board board, chess.Color color) {
            super(board, color);
        }

        @Override
        public String toString() {
            return "R";
        }
}
