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

