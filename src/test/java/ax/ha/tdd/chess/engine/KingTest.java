package ax.ha.tdd.chess.engine;

import ax.ha.tdd.chess.engine.pieces.King;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class KingTest {

    @Test
    public void King_first_step_test1(){
        Assertions.assertTrue(new King(Player.BLACK, new Coordinates(4, 4)).canMove(new Chessboard(), new Coordinates(5, 5)));
    }

    @Test
    public void King_first_step_test2(){
        Assertions.assertTrue(new King(Player.BLACK, new Coordinates(5, 5)).canMove(new Chessboard(), new Coordinates(4, 4)));
    }

    @Test
    public void King_first_step_test3(){
        Assertions.assertTrue(new King(Player.BLACK, new Coordinates(4, 4)).canMove(new Chessboard(), new Coordinates(4, 5)));
    }

    @Test
    public void King_first_step_test4(){
        Assertions.assertTrue(new King(Player.BLACK, new Coordinates(4, 4)).canMove(new Chessboard(), new Coordinates(5, 4)));
    }

    @Test
    public void King_wrong_step_FALSE(){
        Assertions.assertFalse(new King(Player.BLACK, new Coordinates(5, 5)).canMove(new Chessboard(), new Coordinates(3, 3)));
    }

    @Test
    public void King_No_step_FALSE(){
        Assertions.assertFalse(new King(Player.BLACK, new Coordinates(5, 5)).canMove(new Chessboard(), new Coordinates(5, 5)));
    }


}
