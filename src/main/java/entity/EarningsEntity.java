package entity;

import javax.persistence.*;

/**
 * Created by maksy on 25-May-16.
 */
@Entity
@Table(name = "earnings", schema = "dom_buh", catalog = "")
public class EarningsEntity {
    private int idEarnings;
    private int idUser;
    private Double value;
    private int idCategoryEarnings;
    private int idSubCategoryEarnings;
    private int idUnitsOfMeasurement;
    private String memo;
    private int idAccount;

    @Id
    @Column(name = "id_earnings", nullable = false)
    public int getIdEarnings() {
        return idEarnings;
    }

    public void setIdEarnings(int idEarnings) {
        this.idEarnings = idEarnings;
    }

    @Basic
    @Column(name = "id_user", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "value", nullable = true, precision = 2)
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Basic
    @Column(name = "id_category_earnings", nullable = false)
    public int getIdCategoryEarnings() {
        return idCategoryEarnings;
    }

    public void setIdCategoryEarnings(int idCategoryEarnings) {
        this.idCategoryEarnings = idCategoryEarnings;
    }

    @Basic
    @Column(name = "id_sub_category_earnings", nullable = false)
    public int getIdSubCategoryEarnings() {
        return idSubCategoryEarnings;
    }

    public void setIdSubCategoryEarnings(int idSubCategoryEarnings) {
        this.idSubCategoryEarnings = idSubCategoryEarnings;
    }

    @Basic
    @Column(name = "id_units_of_measurement", nullable = false)
    public int getIdUnitsOfMeasurement() {
        return idUnitsOfMeasurement;
    }

    public void setIdUnitsOfMeasurement(int idUnitsOfMeasurement) {
        this.idUnitsOfMeasurement = idUnitsOfMeasurement;
    }

    @Basic
    @Column(name = "memo", nullable = true, length = 1000)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "id_account", nullable = false)
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EarningsEntity that = (EarningsEntity) o;

        if (idEarnings != that.idEarnings) return false;
        if (idUser != that.idUser) return false;
        if (idCategoryEarnings != that.idCategoryEarnings) return false;
        if (idSubCategoryEarnings != that.idSubCategoryEarnings) return false;
        if (idUnitsOfMeasurement != that.idUnitsOfMeasurement) return false;
        if (idAccount != that.idAccount) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEarnings;
        result = 31 * result + idUser;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + idCategoryEarnings;
        result = 31 * result + idSubCategoryEarnings;
        result = 31 * result + idUnitsOfMeasurement;
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + idAccount;
        return result;
    }
}
