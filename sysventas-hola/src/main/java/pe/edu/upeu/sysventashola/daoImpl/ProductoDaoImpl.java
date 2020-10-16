package pe.edu.upeu.sysventashola.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysventashola.dao.ProductoDao;
import pe.edu.upeu.sysventashola.entity.Producto;


@Repository

public class ProductoDaoImpl implements ProductoDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Producto pro) {
		// TODO Auto-generated method stub
		String SQL = "insert into producto(nomprod,precio,cantidad) values(?,?,?)";
				  
		return jdbcTemplate.update(SQL,pro.getNomprod(),
									pro.getPrecio(),
									pro.getCantidad()); 
}

	@Override
	public int update(Producto pro) {
		// TODO Auto-generated method stub
		String SQL = "update producto set nomprod=?,precio=?,cantidad=? where idproducto=?";
							
		return jdbcTemplate.update(SQL, pro.getNomprod(), 
										pro.getPrecio(),
										pro.getCantidad(),
										pro.getIdproducto());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from producto where idproducto=?";
		
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from producto where idproducto=?";		
		return jdbcTemplate.queryForMap(SQL, id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from producto";
		return jdbcTemplate.queryForList(SQL);
	}

}
