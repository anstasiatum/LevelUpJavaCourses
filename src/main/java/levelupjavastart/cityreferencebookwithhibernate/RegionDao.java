package levelupjavastart.cityreferencebookwithhibernate;

import levelupjavastart.cityreferencebookwithhibernate.model.Region;

import java.util.Optional;

public interface RegionDao {
    void save(Region region);

    Optional<Region> findById(Integer id);
}
