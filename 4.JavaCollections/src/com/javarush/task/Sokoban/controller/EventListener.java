package com.javarush.task.Sokoban.controller;

import com.javarush.task.Sokoban.model.Direction;

public interface EventListener {
    void move(Direction direction);

    void restart();

    void startNextLevel();

    void levelCompleted(int level);
}
