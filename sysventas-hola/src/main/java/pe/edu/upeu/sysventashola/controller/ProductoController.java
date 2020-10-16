package pe.edu.upeu.sysventashola.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sysventashola.entity.Producto;
import pe.edu.upeu.sysventashola.service.ProductoService;


@RestController
@RequestMapping("/productos")

public class ProductoController {
	@Autowired
	private ProductoService productoService;
	@GetMapping("/lista")
	public List<Map<String, Object>> lista() {
		return productoService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return productoService.read(id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return productoService.delete(id);
		
	}	
	@PostMapping("/create")
	public int create(@RequestBody Producto pro) {
		return productoService.create(pro);	
		
	}		
	@PutMapping("/update/{id}")
    public int update(@RequestBody Producto pro,@PathVariable int id) {
		pro.setIdproducto(id);
		
	return productoService.update(pro);
	}	
	
	
	
}