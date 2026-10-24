package com.example;

public class Main {
    public static void main(String[] args) {
        
        RelojDeportivo miReloj = new RelojDeportivo(
        "Rolex", 
        "Forerunner", 
        110, 
        450.5, 
        true, 
        'M', 
        8500, 
        85.0, 
        "Atletismo", 
        true);

        System.out.println(miReloj.toString());
    }
}


