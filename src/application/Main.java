package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
    
        String line = null;
        Scanner sc = new Scanner(new File("employee.txt"));
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            System.out.println(line);
            // String nomeProduto = line.split(",")[0];
            // Double precoProduto = Double.valueOf(line.split(",")[1]).doubleValue();

            
            
        }
    }
}
