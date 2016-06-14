package entity;

import javax.persistence.*;

/**
 * Created by maksy on 25-May-16.
 */
@Entity
@Table(name = "category_consumption", schema = "dom_buh", catalog = "")
public class CategoryConsumptionEntity {
    private int idCategoryConsumption;
    private String name;

    @Id
    @Column(name = "id_category_consumption", nullable = false)
    public int getIdCategoryConsumption() {
        return idCategoryConsumption;
    }

    public void setIdCategoryConsumption(int idCategoryConsumption) {
        this.idCategoryConsumption = idCategoryConsumption;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryConsumptionEntity that = (CategoryConsumptionEntity) o;

        if (idCategoryConsumption != that.idCategoryConsumption) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCategoryConsumption;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
