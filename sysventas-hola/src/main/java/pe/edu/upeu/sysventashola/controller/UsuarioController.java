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

import pe.edu.upeu.sysventashola.entity.Usuario;
import pe.edu.upeu.sysventashola.service.UsuarioService;



@RestController
@RequestMapping("/usuarios")

public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	@GetMapping("/lista")
	public List<Map<String, Object>> lista() {
		return usuarioService.readAll();
	}

	@GetMapping("/{id}")
	public Usuario read(@PathVariable String nomuser) {
		return usuarioService.read(nomuser);
		
	}	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return usuarioService.delete(id);
		
	}	
	@PostMapping("/create")
	public int create(@RequestBody Usuario u) {
		return usuarioService.create(u);	
		
	}		
	@PutMapping("/update/{id}")
    public int update(@RequestBody Usuario u,@PathVariable int id) {
		u.setIdpersona(id);
		
	return usuarioService.update(u);
	}

}
