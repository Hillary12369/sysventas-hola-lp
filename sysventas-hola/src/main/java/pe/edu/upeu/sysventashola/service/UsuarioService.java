package pe.edu.upeu.sysventashola.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysventashola.entity.Usuario;

public interface UsuarioService {
	int create(Usuario u);
	int update(Usuario u);
	int delete(int id);
	Usuario read(String nomuser);
	List<Map<String, Object>>readAll();
	

}
