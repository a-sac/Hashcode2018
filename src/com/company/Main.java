package com.company;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("e_high_bonus.in");
        BufferedReader input = new BufferedReader(new FileReader(file));
        String line;
        while ((line = input.readLine()) != null){
            String split[]= line.split(" ");
            Arrays.stream(split).forEach(System.out::println);
            System.out.println("\n");
        }
    }
}
