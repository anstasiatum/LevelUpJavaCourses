package levelupjavastart.cityreferencebookwithhibernate;

import levelupjavastart.cityreferencebookwithhibernate.impl.CityJpaDaoImpl;
import levelupjavastart.cityreferencebookwithhibernate.impl.RegionJpaDaoImpl;
import levelupjavastart.cityreferencebookwithhibernate.model.City;
import levelupjavastart.cityreferencebookwithhibernate.model.Region;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CityReferenceBook {
    final static CityDao cityJpaDao = new CityJpaDaoImpl();
    final static RegionDao regionJpaDao = new RegionJpaDaoImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = false;

        do {
            System.out.println("""
                    1 - Register a city;
                    2 - Find a city by its ID;
                    3 - Find a city name by the city ID;
                    4 - Find all cities;
                    5 - Delete a city by its ID;
                    6 - Register a region;
                    """);
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    registerCity();
                    break;
                case 2:
                    findCityById();
                    break;
                case 3:
                    findCityNameById();
                    break;
                case 4:
                    findAllCities();
                    break;
                case 5:
                    deleteCityById();
                    break;
                case 6:
                    registerRegion();
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
            System.out.println("Do you want to continue? true/false");
            try {
                isContinuing = scanner.nextBoolean();
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input");
            }
        }
        while (isContinuing);
    }

    public static void registerCity() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the city code: ");
        String cityCode = scanner.nextLine();

        System.out.println("Enter the Russian city name: ");
        String russianCityName = scanner.nextLine();

        System.out.println("Enter the English city name: ");
        String englishCityName = scanner.nextLine();

        System.out.println("Enter the population: ");
        Integer cityPopulation = scanner.nextInt();

        System.out.println("Enter the region ID: ");
        Integer regionId = scanner.nextInt();

        Region cityRegion = findRegionById(regionId);

        City city = new City(null, cityCode, russianCityName, englishCityName, cityPopulation, cityRegion);
        cityJpaDao.save(city);
    }

    public static void findCityById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the city ID: ");
        int cityId = scanner.nextInt();
        System.out.println(cityJpaDao.findById(cityId));
    }

    public static void findCityNameById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the city ID: ");
        int cityId = scanner.nextInt();
        String errorMessage = "The city is not found";
        City city = cityJpaDao.findById(cityId).orElseThrow(() -> new IllegalArgumentException(errorMessage));
        System.out.println(city.getRussianName() + "; " + city.getEnglishName());
    }

    public static void findAllCities() {
        System.out.println(cityJpaDao.findAll());
    }

    public static void deleteCityById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the city ID: ");
        int cityId = scanner.nextInt();

        cityJpaDao.deleteById(cityId);
        System.out.println(cityJpaDao.findAll());
    }

    public static void registerRegion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the region name: ");
        String regionName = scanner.nextLine();

        Region region = new Region(null, regionName);
        regionJpaDao.save(region);
    }

    public static Region findRegionById(Integer regionId) {
        return regionJpaDao.findById(regionId).orElseThrow(() -> new IllegalArgumentException("Wrong region ID"));
    }
}
