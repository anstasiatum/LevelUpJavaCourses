package levelupjavastart.cityreferencebookwithhibernate;

import levelupjavastart.cityreferencebookwithhibernate.model.City;

import java.util.List;
import java.util.Optional;

public interface CityDao {

    void save(City city);

    List<City> findAll();

    Optional<City> findById(Integer id);

    void deleteById(Integer id);
}