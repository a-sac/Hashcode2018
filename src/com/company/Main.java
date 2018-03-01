package com.company;

import java.awt.*;
import java.io.*;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("a_example.in");
        BufferedReader input = new BufferedReader(new FileReader(file));
        String line;
        Mapa map;
        int id = 0;
        int numeros[];
        line = input.readLine();
        numeros = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
        map = new Mapa(numeros[0],numeros[1],numeros[2],numeros[3],numeros[4],numeros[5]);

        for(int i=0; i< map.vehicles; i++){
            map.addTaxi(new Vehicle());
        }
        System.out.println("\n");
        while ((line = input.readLine()) != null){
            numeros = Arrays.asList(line.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            Point p1 = new Point(numeros[0],numeros[1]);
            Point p2 = new Point(numeros[2],numeros[3]);
            Trip trip = new Trip(p1,p2,numeros[4],numeros[5],id++);
            map.addViagem(p1,trip);
            id++;
        }
    }
}
