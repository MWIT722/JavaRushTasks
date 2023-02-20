package com.javarush.task.FactoryMethod.male;

import com.javarush.task.FactoryMethod.Human;

public class KidBoy implements Human {
    public static final int MAX_AGE = 12;

    @Override
    public String toString() {
        return "KidBoy{}";
    }
}
