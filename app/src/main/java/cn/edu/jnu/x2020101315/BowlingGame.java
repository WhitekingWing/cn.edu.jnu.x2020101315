package cn.edu.jnu.x2020101315;

public class BowlingGame {
    public int [][]scores = new int[12][2];
    public int currentIndex = 0;
    public void roll(int i) {
        scores[currentIndex / 2][currentIndex % 2] = i;
        if(i == 10)
        {
            currentIndex += 2;
        }
        else {
            currentIndex++;
        }
    }
    public int getScore()
    {
        int sum = 0;
        for(int i = 0;i < 10;i++)
        {
            sum+=scores[i][0] + scores[i][1];
            if(isSpare10(scores[i]))
            {
                sum += scores[i + 1][0] + scores[i + 1][1];
            }
            else {
                if (isSpare10(scores[i])) {
                    sum += scores[i + 1][0];
                }
            }
        }
        return sum;
    }

    private boolean isSpare10(int[] score) {
        return score[0] + score[1] == 10 || score[0] == 10;
    }
}
