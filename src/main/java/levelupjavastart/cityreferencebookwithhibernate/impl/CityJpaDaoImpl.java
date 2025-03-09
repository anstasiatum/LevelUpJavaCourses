package levelupjavastart.cityreferencebookwithhibernate.impl;

import levelupjavastart.cityreferencebookwithhibernate.CityDao;
import levelupjavastart.cityreferencebookwithhibernate.HibernateHelper;
import levelupjavastart.cityreferencebookwithhibernate.model.City;

import java.util.List;
import java.util.Optional;

public class CityJpaDaoImpl implements CityDao {

    @Override
    public void save(City city) {
        HibernateHelper.runInTransaction(entityManager -> {
            if (city.getId() == null) {
                City mergedCity = entityManager.merge(city);
                System.out.println(mergedCity.getId());
            } else {
                entityManager.persist(city);
            }
        });
    }

    @Override
    public List<City> findAll() {
        return HibernateHelper.runInTransaction(entityManager -> {
            return entityManager.createQuery("select city from City city").getResultList();
        });
    }

    @Override
    public Optional<City> findById(Integer id) {
        return HibernateHelper.runInTransaction(entityManager -> {
            return Optional.ofNullable(entityManager.find(City.class, id));
        });
    }


    @Override
    public void deleteById(Integer id) {
        HibernateHelper.runInTransaction(session -> {
            session.createNativeQuery("delete from cities where id = :id")
                    .setParameter("id", id)
                    .executeUpdate();
        });
    }
}
