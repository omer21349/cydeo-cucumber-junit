package com.cydeo.step_definitions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class practice2 {

    public static void main(String[] args) throws IOException {
//        FileReader fr=new FileReader("src/test/java/com/cydeo/step_definitions/FilePractice.txt");
//        BufferedReader br=new BufferedReader(fr);
        Scanner sc=new Scanner(new FileReader("src/test/java/com/cydeo/step_definitions/FilePractice.txt"));
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }

    }
}
