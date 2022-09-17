package com.example.proyevolucionsoft;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoRepositorio extends CrudRepository<Producto,Long> {


   List<Producto>findByIDCATE(Integer codIdCATE);
   List<Producto>findByIDMARCA(Integer codIdMARCA);


}
