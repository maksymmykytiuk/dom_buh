package entity;

import javax.persistence.*;

/**
 * Created by maksy on 25-May-16.
 */
@Entity
@Table(name = "category_earnings", schema = "dom_buh", catalog = "")
public class CategoryEarningsEntity {
    private int idCategoryEarnings;
    private String name;

    @Id
    @Column(name = "id_category_earnings", nullable = false)
    public int getIdCategoryEarnings() {
        return idCategoryEarnings;
    }

    public void setIdCategoryEarnings(int idCategoryEarnings) {
        this.idCategoryEarnings = idCategoryEarnings;
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

        CategoryEarningsEntity that = (CategoryEarningsEntity) o;

        if (idCategoryEarnings != that.idCategoryEarnings) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCategoryEarnings;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
