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

    public void makeNoise(){
        System.out.println("Cluck Cluck");
    }

    public void eatFood(int amount){
        weight+=amount;
    }
    public void displayChicken(){
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + weight);
        System.out.println("Eggs Laied per Day: " + eggsADay);
        System.out.println("Is mean: " + mean);
    }
}

