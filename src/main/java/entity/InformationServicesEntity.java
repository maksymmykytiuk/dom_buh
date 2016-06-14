package entity;

import javax.persistence.*;

/**
 * Created by maksy on 25-May-16.
 */
@Entity
@Table(name = "information_services", schema = "dom_buh", catalog = "")
public class InformationServicesEntity {
    private int idInformationServices;
    private int idServices;
    private String url;
    private String name;

    @Id
    @Column(name = "id_information_services", nullable = false)
    public int getIdInformationServices() {
        return idInformationServices;
    }

    public void setIdInformationServices(int idInformationServices) {
        this.idInformationServices = idInformationServices;
    }

    @Basic
    @Column(name = "id_services", nullable = false)
    public int getIdServices() {
        return idServices;
    }

    public void setIdServices(int idServices) {
        this.idServices = idServices;
    }

    @Basic
    @Column(name = "url", nullable = false, length = 200)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
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

        InformationServicesEntity that = (InformationServicesEntity) o;

        if (idInformationServices != that.idInformationServices) return false;
        if (idServices != that.idServices) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idInformationServices;
        result = 31 * result + idServices;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
