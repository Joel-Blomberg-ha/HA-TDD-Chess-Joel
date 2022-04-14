package ax.ha.tdd.chess.engine;

import ax.ha.tdd.chess.engine.pieces.Bishop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class BishopTest {

    @Test
    public void Bishop_first_step_test1(){
        Assertions.assertTrue(new Bishop(Player.BLACK, new Coordinates(1, 1)).canMove(new Chessboard(), new Coordinates(2, 2)));
    }

    @Test
    public void Bishop_incorect_angle_FALSE(){
        Assertions.assertFalse(new Bishop(Player.BLACK, new Coordinates(1, 1)).canMove(new Chessboard(), new Coordinates(2, 3)));
    }

}
