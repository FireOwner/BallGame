package com.example.mateusz.ballgame;

/**
 * Created by Mateusz on 2015-07-11.
 */
public class GameManager {

    private static GameManager INSTANCE;

    GameManager() {
    }

    public static GameManager getInstance() {

        if(INSTANCE == null) {
            INSTANCE = new GameManager();
        }

        return  INSTANCE;
    }

}
