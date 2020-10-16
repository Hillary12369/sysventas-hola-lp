package pe.edu.upeu.sysventashola.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysventashola.entity.Ventas;

public interface VentasService {
	int create(Ventas v);
	int update(Ventas v);
	int delete(int id);
	Map<String,Object> read(int id);
	List<Map<String,Object>>readAll();

}
