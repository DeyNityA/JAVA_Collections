import java.util.ArrayList;

public class Human {
    private String name;
    private int age;
    private String gender;
    static int population;
    static ArrayList<String> population_list;
    // intialization of static variable
    static {
        population = 1;
        population_list = new ArrayList<String>();
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        population++;
        population_list.add(name);
    }

    public Human() {
        this(null, 0, null);
    }

    public void show_details() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }

    public static void show_names() {
        System.out.println(population_list);

    }
    @Override
    public String toString(){
      return this.name+"("+this.age+")";
    }

}

