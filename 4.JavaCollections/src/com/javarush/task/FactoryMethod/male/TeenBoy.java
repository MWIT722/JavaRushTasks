package com.javarush.task.FactoryMethod.male;

import com.javarush.task.FactoryMethod.Human;

public class TeenBoy implements Human {
    public static final int MAX_AGE = 19;

    @Override
    public String toString() {
        return "TeenBoy{}";
    }
}
