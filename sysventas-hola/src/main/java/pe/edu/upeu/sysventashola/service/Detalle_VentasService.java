package pe.edu.upeu.sysventashola.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysventashola.entity.Detalle_Ventas;

public interface Detalle_VentasService {
	int create(Detalle_Ventas dv);
	int update(Detalle_Ventas dv);
	int delete(int id);
	Map<String, Object> read(int id);
	List<Map<String, Object>>readAll();
}
