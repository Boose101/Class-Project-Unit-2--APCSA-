package ProjectU2;
public class Main {
    public static void main(String[] args){
        Cow franny = new Cow();
        Cow greta = new Cow("Gretta", 100, 1, false);
        System.out.println(franny.makeNoise());
        greta.haveBirthday();
        System.out.println(greta.displayCow());

        Chicken clucky = new Chicken();
        Chicken marshmallow = new Chicken("Sussex", 2, false, 83.5);
        System.out.println(clucky.makeNoise());
        marshmallow.eatFood(10);
        System.out.println(marshmallow.displayChicken());

        Pig piglet = new Pig();
        Pig pickles = new Pig("Yellow", 10, true, 567.88);
        System.out.println(pickles.makeNoise());
        piglet.upgradePenSize(3);
        System.out.println(piglet.displayPig());
        
    
    }
}
