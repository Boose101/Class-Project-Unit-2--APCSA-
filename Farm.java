import java.util.ArrayList;
import java.io .*;
import java.util.Scanner;
public class Farm {
    public ArrayList<String> names = new ArrayList<String>();
    public void generator(String type, int count){
        if(type.equals("pig")){

        }else if(type.equals("cow")){

        }else if(type.equals("chicken")){
            
        }
        try{

        }
        
    }
    private void ReadFile(){
            try{
                File myObj = new File("names.txt");
                Scanner reader = new Scanner(myObj);
                while(reader.hasNextLine()){
                    names.add(reader.nextLine());
                }
                reader.close();
            }catch (FileNotFoundException fnf){
                fnf.printStackTrace();
            }
        }
}
