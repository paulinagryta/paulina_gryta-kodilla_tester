package com.kodilla.collections.interfaces.homework;

public class Honda implements Car {

        private int speed;

        public Honda(int speed) {
            this.speed = speed;
        }

        public int getSpeed() {
            return  (3 * increaseSpeed() + 2 * decreaseSpeed());
        }

        public int increaseSpeed() {
            return 2 * speed;
        }

        public int decreaseSpeed(){
            return speed - 88;
    }
}
