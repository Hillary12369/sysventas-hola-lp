package pe.edu.upeu.sysventashola.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysventashola.dao.UsuarioDao;
import pe.edu.upeu.sysventashola.entity.Usuario;


@Repository

public class UsuarioDaoImpl implements UsuarioDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		String SQL = "insert into usuario(idpersona,nomuser,clave,estado,idrol) values(?,?,?,?,?)";
		
		return jdbcTemplate.update(SQL,u.getIdpersona(),
									u.getNomuser(),
									u.getClave(),
									u.getEstado(),
									u.getIdrol());
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		String SQL = "update usuario set nomuser=?,clave=?,estado=?, idrol=? where idpersona=?";
		return jdbcTemplate.update(SQL, u.getNomuser(), 
										u.getClave(),
										u.getEstado(),
										u.getIdrol(),
										u.getIdpersona());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from usuario where idpersona=?";
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		String SQL = "select * from usuario where nomuser=?";
		return jdbcTemplate.queryForObject(SQL, new Object[]{nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from usuario";
		return jdbcTemplate.queryForList(SQL);
	}
	
	
}
