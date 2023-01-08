package com.example.programaticandroid.front;

import com.example.programaticandroid.R;
import java.util.Random;

public class JokenpoGame {
    private static int[] images = {
            R.drawable.stone,
            R.drawable.paper,
            R.drawable.scissors,
            R.drawable.lizard,
            R.drawable.spok
    };
    private static int wins = 0;
    private static int draws = 0;
    private static int loses = 0;
    static int getWins() {return wins;}
    static int getDraws() {return draws;}
    static int getLoses() {return loses;}
    static int play(int playerChoseImage) {
        int playerChose = convertImageIdToIndex(playerChoseImage);
        int cpuChoose = new Random().nextInt(5);
        if (playerChose == 0 && cpuChoose == 2 || playerChose == 0 && cpuChoose == 3 ||
                playerChose == 1 && cpuChoose == 0 || playerChose == 1 && cpuChoose == 4 ||
                playerChose == 2 && cpuChoose == 1 || playerChose == 2 && cpuChoose == 3 ||
                playerChose == 3 && cpuChoose == 1 || playerChose == 3 && cpuChoose == 4 ||
                playerChose == 4 && cpuChoose == 0 || playerChose == 4 && cpuChoose == 2) {
            wins++;
        }
        else if (playerChose == cpuChoose) {
            draws++;
        }
        else {
            loses++;
        }
        return images[cpuChoose];
    }
    private static int convertImageIdToIndex(int playerChoseImage) {
        for(int counter = 0; counter <= images.length; counter ++) {
            if (images[counter] == playerChoseImage) {
                return counter;
            }
        }
        return 0;
    }
}
