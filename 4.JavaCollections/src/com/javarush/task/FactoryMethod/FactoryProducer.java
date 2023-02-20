package com.javarush.task.FactoryMethod;

import com.javarush.task.FactoryMethod.female.FemaleFactory;
import com.javarush.task.FactoryMethod.male.MaleFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(HumanFactoryType type) {
        if (type == HumanFactoryType.MALE) {
            return new MaleFactory();
        } else {
            return new FemaleFactory();
        }
    }

    public enum HumanFactoryType {
        MALE,
        FEMALE
    }
}
