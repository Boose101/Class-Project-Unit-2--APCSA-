import java.util.Scanner;
import java.lang.Thread;


public class Main {

    public static void main(String[] args){

        /* 
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
        */
        

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hello! Whats your name?");
        String name = scan.nextLine();
        sleep(2);
        System.out.println("Ohh Welcome Farmer " + name + "!");
        sleep(1);
        System.out.println("The farmer hasn't been running well in your absense");
        sleep(1);
        System.out.println("It's been a hard couple of months.");

        scan.close();

        //end of intro

        System.out.println("Here is the overview of the farm");



    }

    public static void sleep(int time){
        try{
            Thread.sleep(time*1000);
        }catch(Exception e){
            System.out.println("An error occured!");
            e.printStackTrace();
        }
    }


}
