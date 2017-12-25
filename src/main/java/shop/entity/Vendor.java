package shop.entity;

import javax.persistence.*;

/**
 * Created by tenni_000 on 24.12.2017.
 */
@Entity
@Table(name = "vendor", schema = "public", catalog = "Shop")
public class Vendor {
    private int idV;
    private String loginV;
    private String fioV;
    private String phoneV;

    @Id
    @Column(name = "id_v", nullable = false)
    public int getIdV() {
        return idV;
    }

    public void setIdV(int idV) {
        this.idV = idV;
    }

  
    @Column(name = "login_v", nullable = true, length = -1)
    public String getLoginV() {
        return loginV;
    }

    public void setLoginV(String loginV) {
        this.loginV = loginV;
    }

  
    @Column(name = "fio_v", nullable = true, length = -1)
    public String getFioV() {
        return fioV;
    }

    public void setFioV(String fioV) {
        this.fioV = fioV;
    }

  
    @Column(name = "phone_v", nullable = true, length = -1)
    public String getPhoneV() {
        return phoneV;
    }

    public void setPhoneV(String phoneV) {
        this.phoneV = phoneV;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vendor that = (Vendor) o;

        if (idV != that.idV) return false;
        if (loginV != null ? !loginV.equals(that.loginV) : that.loginV != null) return false;
        if (fioV != null ? !fioV.equals(that.fioV) : that.fioV != null) return false;
        if (phoneV != null ? !phoneV.equals(that.phoneV) : that.phoneV != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idV;
        result = 31 * result + (loginV != null ? loginV.hashCode() : 0);
        result = 31 * result + (fioV != null ? fioV.hashCode() : 0);
        result = 31 * result + (phoneV != null ? phoneV.hashCode() : 0);
        return result;
    }
}
