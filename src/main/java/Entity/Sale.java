package Entity;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "sale", schema = "public", catalog = "Shop")
public class Sale {
    private int idS;
    private Integer numberS;
    private Integer sum;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "id_v")
    private Vendor vendor;

    @ManyToOne
    @JoinColumn(name = "id_b")
    private Buyer buyer;

    @ManyToOne
    @JoinColumn(name = "id_pr")
    private Product product;

    @Id
    @Column(name = "id_s", nullable = false)
    public int getIdS() {
        return idS;
    }

    public void setIdS(int idS) {
        this.idS = idS;
    }

    @Basic
    @Column(name = "number_s", nullable = true)
    public Integer getNumberS() {
        return numberS;
    }

    public void setNumberS(Integer numberS) {
        this.numberS = numberS;
    }

    @Basic
    @Column(name = "sum", nullable = true, precision = 0)
    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }


    @Basic
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Vendor getVendor() {
        return vendor;
    }
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Buyer getBuyer() {return buyer;}
    public void getBuyer(Buyer buyer) {this.buyer = buyer;}

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sale that = (Sale) o;

        if (idS != that.idS) return false;
        if (numberS != null ? !numberS.equals(that.numberS) : that.numberS != null) return false;
        if (sum != null ? !sum.equals(that.sum) : that.sum != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idS;
        result = 31 * result + (numberS != null ? numberS.hashCode() : 0);
        result = 31 * result + (sum != null ? sum.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
