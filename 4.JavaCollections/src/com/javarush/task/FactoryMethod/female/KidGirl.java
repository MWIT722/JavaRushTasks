package com.javarush.task.FactoryMethod.female;

import com.javarush.task.FactoryMethod.Human;

public class KidGirl implements Human {
    public static final int MAX_AGE = 12;

    @Override
    public String toString() {
        return "KidGirl{}";
    }
}
