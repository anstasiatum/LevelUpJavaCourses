package levelupjavastart.cityreferencebookwithhibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cities")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cities_seq_gen")
    @SequenceGenerator(name = "cities_seq_gen", sequenceName = "cities_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "city_code")
    private String cityCode;

    @Column(name = "rus_name")
    private String russianName;

    @Column(name = "eng_name")
    private String englishName;

    @Column(name = "population")
    private Integer population;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}
