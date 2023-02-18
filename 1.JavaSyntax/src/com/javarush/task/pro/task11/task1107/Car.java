package com.javarush.task.pro.task11.task1107;

/* 
Двигатель — сердце автомобиля
*/

public class Car {
    //напишите тут ваш код
    static  Engine engine;

    public static void main(String[] args) {
 
        Car.engine.start();

        Car.engine.stop();
 
    }

    //напишите тут ваш код
     class Engine{

        private boolean isRunning;

        public void start(){
            isRunning = true;
        }

        public void stop(){
            isRunning = false;
        }
    }
}