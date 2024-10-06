public class Polymorphism{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1.6f,2.9f));
        System.out.println(calc.sum(1,5,4));
        Deer d = new Deer();
        d.eat();


    }
}
//overloading
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){//different return type and paramrter type
        return a+b;
    }
    int sum(int a, int b,int c){//different no. of parameters
        return a+b+c;
    }
}

//overriding
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}