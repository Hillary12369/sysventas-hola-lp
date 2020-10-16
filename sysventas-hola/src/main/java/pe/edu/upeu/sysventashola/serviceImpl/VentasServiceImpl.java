package pe.edu.upeu.sysventashola.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysventashola.dao.VentasDao;
import pe.edu.upeu.sysventashola.entity.Ventas;
import pe.edu.upeu.sysventashola.service.VentasService;

@Service

public class VentasServiceImpl implements VentasService{
	
	@Autowired
	private VentasDao ventasdao;
	
	@Override
	public int create(Ventas v ) {
		// TODO Auto-generated method stub
		return ventasdao.create(v);
	}

	@Override
	public int update(Ventas v) {
		// TODO Auto-generated method stub
		return ventasdao.update(v);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return ventasdao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id){
		// TODO Auto-generated method stub
		return ventasdao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return ventasdao.readAll();
	}


}
