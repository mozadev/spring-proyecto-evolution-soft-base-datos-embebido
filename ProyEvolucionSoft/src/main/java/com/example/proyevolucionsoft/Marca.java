package com.example.proyevolucionsoft;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Marca {
    @Id
    @GeneratedValue
    private Long id_marca;
    private String nombMarca;

    public Marca(String nombMarca) {
        this.nombMarca = nombMarca;
    }
    public Marca() {
    }
    @Override
    public String toString() {
        return "Marca{" +
                "id_marca=" + id_marca +
                ", nombMarca='" + nombMarca + '\'' +
                '}';
    }

    public Long getId_marca() {
        return id_marca;
    }
    public void setId_marca(Long id_marca) {
        this.id_marca = id_marca;
    }
    public String getNombMarca() {
        return nombMarca;
    }
    public void setNombMarca(String nombMarca) {
        this.nombMarca = nombMarca;
    }

}
