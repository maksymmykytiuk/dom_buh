package entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by maksy on 25-May-16.
 */
@Entity
@Table(name = "currency", schema = "dom_buh", catalog = "")
public class CurrencyEntity {
    private int idCurrency;
    private String shortName;
    private String name;
    private Double rate;
    private Serializable data;

    @Id
    @Column(name = "id_currency", nullable = false)
    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
    }

    @Basic
    @Column(name = "short_name", nullable = true, length = 10)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "rate", nullable = true, precision = 2)
    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "data", nullable = false)
    public Serializable getData() {
        return data;
    }

    public void setData(Serializable data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CurrencyEntity that = (CurrencyEntity) o;

        if (idCurrency != that.idCurrency) return false;
        if (shortName != null ? !shortName.equals(that.shortName) : that.shortName != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCurrency;
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}
