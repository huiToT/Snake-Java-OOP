package com.mygdx.game.gamestates;

public interface States {
    /**
     *
     * @param time
     */
    public abstract void update(float time);

    /**
     *
     */
    public abstract void paint();

    /**
     *
     */
    public abstract void inputKeyHandle();

    /**
     *
     */
    public abstract void dispose();
}
