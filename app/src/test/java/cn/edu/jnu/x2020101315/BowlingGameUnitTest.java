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
        rollMore(10,1);
        assertEquals(game.getScore(), 1 * 10);
    }
    @Test
    public void test_roll_second() {
        rollSpare();
        game.roll(8);
        rollMore(17,0);
        assertEquals(game.getScore(), 26);
    }
    @Test
    public void test_roll_third() {
        game.roll(10);
        game.roll(8);
        game.roll(1);
        rollMore(16,0);
        assertEquals(game.getScore(), 28);
    }
    private void rollSpare() {
        game.roll(3);
        game.roll(7);
    }

    private void rollMore(int n, int i) {
        for(int j = 0;j < n;j++)
        {
            game.roll(i);
        }
    }
}