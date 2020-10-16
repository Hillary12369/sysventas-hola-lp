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

import pe.edu.upeu.sysventashola.entity.Ventas;
import pe.edu.upeu.sysventashola.service.VentasService;


@RestController
@RequestMapping("/ventas")

public class VentasController {
	@Autowired
	private VentasService ventaService;
	@GetMapping("/lista")
	public List<Map<String, Object>> lista() {
		return ventaService.readAll();
	}

	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return ventaService.read(id);
		
	}	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return ventaService.delete(id);
		
	}	
	@PostMapping("/create")
	public int create(@RequestBody Ventas v) {
		return ventaService.create(v);	
		
	}		
	@PutMapping("/update/{id}")
    public int update(@RequestBody Ventas v,@PathVariable int id) {
		v.setIdventas(id);
		
	return ventaService.update(v);
	}

}
