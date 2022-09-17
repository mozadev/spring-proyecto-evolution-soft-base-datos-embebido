package com.example.proyevolucionsoft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ProyEvolucionSoftApplication implements CommandLineRunner {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    @Autowired
    private MarcaRepositorio marcaRepositorio;
    @Autowired
    private ProductoRepositorio productoRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(ProyEvolucionSoftApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        InsertMarca();
//        insertCategor()
//         InsertProd();

    }

    public void InsertMarca(){

        marcaRepositorio.save(new Marca("QUANTUM"));
        marcaRepositorio.save(new Marca("KINGSTON"));
        marcaRepositorio.save(new Marca("CREATIVE"));
        marcaRepositorio.save(new Marca("LG"));
        marcaRepositorio.save(new Marca("SAMSUNG"));

    }

    public void insertCategor(){

        categoriaRepositorio.save(new Categoria("MONITORES"));
        categoriaRepositorio.save(new Categoria("DISCOS DUROS"));
        categoriaRepositorio.save(new Categoria("TARJETAS DE SONIDO"));
        categoriaRepositorio.save(new Categoria("MEMORIAS"));
    }

    public void InsertProd(){

        productoRepositorio.save(new Producto("Disco Duro 80 gb QUANTUM",10,2,1));
        productoRepositorio.save(new Producto("Memoria USB 2GB KINGSTON",25,4,2));
        productoRepositorio.save(new Producto("Tarjeta de Sonido Sound Blaster Xtreme CREATIVE",10,3,3));
        productoRepositorio.save(new Producto("Monitor 17 pulgadas LG",120,1,4));
        productoRepositorio.save(new Producto("Monitor 17 pulgadas SAMSUNG",4,1,5));
        productoRepositorio.save(new Producto("Tarjeta de sonido Sound Blaster x-f-x CREATIVE",15,3,3));
    }

}
