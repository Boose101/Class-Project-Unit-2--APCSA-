package ProjectU2;
public class Main {
    public static void main(String[] args){
        Cow franny = new Cow();
        Cow greta = new Cow("Gretta", 100, 1, false);
        franny.makeNoise();
        greta.haveBirthday();
        greta.displayCow();

        Chicken clucky = new Chicken();
        Chicken marshmallow = new Chicken("Sussex", 2, false, 83.5);
        clucky.makeNoise();
        marshmallow.eatFood(10);
        marshmallow.displayChicken();

        Pig piglet = new Pig();
        Pig pickles = new Pig("Yellow", 10, true, 567.88);
        pickles.makeNoise();
        piglet.upgradePenSize(3);
        piglet.displayPig();
        
    
    }
}
