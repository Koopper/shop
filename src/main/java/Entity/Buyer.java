package Entity;

import javax.persistence.*;

@Entity
@Table(name = "buyer", schema = "public", catalog = "Shop")
public class Buyer {
    private int idB;
    private String loginB;
    private String fioB;
    private String emailB;
    private String phoneB;

    @Id
    @Column(name = "id_b", nullable = false)
    public Integer getIdB() {
        return idB;
    }

    public void setIdB(int idB) {
        this.idB = idB;
    }

    @Basic
    @Column(name = "login_b", nullable = true, length = -1)
    public String getLoginB() {
        return loginB;
    }

    public void setLoginB(String loginB) {
        this.loginB = loginB;
    }


    @Basic
    @Column(name = "fio_b", nullable = true, length = -1)
    public String getFioB() {
        return fioB;
    }

    public void setFioB(String fioB) {
        this.fioB = fioB;
    }

    @Basic
    @Column(name = "email_b", nullable = true, length = -1)
    public String getEmailB() {
        return emailB;
    }

    public void setEmailB(String emailB) {
        this.emailB = emailB;
    }

    @Basic
    @Column(name = "phone_b", nullable = true, length = -1)
    public String getPhoneB() {
        return phoneB;
    }

    public void setPhoneB(String phoneB) {
        this.phoneB = phoneB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Buyer that = (Buyer) o;

        if (idB != that.idB) return false;
        if (loginB != null ? !loginB.equals(that.loginB) : that.loginB != null) return false;
        if (fioB != null ? !fioB.equals(that.fioB) : that.fioB != null) return false;
        if (emailB != null ? !emailB.equals(that.emailB) : that.emailB != null) return false;
        if (phoneB != null ? !phoneB.equals(that.phoneB) : that.phoneB != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idB;
        result = 31 * result + (loginB != null ? loginB.hashCode() : 0);
        result = 31 * result + (fioB != null ? fioB.hashCode() : 0);
        result = 31 * result + (emailB != null ? emailB.hashCode() : 0);
        result = 31 * result + (phoneB != null ? phoneB.hashCode() : 0);
        return result;
    }
}
