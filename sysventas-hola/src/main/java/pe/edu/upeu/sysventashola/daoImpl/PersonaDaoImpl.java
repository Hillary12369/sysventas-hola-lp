package pe.edu.upeu.sysventashola.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysventashola.dao.PersonaDao;
import pe.edu.upeu.sysventashola.entity.Persona;

import java.util.List;
import java.util.Map;




@Repository

public class PersonaDaoImpl implements PersonaDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Persona p) {
		// TODO Auto-generated method stub
		String SQL = "insert into persona(nombres,apellidos,dni) values(?,?,?)";
				  
		return jdbcTemplate.update(SQL,p.getNombres(),
									p.getApellidos(),
									p.getDni()); 
}

	@Override
	public int update(Persona p) {
		// TODO Auto-generated method stub
		String SQL = "update persona set nombres=?,apellidos=?,dni=? where idpersona=?";
							
		return jdbcTemplate.update(SQL, 
										p.getNombres(), 
										p.getApellidos(),
										p.getDni(),
										p.getIdpersona()
										);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from persona where idpersona=?";
		
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from persona where idpersona=?";		
		return jdbcTemplate.queryForMap(SQL, id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from persona";
		return jdbcTemplate.queryForList(SQL);
	}
}