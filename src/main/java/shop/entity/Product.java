package shop.entity;

import javax.persistence.*;

/**
 * Created by tenni_000 on 24.12.2017.
 */
@Entity
@Table(name = "products", schema = "public", catalog = "Shop")
public class Product {
    private int idPr;
    private String namePr;
    private String descPr;
    private Integer price;
    private Integer stock;


    @Id
    @Column(name = "id_pr", nullable = false)
    public int getIdPr() {
        return idPr;
    }

    public void setIdPr(int idPr) {
        this.idPr = idPr;
    }

    @Basic
    @Column(name = "name_pr", nullable = true, length = -1)
    public String getNamePr() {
        return namePr;
    }

    public void setNamePr(String namePr) {
        this.namePr = namePr;
    }

    @Basic
    @Column(name = "desc_pr", nullable = true, length = -1)
    public String getDescPr() {
        return descPr;
    }

    public void setDescPr(String descPr) {
        this.descPr = descPr;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 0)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "stock", nullable = true)
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product that = (Product) o;

        if (idPr != that.idPr) return false;
        if (namePr != null ? !namePr.equals(that.namePr) : that.namePr != null) return false;
        if (descPr != null ? !descPr.equals(that.descPr) : that.descPr != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (stock != null ? !stock.equals(that.stock) : that.stock != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPr;
        result = 31 * result + (namePr != null ? namePr.hashCode() : 0);
        result = 31 * result + (descPr != null ? descPr.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (stock != null ? stock.hashCode() : 0);
        return result;
    }
}
