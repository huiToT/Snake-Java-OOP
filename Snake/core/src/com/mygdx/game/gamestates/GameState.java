package com.mygdx.game.gamestates;

import com.mygdx.game.managers.StateManage;

public abstract class GameState implements States{
    final StateManage stateManager;

    GameState(StateManage stateManager) {
        this.stateManager = stateManager;
        setup();
    }

    protected abstract void setup();

}
