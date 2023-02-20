package com.javarush.task.FactoryMethod.female;

import com.javarush.task.FactoryMethod.Human;

public class TeenGirl implements Human {
    public static final int MAX_AGE = 19;

    @Override
    public String toString() {
        return "TeenGirl{}";
    }
}
