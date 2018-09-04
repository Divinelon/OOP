package Lesson3.Abstraction;

public class Main {
    public static void main(String[] args) {
    Bird penguin = new Penguin();
    Ostrich ostrich = new Ostrich();
    Bird swallow = new Swallow();
    ISwim peng = new Penguin();
    IFly swall = new Swallow();

    peng.swim();
    swall.fly(100);
    ostrich.hideHead();
    penguin.run();
    swallow.run();
    penguin.eat();
    swallow.eat();


    }
}
