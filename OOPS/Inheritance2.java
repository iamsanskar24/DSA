public class Inheritance2 {
    public static void main(String[] args) {
        Human h1= new Human();
        h1.eat();
        h1.legs = 2;
        System.out.println(h1.legs);
        
    }
}
class Animal{
    String color;
    void breathe(){
        System.out.println("can breathe");
    }
    void eat(){
        System.out.println("can eat");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("can swim");
    }

}
class Shark extends Fish{
    
    void nature(){
        System.out.println("dangerous");
    }

}
class Tuna extends Fish{
    
    void nature(){
        System.out.println("pet type");
    }

}
class Bird extends Animal{
    int Wings;
    void fly(){
        System.out.println("can fly");
    }

}
class Peacock extends Bird{
    
    void nature(){
        System.out.println("Beatiful");
    }
}
class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("can walk");
    }

}
class Dog extends Mammals{
    
    void bark(){
        System.out.println("Brarks");
    }

}
class cat extends Mammals{
    
    void mewos(){
        System.out.println("meows");
    }

}
class Human extends Mammals{
    
    void Talks(){
        System.out.println("Talks");
    }

}

