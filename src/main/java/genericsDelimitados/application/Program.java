package genericsDelimitados.application;

import genericsDelimitados.entities.Product;
import genericsDelimitados.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\jessi\\Documents\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] nameAndPrice = line.split(",");
                list.add(new Product(nameAndPrice [0], Double.parseDouble(nameAndPrice[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive ");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());;
        }
    }
}
