public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Sanskar"); //parametrised constructor
        Student s2 = new Student(2110991264); //parametrised constructor
        System.out.println(s1.name);

        Student s3 = new Student();
        s3.name = "Sanskar";
        s3.roll= 2110991264;
        s3.password="12345678";
        s3.marks[0]=100;
        s3.marks[1]=90;
        s3.marks[2]=80;

        Student s4 = new Student(s3); //copy constructor
        s4.password = "xyz";
        s3.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.print(s4.marks[i]+" ");
        }

       
        

    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];


    //Shallow copy constructor
    Student(Student s3){ 
        marks=new int[3];
        this.name = s3.name;
        this.roll= s3.roll;
        this.marks = s3.marks;
    }

    //deep copy constructor
    // Student(Student s3){
    //     marks= new int[3];
    //     this.name = s3.name;
    //     this.roll = s3.roll;
    //     for(int i=0;i<marks.length;i++){
    //         this.marks[i]=s3.marks[i];
    //     }

    // }


    //non-parametrized constructor
    Student(){ 
        marks=new int[3];
        System.out.println("hello");
    }
    //parametrized constructor
    Student(String name){ 
        marks=new int[3];
        this.name=name; 
    }
    //parametrized constructor
    Student(int roll){ 
        marks=new int[3];
        this.roll=roll; 
    }
   

}


