public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        // Dog Jack = new Dog();
        // Jack.eat();
        // Jack.legs = 4;
        // System.out.println(Jack.legs);
        
        
    }
    
}
//Base Class / Parent Class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }

}
//Derived Class/Sub Class/Child class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swim's in water");

//     }

//  }
class Mammals extends Animal{
    void walks(){
        System.out.println("walks");
    }

}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}

// class Dog extends Mammals {
//     String breed;
// }