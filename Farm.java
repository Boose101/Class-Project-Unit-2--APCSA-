package ProjectU2;
import java.util.ArrayList;
public class Farm {
    public ArrayList<String> names = new ArrayList<String>();
    public void generator(){
        
        private static void ReadFile() {
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
}
