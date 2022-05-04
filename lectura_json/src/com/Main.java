package com;

import org.json.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.*;

public class Main {

    public static void main() {

        // Object ob = new JSONParser().parse(new FileReader("JSONFile.json"));
        JSONArray pets = new JSONArray();
        pets.put("cat");
        pets.put("dog");
        System.out.println(pets.toString());

    }

}
