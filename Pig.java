package ProjectU2;
import java.math.random;

public class Pig {
    private String color;
    private int penSize;
    private boolean wallowed;
    private double weight;
    private String[] c_options = {"Pink", "Black", "White", "Spotted", "Brindle"};
    private int c_rand = random.nextInt(c_options.length);

    public Pig(){
        color = c_options[c_rand];
        penSize = (random.nextInt(64) + 64);
        wallowed = true;
        weight = 285;
    }

    public Pig(String c, int p, boolean w, double we){
        color = c;
        penSize = p;
        wallowed = w;
        weight = we;
    }

    public String makeNoise(){
        return "Oink Oink";
    }

    public void upgradePenSize(int s){
        penSize += s;
    }

    public String displayPig(){
        return("Color: " + color + '\n' +
            "Weight: " + weight + '\n' +
            "Pen Size: " + penSize + '\n' +
            "Wallowed: " + wallowed);
    }
}

