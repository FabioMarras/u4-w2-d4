package fabiomarras;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Product Shampo = new Product(1L, "shampo1", "shampo", 120.5);
        Product toy1 = Product.toy1;
        Product Libro1 = Product.Libro;
        Product Libro2 = Product.Libro2;
        Product Libro3 = Product.Libro3;
        Product forBoys = Product.forBoys;
        Product forBoys1 = Product.forBoys1;

        List<Product> prodotti = new ArrayList<>(List.of(Shampo, toy1, Libro1, Libro2, Libro3, forBoys, forBoys1));

        List<Product> ordine1 = new ArrayList<>();
        ordine1.add(Shampo);
        ordine1.add(toy1);

        List<Product> ordine2 = new ArrayList<>();
        ordine2.add(Shampo);

        List<Product> ordine3 = new ArrayList<>();
        ordine3.add(Shampo);
        ordine3.add(toy1);
        ordine3.add(toy1);

        List<List<Product>> ordiniTotali = new ArrayList<>();
        ordiniTotali.add(ordine1);
        ordiniTotali.add(ordine2);
        ordiniTotali.add(ordine3);

        Customer Fabio = new Customer(10L, "Fabio", 1);
        Customer Andrea = new Customer(11L, "Andrea", 2);
        Customer Giuseppe = new Customer(12L, "Giuseppe", 2);

        Order primo = new Order(99L, "pending", LocalDate.of(2023, 10, 11), LocalDate.of(2023, 10, 20), ordine1, Fabio);
        //System.out.println(primo);
        //System.out.println(prodotti);
        Order secondo = new Order(101L, "pending", LocalDate.of(2021, 1, 1), LocalDate.of(2023, 10, 20), ordine1, Andrea);
        Order terzo = new Order(102L, "pending", LocalDate.of(2021, 3, 11), LocalDate.of(2021, 3, 20), ordine1, Giuseppe);

        System.out.println("******* ESERCIZIO 2 *******");
        //dato un ordine calcola il totale del costo
        /*double importoTotale = primo.products.stream().mapToDouble(Product::getPrice).sum();
        System.out.println("l'importo dell'ordine1: " + importoTotale);*/

        System.out.println("******* ESERCIZIO 3 *******");
        //ordina i prodotti per prezzo
        /*List<Product> prodottiPerPrezzo = prodotti.stream().sorted(Comparator.comparing(Product::getPrice)).toList();
        prodottiPerPrezzo.forEach(System.out::println);*/

        System.out.println("******* ESERCIZIO 4 *******");
        //calcola la media degli importi degli ordini
        /*double media = ordine1.stream().mapToDouble(Product::getPrice).average().orElse(0.0);
        System.out.println("La media dell'ordine1: " + +media);*/

        System.out.println("******* ESERCIZIO 5 *******");
        //raggruppa i prodotti per categoria e calcola la somma per ogni categoria
       /* Map<String, List<Product>> productsCategory = prodotti.stream().collect(Collectors.groupingBy(Product::getCategory));
        productsCategory.forEach((categoria, prodottiInsieme) -> {
            //System.out.println("Categoria: " + categoria );
            double totale = prodottiInsieme.stream().mapToDouble(Product::getPrice).sum();
            //prodottiInsieme.forEach(System.out::println);
            System.out.println("importo totale della categoria: " + categoria + " " + totale);
        });*/

        System.out.println("******* ESERCIZIO 6 *******");
        //salva su un file la lista dei prodotti
        /*File file = new File("src/output.txt");

        try {
            StringBuilder ListStringProduct = new StringBuilder();
            for (Product product : prodotti) {
                String listProduct = product.getName() + "@" + product.getCategory() + "@";
                ListStringProduct.append(listProduct).append(System.lineSeparator());
            }

            FileUtils.writeStringToFile(file, ListStringProduct + System.lineSeparator(), StandardCharsets.UTF_8);

            String cont = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            System.out.println("prodotti: " + cont);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }*/

        System.out.println("******* ESERCIZIO 7 *******");
        /*List<String> listone = new ArrayList<>();
        try {
            String reading = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            listone.add(reading);
            System.out.println(listone);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}