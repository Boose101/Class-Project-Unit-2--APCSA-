package ProjectU2;

public class Pig {
    private String color;
    private int penSize;
    private boolean wallowed;
    private double weight;

    public Pig(){
        color = "Pink";
        penSize = 128;
        wallowed = true;
        weight = 285;
    }

    public Pig(String c, int p, boolean w, double we){
        color = c;
        penSize = p;
        wallowed = w;
        weight = we;
    }

    public void makeNoise(){
        System.out.println("Oink Oink");
    }

    public void upgradePenSize(int s){
        penSize += s;
    }

    public void displayPig(){
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Pen Size: " + penSize);
        System.out.println("Wallowed: " + wallowed);
    }
}

