package com.mygdx.game.managers;

import com.badlogic.gdx.Gdx;

import java.io.*;


public enum FileManager {
    MANAGER;

    public GameScore gameScore;
    private final String filename = "scores.dat";

    /**
     * Saves a file game with 10 highest scores.
     */
    public void save() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(gameScore);
            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
            Gdx.app.exit();
        }

    }

    /**
     * Loads file game saved high scores.
     */
    public void load() {
        try {
            if (!saveFileExists()) {
                init();
                return;
            }
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            gameScore = (GameScore) in.readObject();
            in.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
            Gdx.app.exit();
        }
    }

    /**
     * Checks if the file exists.
     *
     * @return true or false.
     */
    private boolean saveFileExists() {
        File f = new File(filename);
        return f.exists();
    }


    private void init() {
        gameScore = new GameScore();
        gameScore.init();
        save();
    }

}