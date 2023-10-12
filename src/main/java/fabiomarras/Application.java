package fabiomarras;

import com.github.javafaker.Faker;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Faker faker = new Faker(Locale.ITALY);
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.dragonBall().character());
        System.out.println(faker.book().title() );
        System.out.println(faker.beer().hop());

    }
}
