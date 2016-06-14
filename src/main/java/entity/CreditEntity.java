package entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by maksy on 25-May-16.
 */
@Entity
@Table(name = "credit", schema = "dom_buh", catalog = "")
public class CreditEntity {
    private int idCredit;
    private int idAccount;
    private double amount;
    private int term;
    private double percent;
    private Date date;
    private String name;
    private Double debt;
    private byte extinguished;

    @Id
    @Column(name = "id_credit", nullable = false)
    public int getIdCredit() {
        return idCredit;
    }

    public void setIdCredit(int idCredit) {
        this.idCredit = idCredit;
    }

    @Basic
    @Column(name = "id_account", nullable = false)
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Basic
    @Column(name = "amount", nullable = false, precision = 2)
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "term", nullable = false)
    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    @Basic
    @Column(name = "percent", nullable = false, precision = 3)
    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "debt", nullable = true, precision = 2)
    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }

    @Basic
    @Column(name = "extinguished", nullable = false)
    public byte getExtinguished() {
        return extinguished;
    }

    public void setExtinguished(byte extinguished) {
        this.extinguished = extinguished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditEntity that = (CreditEntity) o;

        if (idCredit != that.idCredit) return false;
        if (idAccount != that.idAccount) return false;
        if (Double.compare(that.amount, amount) != 0) return false;
        if (term != that.term) return false;
        if (Double.compare(that.percent, percent) != 0) return false;
        if (extinguished != that.extinguished) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (debt != null ? !debt.equals(that.debt) : that.debt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idCredit;
        result = 31 * result + idAccount;
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + term;
        temp = Double.doubleToLongBits(percent);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (debt != null ? debt.hashCode() : 0);
        result = 31 * result + (int) extinguished;
        return result;
    }
}
