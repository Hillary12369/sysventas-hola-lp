package pe.edu.upeu.sysventashola.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysventashola.entity.Producto;

public interface ProductoDao {
	int create (Producto pro);
	int update (Producto pro);
	int delete (int id);
	Map<String, Object> read(int id);
	List<Map<String, Object>>readAll();
}
