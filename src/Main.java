
import com.nitya.Palindrome;
import com.Inherit.*;
import com.polymorphism.*;
import com.AbstractDemo.*;
import com.polymorphism2.*;
import com.upcasting_downcasting.* ;
import com.Inner_class.*;
import com.Abstract_Anonymous.*;
import com.Interfaces.*;
import com.Functional_interface.*;
import com.generic_class.*;
import com.generic_method.*;

public class Main {

    // create a class Student
    static class Student {
        int rollNo;
        String name;
        float marks;

        // parametarized constructor
        Student(int rollNo, String name, float marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        // constructor inside constructor
        Student() {
            this(0, "default", 0.0f);
        }

        // copy constructor
        Student(Student Other) {
            this(Other.rollNo, Other.name, Other.marks);
            /*
             * this.rollNo=Other.rollNo;
             * this.name=Other.name;
             * this.marks=Other.marks;
             */
        }

        void display() {
            System.out.println(this.name);
            System.out.println(this.rollNo);
        }
    }

    public static void main(String[] args) {

        // you can't access non static stuff without referencing their instatnces in a
        // static context
        int[] numbers = new int[5];

        String[] names = new String[5];

        Student kashya = new Student(1, "Kashya", 45.5f);

        kashya.display();

        Student Randi = new Student();
        Randi.display();

        Student Kanya = new Student(kashya);
        Kanya.display();

        System.out.println(Palindrome.palindrome("kbyak"));
        Human h1 = new Human("gyt", 10, "male");
        Human h2 = new Human("g9t", 10, "male");
        System.out.println(h1); //see how println work
        h1.show_details();
        h2.show_details();
        System.out.println("vhjguguk");
        System.out.println(Human.population);
        Human.show_names();

        //Sigleton object
        Singleton s= Singleton.getInstance(90);
        s.show();
        Singleton s2= Singleton.getInstance(70);
        s2.show();

        //Inheritance
        Box b1= new Box(2,3,4);
        Box b2= new Box(4,5,6);
        System.out.println(b1.getVolume());
        System.out.println(b2.getVolume());
        Boxweight bw1=new Boxweight(2,3,4,5);
        System.out.println(bw1.getVolume());
        bw1.showWeight();

        //Polymorphism
        //Compile time Polymorphism===method overloading
        //Runtime Polymorphism===overriding
        Shapes sp1= new Circle(6);
        Shapes sp2= new Rectangle(7,5);
        Square sq1= new Square(5);
        System.out.println(sp1.toString());
        sp2.Area();
        sp1.Area();
        sq1.Area();
        Adv_cal c1=new Adv_cal();
        System.out.println(c1.add(6,7,8));
        //Actually it's calling Shapes ka Area method, but internally it's executing the Circle one at runtime,
        // it's because of overriding
        //overriding can't be done in instance variable
        //overriding can't be done on static method but it can be inherited

        //Final keyword, for variable use as const, for class it can't be inherited, for method it can't be override

        //upcasting and downcasting\
        A a= new B();
        System.out.println(a.getClass());
        a.methodA();
        //a.methodB(); //this will give error
        B b= (B)a;
        b.methodA();
        b.methodB();

        //to make primitive datatype to non-primitive datatype, we use wrapper class
        int num=267;
        Integer n= Integer.valueOf(num);
        Integer num1=num;    //autoboxing
        String sr=num1.toString();
        System.out.println(num1);
        System.out.println(sr.getClass());
        Integer num3=Integer.parseInt(sr);
        System.out.println(num3.getClass());

        //inner class
        Inner in= new Inner(6,7);
        in.sum();
        Inner.B bin= new Inner.B();
        bin.sum2();
        //non-static inner class
        Inner.C cin= in.new C();
        cin.sum3();
        //anonymous inner class
        Inner in1= new Inner(6,9) {
           @Override
           public void sum(){
               System.out.println(this.a*this.b);
           }
        };
        in1.sum();




       // Abstract Class---we can create a object of Abstract Class, but can't instantiated it
        Son s1= new Son();
        s1.partner();

        //Abstract anonymous class
        A_A_I aai= new A_A_I(){
            @Override
            public void Show() {
                System.out.println("Fuck you");
            }
        } ;

        Device desktop= new Desktop("desk709");
        Device laptop= new Laptop("dell");

        Developer dev1= new Developer(desktop);
        Developer dev2= new Developer(new Desktop("desk675"));
        Developer dev3= new Developer(laptop);

        dev1.using_device();
        dev2.using_device();
        dev3.using_device();
        desktop.show();

        //interfaces
        Hybrid_animal h_a= new Hybrid_animal();
        h_a.run();
        h_a.fly();
        h_a.animalSound();
        h_a.sleep();
        Pro_animal p_a= new Pro_animal() {
            @Override
            public void jump() {
                    System.out.println("jump jump");
            }

            @Override
            public void animalSound() {
                    System.out.println("pok pok");
            }

            @Override
            public void run() {
                     System.out.println("run run");
            }

            @Override

            public void sleep() {
                System.out.println("sleep sleep");
            }
        };
        p_a.jump();
        p_a.animalSound();
        p_a.run();

        //Functional interfaces
        F_i add_2_nos= new F_i() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(add_2_nos.add(5,6));
        //Lambda expression
        F_i add_2_nos2= (int c,int d) -> c+d;
        System.out.println(add_2_nos2.add(5,6));

        //generic class
        Generic_pair<String,Integer> pr1= new Generic_pair<String,Integer>("Mango",1);
        System.out.println(pr1.show_pair());

        //generic methods
        G_m g= new G_m();
        g.show(6.7,"gyt",9.56f,23);
        //g.show2("fgrgr",9,8.7f,7.899);  //will give error
        String st="bjhui";














    }
}
