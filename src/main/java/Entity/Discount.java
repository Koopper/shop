package Entity;

import javax.persistence.*;

/**
 * Created by tenni_000 on 24.12.2017.
 */
@Entity
@Table(name = "discount", schema = "public", catalog = "Shop")
public class Discount {
    private int idDis;
    private String nameDis;
    private Integer sum;

    @ManyToOne
    @JoinColumn(name = "id_pr")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id_b")
    private Buyer buyer;

    @Id
    @Column(name = "id_dis", nullable = false)
    public int getIdDis() {
        return idDis;
    }

    public void setIdDis(int idDis) {
        this.idDis = idDis;
    }

    @Basic
    @Column(name = "name_dis", nullable = true, length = -1)
    public String getNameDis() {
        return nameDis;
    }

    public void setNameDis(String nameDis) {
        this.nameDis = nameDis;
    }

    public Buyer getBuyer() {return buyer;}
    public void getBuyer(Buyer buyer) {this.buyer = buyer;}

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    @Basic
    @Column(name = "sum", nullable = true, precision = 0)
    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Discount that = (Discount) o;

        if (idDis != that.idDis) return false;
        if (nameDis != null ? !nameDis.equals(that.nameDis) : that.nameDis != null) return false;
        if (sum != null ? !sum.equals(that.sum) : that.sum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDis;
        result = 31 * result + (nameDis != null ? nameDis.hashCode() : 0);
        result = 31 * result + (sum != null ? sum.hashCode() : 0);
        return result;
    }
}
