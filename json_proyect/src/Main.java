
import org.json.*;

public class Main {

    public static void main(String[] args) {

        JSONArray pets = new JSONArray();
        pets.put("cat");
        pets.put("dog");

        System.out.println(pets.toString());

        JSONObject person = new JSONObject();
        person.put("name", "John Brown");
        person.put("age", 35);
        person.put("pets", pets);
        System.out.println(person.toString());
        System.out.println(person.getString("name"));
        System.out.println(person.getJSONArray("pets").getString(0));

    }

}
