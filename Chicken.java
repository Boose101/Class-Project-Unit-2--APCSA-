package ProjectU2;

public class Chicken {
    private String breed;
    private int eggsADay;
    private boolean mean;
    private double weight;

    public Chicken(){
        breed = "Plymouth Rock";
        eggsADay = 1;
        mean = true;
        weight = 5.7;
    }

    public Chicken(String b, int e, boolean m, double w){
        breed = b;
        eggsADay = e;
        mean = m;
        weight = w;
    }

    public String makeNoise(){
        return "Cluck Cluck";
    }

    public void eatFood(int amount){
        weight+=amount;
    }
    public String displayChicken(){
        return("Breed: " + breed + '\n' +
            "Weight: " + weight + '\n' +
            "Eggs Laied per Day: " + eggsADay + '\n' +
            "Is mean: " + mean);
    }
}

