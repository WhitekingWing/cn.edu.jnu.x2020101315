package cn.edu.jnu.x2020101315;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    @Test
    public void test_roll_first() {
        BowlingGame game = new BowlingGame();
        for(int i = 0;i < 10;i++)
        {
            game.roll(1);
        }
        assertEquals(game.score, 1 * 10);
    }
}