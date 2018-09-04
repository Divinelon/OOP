package Lesson6;

public class Calculator {
void plus (int a , int b)
{
    System.out.println(a + b);
}
void minus (int a , int b){
    System.out.println(a - b);
}
void division (int a , int b){
    if(b!=0)
        System.out.println(a / b);
    else
        System.out.println("Error");
}
void mult(int a , int b){
    System.out.println(a * b);
}
}
