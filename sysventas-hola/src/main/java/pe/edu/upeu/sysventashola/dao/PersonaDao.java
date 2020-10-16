package pe.edu.upeu.sysventashola.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysventashola.entity.Persona;

public interface PersonaDao {
	int create(Persona p);
	int update(Persona p);
	int delete(int id);
	Map<String, Object> read(int id);
	List<Map<String, Object>>readAll();

}
