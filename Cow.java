package ProjectU2;
public class Cow {
    private String name;
    private double weight;
    private int age;
    private boolean gender; //gender true = male

    public Cow(){
       name = "None";
       age = 0;
       weight = 75;
       gender = true;
    }
    public Cow(String n, double w, int a, Boolean g){
        name = n;
        age = a;
        weight = w;
        gender = g;
    }
    public void makeNoise(){
        System.out.println("Mooooo");
    }
    public void haveBirthday(){
        age++;
    }
    public void displayCow(){
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    
}
