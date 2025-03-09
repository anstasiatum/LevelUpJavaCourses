package levelupjavastart.cityreferencebookwithhibernate.impl;

import levelupjavastart.cityreferencebookwithhibernate.HibernateHelper;
import levelupjavastart.cityreferencebookwithhibernate.RegionDao;
import levelupjavastart.cityreferencebookwithhibernate.model.Region;

import java.util.Optional;

public class RegionJpaDaoImpl implements RegionDao {
    @Override
    public void save(Region region) {
        HibernateHelper.runInTransaction(entityManager -> {
            if (region.getId() == null) {
                Region mergedRegion = entityManager.merge(region);
                System.out.println(mergedRegion.getId());
            } else {
                entityManager.persist(region);
            }
        });
    }

    @Override
    public Optional<Region> findById(Integer id) {
        return HibernateHelper.runInTransaction(entityManager -> {
            return Optional.ofNullable(entityManager.find(Region.class, id));
        });
    }
}
