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

import pe.edu.upeu.sysventashola.entity.Persona;
import pe.edu.upeu.sysventashola.service.PersonaService;

@RestController
@RequestMapping("/personas")

public class PersonaController {
	@Autowired
	private PersonaService personaService;
	@GetMapping("/lista")
	public List<Map<String, Object>> lista() {
		return personaService.readAll();
	}

	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return personaService.read(id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return personaService.delete(id);
		
	}	
	@PostMapping("/create")
	public int create(@RequestBody Persona p) {
		return personaService.create(p);	
		
	}		
	@PutMapping("/update/{id}")
    public int update(@RequestBody Persona p,@PathVariable int id) {
		p.setIdpersona(id);
		
	return personaService.update(p);
	}	
}