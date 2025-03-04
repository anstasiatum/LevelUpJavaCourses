package levelupjavastart.cityreferencebookwithhibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "regions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regions_seq_gen")
    @SequenceGenerator(name = "regions_seq_gen", sequenceName = "regions_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "region_name")
    private String regionName;
}