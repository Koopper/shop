package shop.entity;

import javax.persistence.*;

@Entity
@Table(name = "discount", schema = "public", catalog = "Shop")
public class Discount {
    private int idDis;
    private String nameDis;
    private Integer sum;

    private Product product;

    private Buyer buyer;

    @Id
    @Column(name = "id_dis", nullable = false)
    public int getIdDis() {
        return idDis;
    }

    public void setIdDis(int idDis) {
        this.idDis = idDis;
    }

  
    @Column(name = "name_dis", nullable = true, length = -1)
    public String getNameDis() {
        return nameDis;
    }

    public void setNameDis(String nameDis) {
        this.nameDis = nameDis;
    }

    @ManyToOne
    @JoinColumn(name = "idBuyer")
    public Buyer getBuyer() {return buyer;}
    public void setBuyer(Buyer buyer) {this.buyer = buyer;}

    @ManyToOne
    @JoinColumn(name = "idProduct")
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

  
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
