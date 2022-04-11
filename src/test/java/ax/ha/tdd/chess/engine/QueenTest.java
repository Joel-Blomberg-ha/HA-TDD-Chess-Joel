package ax.ha.tdd.chess.engine;

import ax.ha.tdd.chess.engine.pieces.Queen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class QueenTest {

    @Test
    public void Q_rook_first_step_test1_Y() {
        Assertions.assertTrue(new Queen(Player.BLACK, new Coordinates(1, 0)).canMove(new Chessboard(), new Coordinates(1, 1)));
    }

    @Test
    public void Q_rook_first_step_test2_Y() {
        Assertions.assertTrue(new Queen(Player.WHITE, new Coordinates(1, 6)).canMove(new Chessboard(), new Coordinates(1, 5)));
    }

    @Test
    public void Q_rook_first_2step_test1_Y() {
        Assertions.assertTrue(new Queen(Player.BLACK, new Coordinates(1, 0)).canMove(new Chessboard(), new Coordinates(1, 2)));
    }

    @Test
    public void Q_rook_first_2step_test2_Y() {
        Assertions.assertTrue(new Queen(Player.WHITE, new Coordinates(1, 6)).canMove(new Chessboard(), new Coordinates(1, 4)));
    }

    @Test
    public void Q_rook_first_step_test1_X() {
        Assertions.assertTrue(new Queen(Player.BLACK, new Coordinates(0, 1)).canMove(new Chessboard(), new Coordinates(1, 1)));
    }

    @Test
    public void Q_rook_first_step_test2_X() {
        Assertions.assertTrue(new Queen(Player.WHITE, new Coordinates(6, 1)).canMove(new Chessboard(), new Coordinates(5, 1)));
    }

    @Test
    public void Q_rook_first_2step_test1_X() {
        Assertions.assertTrue(new Queen(Player.BLACK, new Coordinates(0, 1)).canMove(new Chessboard(), new Coordinates(2, 1)));
    }

    @Test
    public void Q_rook_first_2step_test2_X() {
        Assertions.assertTrue(new Queen(Player.WHITE, new Coordinates(6, 1)).canMove(new Chessboard(), new Coordinates(4, 1)));
    }

    @Test
    public void Q_rook_blocked_FALSE() {

        Chessboard mock = mock(Chessboard.class);

        mock.addPiece(new Queen(Player.WHITE, new Coordinates(4, 4)));

        Assertions.assertFalse(new Queen(Player.BLACK, new Coordinates(4, 1)).canMove(mock, new Coordinates(4, 6)));

    }

    @Test
    public void Q_rook_eat_rook() {
        Chessboard mock = mock(Chessboard.class);

        mock.addPiece(new Queen(Player.WHITE, new Coordinates(4, 4)));

        Assertions.assertTrue(new Queen(Player.BLACK, new Coordinates(4, 1)).canMove(mock, new Coordinates(4, 4)));

    }

    @Test
    public void Q_Bishop_first_step_test1(){
        Assertions.assertTrue(new Queen(Player.BLACK, new Coordinates(1, 1)).canMove(new Chessboard(), new Coordinates(2, 2)));
    }

    @Test
    public void Q_Bishop_incorect_angle_FALSE(){
        Assertions.assertFalse(new Queen(Player.BLACK, new Coordinates(1, 1)).canMove(new Chessboard(), new Coordinates(2, 3)));
    }
}
