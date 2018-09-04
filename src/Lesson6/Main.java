package Lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Additional task
        Calculator calculator = new Calculator();

        Random random = new Random();
        int c = random.nextInt(10);
        calculator.plus(4, c);
        calculator.minus(4, c);
        calculator.mult(4, c);
        calculator.division(4, c);

        //Task nubmer 2
        Vehicle.Door door  = new Vehicle().new Door();
        door.print();
        Vehicle.Wheel.print();

        //Task number 3
        System.out.println(Distance.Converter.kmInMetr(200));
        System.out.println(Distance.Converter.kmInMiles(10));
    }
}
