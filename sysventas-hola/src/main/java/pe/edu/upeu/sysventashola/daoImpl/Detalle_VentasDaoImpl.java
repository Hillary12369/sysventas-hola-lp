package pe.edu.upeu.sysventashola.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysventashola.dao.Detalle_VentasDao;
import pe.edu.upeu.sysventashola.entity.Detalle_Ventas;

import java.util.List;
import java.util.Map;




@Repository


public class Detalle_VentasDaoImpl implements Detalle_VentasDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Detalle_Ventas dv) {
		// TODO Auto-generated method stub
		String SQL = "insert into detalle_ventas(precio,cantidad,subtotal,idventas,idproducto) values(?,?,?,?,?)";
				  
		return jdbcTemplate.update(SQL,dv.getPrecio(),
									dv.getCantidad(),
									dv.getSubtotal(),
									dv.getIdventas(),
									dv.getIdproducto()); 
		}

	@Override
	public int update(Detalle_Ventas dv) {
		// TODO Auto-generated method stub
		String SQL = "update detalle_ventas set precio=? where iddetalle_ventas=?";
							
		return jdbcTemplate.update(SQL, dv.getPrecio(),						
										dv.getIddetalle_ventas());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from detalle_ventas where iddetalle_ventas=?";
		
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from detalle_ventas where iddetalle_ventas=?";		
		return jdbcTemplate.queryForMap(SQL, id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select * from detalle_ventas";
		return jdbcTemplate.queryForList(SQL);
	}
	

}