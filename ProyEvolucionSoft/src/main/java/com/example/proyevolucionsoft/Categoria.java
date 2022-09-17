package com.example.proyevolucionsoft;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categoria {
    @Id
    @GeneratedValue
    private Integer id_cate;
    private  String nombCat;

    public Categoria(String nombCat) {
        this.nombCat = nombCat;
    }

    public Categoria() {
    }
    @Override
    public String toString() {
        return "Categoria{" +
                "id_cate=" + id_cate +
                ", nombCat='" + nombCat + '\'' +
                '}';
    }
    public Integer getId_cate() {
        return id_cate;
    }
    public void setId_cate(Integer id_cate) {
        this.id_cate = id_cate;
    }
    public String getNombCat() {
        return nombCat;
    }
    public void setNombCat(String nombCat) {
        this.nombCat = nombCat;
    }
}
