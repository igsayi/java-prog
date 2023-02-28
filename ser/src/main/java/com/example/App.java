package com.example;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Emp e = new Emp();
        e.name = "Reyan Abi";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.number = 101;

        ObjectMapper Obj = new ObjectMapper();

        try {

            // Getting organisation object as a json string
            String jsonStr = Obj.writeValueAsString(e);

            // Displaying JSON String on console
            System.out.println("Emp Object converted to JSON as \n" + jsonStr);

            Emp e1 = Obj.readValue(jsonStr, Emp.class);
            System.out.println("JSON converted to Emp Object as \n" + e1.getName());
        }

        catch (IOException ex) {

            ex.printStackTrace();
        }
    }
}
