public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object
        p1.setColor("Blue"); //set
        System.out.println(p1.getColor()); //print
        p1.setColor("Yellow"); //set
        p1.setTip(5);
        System.out.println(p1.getTip());
        System.out.println(p1.getColor());

        BankAcount myAcount = new BankAcount();
        myAcount.username = "iamsanskar";
        myAcount.setPassword("iamsanskar10");
    }



}

//Access Modifiers / Specifiers
class BankAcount{
    public String username;
    private String password;
    public void setPassword(String newPassword){
        this.password = newPassword;
    }



}


// class Pen{
//     //prop + functions
//     String color;
//     int tip;
//     //getters
//     String getColor(){
//         return this.color; //this means jo bhi object iss function ko call karega uss object ki hum baat kar rahe hai.
//     }
//     int getTip(){
//         return this.tip; //this means jo bhi object iss function ko call karega uss object ki hum baat kar rahe hai.
//     }
//     //setters
//     void setColor(String newColor){ 
//         this.color = newColor;
//     }
//     void setTip(int newTip){
//         this.tip = newTip;
//     }

// }
class Pen{
    //prop + functions
    private String color;
    private int tip;
    //getters
    String getColor(){
        return this.color; //this means jo bhi object iss function ko call karega uss object ki hum baat kar rahe hai.
    }
    int getTip(){
        return this.tip; //this means jo bhi object iss function ko call karega uss object ki hum baat kar rahe hai.
    }
    //setters
    void setColor(String newColor){ 
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }

}


