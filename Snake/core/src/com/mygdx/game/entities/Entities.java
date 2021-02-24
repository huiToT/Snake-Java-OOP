package com.mygdx.game.entities;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public interface Entities {

    // common abstract method use in many classes

    /**
     *
     * @param dt
     */
    void update(float dt);


    /**
     *
     * @param sr
     */
    void draw(ShapeRenderer sr);

}
