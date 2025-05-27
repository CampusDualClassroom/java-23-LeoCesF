package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    static Person p = new Person("John", "Smith");
    static Person t = new Teacher("María", "Montessori", "Educación");
    static Person pO = new PoliceOfficer("Jake", "Peralta", "B-99");
    static Person d = new Doctor("Gregory", "House", "Nefrología e infectología");
    static Person pO2 = new PoliceOfficer("Charles", "Boyle", "B-99");

    public static Map<String, Person> createHashMap() {
        Map<String, Person> mapaPersonas = new HashMap<>();
        mapaPersonas.put("person", p);
        mapaPersonas.put("teacher", t);
        mapaPersonas.put("police", pO);
        mapaPersonas.put("doctor", d);

        return mapaPersonas;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> item : map.entrySet()) {
            System.out.println(item.getKey());
            item.getValue().getDetails();
        }
    }

    public static void main(String[] args) {
        Map<String, Person> newMap = createHashMap();
        Person p2 = addMapValue(newMap, "police", pO2);
        printMapValues(newMap);
    }
}
