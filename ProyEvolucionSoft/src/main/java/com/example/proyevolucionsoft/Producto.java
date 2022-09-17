package com.example.proyevolucionsoft;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Producto {
    @Id
    @GeneratedValue
    private Long id_prod;
    private String descProd;
    private Integer stock;
    private Integer IDCATE;
    private Integer IDMARCA;

    public Producto(String descProd, Integer stock, Integer IDCATE, Integer IDMARCA) {
        this.descProd = descProd;
        this.stock = stock;
        this.IDCATE = IDCATE;
        this.IDMARCA = IDMARCA;
    }

    public Producto() {
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id_prod=" + id_prod +
                ", descProd='" + descProd + '\'' +
                ", stock=" + stock +
                ", IDCATE=" + IDCATE +
                ", IDMARCA=" + IDMARCA +
                '}';
    }

    public Long getId_prod() {
        return id_prod;
    }
    public void setId_prod(Long id_prod) {
        this.id_prod = id_prod;
    }
    public String getDescProd() {
        return descProd;
    }
    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getIDCATE() {
        return IDCATE;
    }
    public void setIDCATE(Integer IDCATE) {
        this.IDCATE = IDCATE;
    }
    public Integer getIDMARCA() {
        return IDMARCA;
    }
    public void setIDMARCA(Integer IDMARCA) {
        this.IDMARCA = IDMARCA;
    }
}
