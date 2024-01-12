package chess.pieces;

public class King extends chess.ChessPiece {

        public King(boardgame.Board board, chess.Color color) {
            super(board, color);
        }

        @Override
        public String toString() {
            return "K";
        }
}
