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
    public String makeNoise(){
        return "Mooooo";
    }
    public void haveBirthday(){
        age++;
    }
    
    public String displayCow(){
        return("Name: " + name + '\n' +
            "Weight: " + weight + '\n' +
            "Age: " + age + '\n' +
            "Gender: " + gender);
    }

    
}
