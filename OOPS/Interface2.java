public class Interface2 {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatsNonVeg();
        b.eatsVeg();

    }
}
interface Herbivore{
    void eatsVeg();
}
interface Carnivore{
    void eatsNonVeg();
}
class Bear implements Herbivore,Carnivore{
    public void eatsVeg(){
        System.out.println("Eats Veg");

    }
    public void eatsNonVeg(){
        System.out.println("Eats Non-veg");

    }
}

