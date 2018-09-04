package Lesson3.Abstraction;

interface IFly{
    void fly(int a);
}
interface ISwim{
    void swim();
}


public abstract class Bird  {
 abstract void eat();
 abstract void run();

}
class Swallow extends Bird implements IFly{

    @Override
    void eat() {
        System.out.println("I love eat worms");
    }

    @Override
    void run() {
        System.out.println("I prefer to fly");
    }

    @Override
    public void fly(int a) {
        System.out.println("I can fly " + a + " height");
    }
}
class Ostrich extends Bird{
    @Override
    void eat() {
        System.out.println("I love grass");
    }

    @Override
    void run() {
        System.out.println("I can run like a flsh ");
    }

    public void hideHead(){
        System.out.println("I can hide head");
    }
}
class Penguin extends Bird implements ISwim{

    @Override
    void eat() {
        System.out.println("I love fish");
    }

    @Override
    void run() {
        System.out.println("I can't run");
    }


    @Override
    public void swim() {
        System.out.println("I can swim and dive");
    }
}