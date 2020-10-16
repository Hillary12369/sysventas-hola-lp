package pe.edu.upeu.sysventashola.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysventashola.dao.Detalle_VentasDao;
import pe.edu.upeu.sysventashola.entity.Detalle_Ventas;
import pe.edu.upeu.sysventashola.service.Detalle_VentasService;

@Repository

public class Detalle_VentasServiceImpl implements Detalle_VentasService{

	@Autowired
	private Detalle_VentasDao detalleventasdao;
	
	@Override
	public int create(Detalle_Ventas dv ) {
		// TODO Auto-generated method stub
		return detalleventasdao.create(dv);
	}

	@Override
	public int update(Detalle_Ventas dv) {
		// TODO Auto-generated method stub
		return detalleventasdao.update(dv);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return detalleventasdao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id){
		// TODO Auto-generated method stub
		return detalleventasdao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detalleventasdao.readAll();
	}


	
	
}