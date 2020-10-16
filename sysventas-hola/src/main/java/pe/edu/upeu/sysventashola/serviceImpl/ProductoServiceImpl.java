package pe.edu.upeu.sysventashola.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysventashola.dao.ProductoDao;
import pe.edu.upeu.sysventashola.entity.Producto;
import pe.edu.upeu.sysventashola.service.ProductoService;

@Service

public class ProductoServiceImpl implements ProductoService {
	

	@Autowired
	private ProductoDao productodao;
	
	@Override
	public int create(Producto pro) {
		// TODO Auto-generated method stub
		return productodao.create(pro);
	}

	@Override
	public int update(Producto pro) {
		// TODO Auto-generated method stub
		return productodao.update(pro);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return productodao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id){
		// TODO Auto-generated method stub
		return productodao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return productodao.readAll();
	}
	
	

}
