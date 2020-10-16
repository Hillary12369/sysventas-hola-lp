package pe.edu.upeu.sysventashola.daoImpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysventashola.dao.VentasDao;
import pe.edu.upeu.sysventashola.entity.Ventas;


@Repository

public class VentasDaoImpl implements VentasDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Ventas v) {
		// TODO Auto-generated method stub
		String SQL = "insert into ventas(fecha,tipodoc,numdoc,idpersona,idcliente) values(?,?,?,?,?)";
				  
		return jdbcTemplate.update(SQL,v.getFecha(),
									v.getTipodoc(),
									v.getNumdoc(),
									v.getIdpersona(),
									v.getIdcliente()); 
		}

	@Override
	public int update(Ventas v) {
		// TODO Auto-generated method stub
		String SQL = "update ventas set fecha=?,tipodoc=?,numdoc=? where idventas=?";
							
		return jdbcTemplate.update(SQL, v.getFecha(), 
										v.getTipodoc(),
										v.getNumdoc(),
										v.getIdventas()
										);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from ventas where idventas=?";
		
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from ventas where idventas=?";		
		return jdbcTemplate.queryForMap(SQL, id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from ventas";
		return jdbcTemplate.queryForList(SQL);
	}
}