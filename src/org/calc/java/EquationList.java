package org.calc.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquationList {

    public static double LoadMFD(char type) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        switch (type){
            case '0' ->  {  // Calculate the flux
                System.out.print("Input I : ");
                double I = Float.parseFloat(reader.readLine());
                System.out.print("Input r : ");
                double r = Float.parseFloat(reader.readLine());
                return (Constants.pico0 / (2 * Constants.pi)) * (I/r);
            }
            case '1' -> {   // Calculate the distance
                System.out.print("Input I : ");
                double I = Float.parseFloat(reader.readLine());
                System.out.print("Input B : ");
                double B = Float.parseFloat(reader.readLine());
                return (Constants.pico0 / (2 * Constants.pi)) * (I/B);
            }
            case '2' -> {   // Calculate the current
                System.out.print("NOTE: This equation does not currently work and will give an incorrect answer\nInput r : ");
                double r = Float.parseFloat(reader.readLine());
                System.out.print("Input B : ");
                double B = Float.parseFloat(reader.readLine());
                return (Constants.pico0 / (2 * Constants.pi)) * (r/B);
            }
        }
        return 0;
    }
}
