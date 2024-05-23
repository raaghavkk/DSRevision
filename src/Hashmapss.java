import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Hashmapss {

    public static void main(String[] args) {

        // Create a HashMap dictionary
        HashMap<String, List<String>> countries = new HashMap<String, List<String>>();

        // create lists of countries
        List<String> G = new ArrayList<String>(){
            {
                add("Ghana");
                add("Greenland");
                add("Greece");
            }
        };

        List<String> I = new ArrayList<String>(){
            {
                add("Iceland");
                add("India");
                add("Indonesia");
                add("Iran");
                add("Iraq");
                add("Ireland");
        }

    };

            List<String> U = new ArrayList<String>(){
                {
                    add("Uganda");
                    add("Ukraine");
                    add("United Arab Emirates");
                    add("United Kingdom");
                    add("United States");
                    add("Uruguay");
                    add("Uzbekistan");
                }
            };

            // initialise hashmap
            countries.put("G", G);
            countries.put("I", I);
            countries.put("U", U);

            // get list of countries starting with I
            List<String> result = countries.get("I");
            for(String country : result){
                System.out.println(country);
            }

            //remove key/value
            countries.remove("I");
            System.out.println();

            //try to get I
            System.out.println("Try to get value after deleting");
            System.out.println(countries.get("I"));
        }


}
