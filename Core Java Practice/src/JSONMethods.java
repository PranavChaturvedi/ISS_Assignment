import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONMethods {
    public static void main(String[] args) throws IOException {
        JSONParser parser = new JSONParser();
        String jsonURL = "C:\\Users\\Pranav\\IdeaProjects\\ISS_Assignment_Java\\src\\emp.json";
        try{
            FileReader jsonFile = new FileReader(jsonURL);

            //get the json object
            JSONObject jsonObject = (JSONObject) (parser.parse(jsonFile));

            String firstName = jsonObject.get("firstName").toString();
            String secondName = jsonObject.get("lastName").toString();
            System.out.println("First Name : " + firstName);
            System.out.println("Last Name : " + secondName);

            //since multiple addresses are present, JSONArray is used

            JSONArray addressArray = (JSONArray) jsonObject.get("address");
            for(int i=0;i<addressArray.size();i++){
               JSONObject curObj = (JSONObject) addressArray.get(i);
               System.out.print("Street : " + curObj.get("street"));
               System.out.print(" City : " + curObj.get("city"));
               System.out.println(" State : " + curObj.get("state"));
            }

        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        } catch(ParseException | IOException e){
            e.printStackTrace();
        }
        catch(NullPointerException e){
            System.out.println("Key not found");
        }

        //Writing a json File


    }
}
