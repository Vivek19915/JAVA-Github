package com.company;

public class Q2 {
    interface vehicle {
        void changeGear(int gear);

        void speedup(double increase);

        void applyBrakes(double decrease);
    }

    static class Bike implements vehicle {
        private int gear;
        private double speed;

        public Bike(int gear, double speed) {
            this.gear = gear;
            this.speed = speed;
        }

        @Override
        public void changeGear(int gear) {
            this.gear = gear;
            System.out.println("The Gear of bike is changed to " + this.gear);
        }

        @Override
        public void speedup(double increase) {
            this.speed += increase;
            System.out.println("The speed of bike is increased to " + this.speed);
        }

        @Override
        public void applyBrakes(double decrease) {
            this.speed -= decrease;
            System.out.println("The speed of bike is decreased to " + this.speed);
        }
    }

    static class Bicycle implements vehicle {
        private int gear;
        private double speed;

        public Bicycle(int gear, double speed) {
            this.gear = gear;
            this.speed = speed;
        }

        @Override
        public void changeGear(int gear) {
            this.gear = gear;
            System.out.println("The Gear of bicycle is changed to " + this.gear);
        }

        @Override
        public void speedup(double increase) {
            this.speed += increase;
            System.out.println("The speed of bicycle is increased to " + this.speed);

        }

        @Override
        public void applyBrakes(double decrease) {
            this.speed -= decrease;
            System.out.println("The speed of bicycle is decreased to " + this.speed);
        }
    }

    public static void main(String[] args) {
        vehicle bike = new Bike(1, 20.0);
        vehicle bicycle = new Bicycle(1, 10.0);
        bike.changeGear(4);
        bike.speedup(30.3);
        bike.applyBrakes(10.1);
        System.out.println();
        bicycle.changeGear(7);
        bicycle.speedup(25.0);
        bicycle.applyBrakes(3.0);
    }
}
