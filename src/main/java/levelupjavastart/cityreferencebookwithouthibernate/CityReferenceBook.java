package levelupjavastart.cityreferencebookwithouthibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CityReferenceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = false;

        do {
            cityRegister();
            System.out.println("Do you want to continue? true/false");
            try {
                isContinuing = scanner.nextBoolean();
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input");
            }
        } while (isContinuing);
    }

    public static void cityRegister() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the city code: ");
        String cityCode = scanner.nextLine();

        System.out.println("Enter the Russian city name: ");
        String russianCityName = scanner.nextLine();

        System.out.println("Enter the English city name: ");
        String englishCityName = scanner.nextLine();

        System.out.println("Enter the population: ");
        Integer cityPopulation = scanner.nextInt();
        try (Connection con = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/levelup", "root", "root");
             PreparedStatement stmt = con.prepareStatement("""
                     INSERT into cities (city_code, rus_name, eng_name, population) VALUES (?, ?, ?, ?);
                     """)) {
            stmt.setString(1, cityCode);
            stmt.setString(2, russianCityName);
            stmt.setString(3, englishCityName);
            stmt.setInt(4, cityPopulation);
            if (stmt.executeUpdate() == 1) {
                System.out.printf("INFO: City %s was successfully saved \n", cityCode);
            } else {
                System.out.printf("ERROR: City %s was not saved \n", cityCode);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
