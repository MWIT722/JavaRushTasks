package com.javarush.task.FactoryMethod.male;

import com.javarush.task.FactoryMethod.Human;
import com.javarush.task.FactoryMethod.AbstractFactory;

public class MaleFactory implements AbstractFactory {

    public Human getPerson(int age) {
        Human human = null;
        if (age <= KidBoy.MAX_AGE) {
            human = new KidBoy();
        } else if (age <= TeenBoy.MAX_AGE) {
            human = new TeenBoy();
        } else
            human = new Man();
        return human;
    }
}
