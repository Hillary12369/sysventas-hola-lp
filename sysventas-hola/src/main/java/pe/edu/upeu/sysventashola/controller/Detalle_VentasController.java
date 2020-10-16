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

import pe.edu.upeu.sysventashola.entity.Detalle_Ventas;
import pe.edu.upeu.sysventashola.service.Detalle_VentasService;


@RestController
@RequestMapping("/detalleventas")

public class Detalle_VentasController {
	@Autowired
	private Detalle_VentasService detalleventaService;
	@GetMapping("/lista")
	public List<Map<String, Object>> lista() {
		return detalleventaService.readAll();
	}

	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return detalleventaService.read(id);
		
	}	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return detalleventaService.delete(id);
		
	}	
	@PostMapping("/create")
	public int create(@RequestBody Detalle_Ventas dv) {
		return detalleventaService.create(dv);	
		
	}		
	@PutMapping("/update/{id}")	
    public int update(@RequestBody Detalle_Ventas dv,@PathVariable int id) {
		dv.setIddetalle_ventas(id);
		
	return detalleventaService.update(dv);
	}
}
