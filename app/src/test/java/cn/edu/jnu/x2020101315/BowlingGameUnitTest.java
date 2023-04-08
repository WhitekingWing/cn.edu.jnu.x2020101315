package cn.edu.jnu.x2020101315;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    private BowlingGame game;
    @Before
    public void init(){
        game = new BowlingGame();
    }
    @Test
    public void test_roll_first() {
        for(int i = 0;i < 10;i++)
        {
            game.roll(1);
        }
        assertEquals(game.score, 1 * 10);
    }
    @Test
    public void test_roll_second() {
        game.roll(3);
        game.roll(7);
        game.roll(8);
        rollMore(17,0);
        assertEquals(game.score, 26);
    }

    private void rollMore(int n, int i) {
        for(int j = 0;j < n;j++)
        {
            game.roll(i);
        }
    }
}