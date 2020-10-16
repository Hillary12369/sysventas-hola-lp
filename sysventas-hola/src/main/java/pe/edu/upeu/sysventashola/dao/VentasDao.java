package pe.edu.upeu.sysventashola.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysventashola.entity.Ventas;

public interface VentasDao {
	int create(Ventas v);
	int update(Ventas v);
	int delete(int id);
	Map<String,Object> read(int id);
	List<Map<String,Object>>readAll();

}
