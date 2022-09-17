package com.example.proyevolucionsoft;
import org.slf4j.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/producto")
public class ControladorProducto {

    private final Logger LOGGER = LoggerFactory.getLogger(ControladorProducto.class);

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    @Autowired
    private MarcaRepositorio marcaRepositorio;
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @GetMapping("")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("consultaHW")
    public String consultaHW(Model model) {
        model.addAttribute("listaCategoria", categoriaRepositorio.findAll());
        model.addAttribute("listaMarca", marcaRepositorio.findAll());
        return "consultarHW";
    }

    @GetMapping("listadoHW")
    public String listadoHW(Model model) {
        model.addAttribute("listaProductos", productoRepositorio.findAll());
        return "listado";
    }

    @PostMapping("/search")
    public String searchCategoria(@RequestParam Integer IDCATE, @RequestParam Integer IDMARCA ,  Model model) {
        List<Producto> productos = productoRepositorio.findByIDCATE(IDCATE);
        List<Producto> productos2 = new ArrayList<>();
        for (Producto producto : productos) {
            if (Objects.equals(producto.getIDMARCA(), IDMARCA)) {
                productos2.add(producto);

            }
        }

        model.addAttribute("listaProductoBuscada", productos2);
        model.addAttribute("listaCategoria", categoriaRepositorio.findAll());
        model.addAttribute("listaMarca", marcaRepositorio.findAll());
        return "consultarHW";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id, Model model){
        productoRepositorio.deleteById(id);
        model.addAttribute("listaProductos", productoRepositorio.findAll());
        return "listado";
    }

}
