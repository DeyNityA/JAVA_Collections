
import com.Polymorphism_visibility.College;
import com.Polymorphism_visibility.Private_clg;
import com.nitya.Palindrome;
import com.Inherit.*;
import com.polymorphism.*;
import com.AbstractDemo.*;
import com.polymorphism2.*;
import com.upcasting_downcasting.A;
import com.Inner_class.*;
import com.Abstract_Anonymous.*;
import com.Interfaces.*;
import com.Functional_interface.*;
import com.generic_class.*;
import com.generic_method.*;
import com.Polymorphism_visibility.*;
import com.upcasting_downcasting.B;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Main {

    public static College2 exp(College2 c){
        return c;
    }

    public static College2 exp2(Private_clg2 c){
       c.greet_private();
        return c;
    }
    public static Private_clg2  exp3(College2 c){
        return (Private_clg2)c;
    }

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
        Adv_cal c1=new Adv_cal();
        System.out.println(c1.add(6,7,8));

        //Runtime Polymorphism===overriding
        Shapes spp = new Shapes();
        Shapes sp1= new Circle(6);
        Shapes sp2= new Rectangle(7,5);
        Square sq1= new Square(5);
        System.out.println(sp1.toString());
        System.out.println(sp1.getClass());
        System.out.println(sp1.getClass()== spp.getClass());
        System.out.println(sq1 instanceof Shapes);
        sp2.Area();
        sp1.Area();
        sq1.Area();
        //Actually it's calling Shapes ka Area method, but internally it's executing the Circle one at runtime,
        // it's because of overriding
        //overriding can't be done in instance variable
        //overriding can't be done on static method but it can be inherited, but redeclaring a static method
        //with the same signature in the subclass creates a new method that hides the superclass method
        sp2.show();
        Circle cr1= new Circle(6);
        Circle.show();
        cr1.show();
        Rectangle r1= new Rectangle(6,8);
        r1.show();
        Rectangle.show();

        //we can increase the visibility of the access modifier in child class
        College clg= new Private_clg();
        //clg.Infa(); it's overriden but we can't access for it's access specifier
        Private_clg pv_clg= new Private_clg();
        pv_clg.Infa();

        College2 clg2= new Private_clg2();
        clg2.Infa();
        //at the time of overriding we can change the type of method, but type should be subclass of the parent
        //class method type
        Private_clg2 pv_clg2= new Private_clg2();
        exp(pv_clg2).greet();
        exp(pv_clg2).Infa();
        exp2(pv_clg2).greet();
        exp(pv_clg2).Infa();
        //exp3(new College2()).greet_private();
        //exp3(new College2()).greet();
        //exp3(new College2()).Infa(); ---class College2 cannot be cast to class Private_clg2






        //Final keyword, for variable use as const, for class it can't be inherited, for method it can't be override

        //upcasting and downcasting
        A aaa= new B
                ();
        System.out.println(aaa.getClass());
        aaa.methodA();
        //a.methodB(); //this will give error
        B b= (B)aaa;
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
        h_a.show();

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
        p_a.show();


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
