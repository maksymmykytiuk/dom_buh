package entity;

import javax.persistence.*;

/**
 * Created by maksy on 25-May-16.
 */
@Entity
@Table(name = "account", schema = "dom_buh", catalog = "")
public class AccountEntity {
    private int idAccount;
    private int idType;
    private int idOwner;
    private String name;
    private int idCurrency;
    private Double amount;
    private byte creditLoan;
    private Integer idCredit;

    @Id
    @Column(name = "id_account", nullable = false)
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Basic
    @Column(name = "id_type", nullable = false)
    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    @Basic
    @Column(name = "id_owner", nullable = false)
    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
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
    @Column(name = "id_currency", nullable = false)
    public int getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(int idCurrency) {
        this.idCurrency = idCurrency;
    }

    @Basic
    @Column(name = "amount", nullable = true, precision = 2)
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "Credit / loan", nullable = false)
    public byte getCreditLoan() {
        return creditLoan;
    }

    public void setCreditLoan(byte creditLoan) {
        this.creditLoan = creditLoan;
    }

    @Basic
    @Column(name = "id_credit", nullable = true)
    public Integer getIdCredit() {
        return idCredit;
    }

    public void setIdCredit(Integer idCredit) {
        this.idCredit = idCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountEntity that = (AccountEntity) o;

        if (idAccount != that.idAccount) return false;
        if (idType != that.idType) return false;
        if (idOwner != that.idOwner) return false;
        if (idCurrency != that.idCurrency) return false;
        if (creditLoan != that.creditLoan) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (idCredit != null ? !idCredit.equals(that.idCredit) : that.idCredit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAccount;
        result = 31 * result + idType;
        result = 31 * result + idOwner;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + idCurrency;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (int) creditLoan;
        result = 31 * result + (idCredit != null ? idCredit.hashCode() : 0);
        return result;
    }
}
