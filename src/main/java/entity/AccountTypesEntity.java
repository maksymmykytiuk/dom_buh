package entity;

import javax.persistence.*;

/**
 * Created by maksy on 25-May-16.
 */
@Entity
@Table(name = "account_types", schema = "dom_buh", catalog = "")
public class AccountTypesEntity {
    private int idTypes;
    private String typeName;

    @Id
    @Column(name = "id_types", nullable = false)
    public int getIdTypes() {
        return idTypes;
    }

    public void setIdTypes(int idTypes) {
        this.idTypes = idTypes;
    }

    @Basic
    @Column(name = "type_name", nullable = false, length = 45)
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountTypesEntity that = (AccountTypesEntity) o;

        if (idTypes != that.idTypes) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTypes;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        return result;
    }
}
