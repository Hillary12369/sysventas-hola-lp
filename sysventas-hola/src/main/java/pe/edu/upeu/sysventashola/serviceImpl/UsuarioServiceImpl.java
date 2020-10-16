package pe.edu.upeu.sysventashola.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysventashola.dao.UsuarioDao;
import pe.edu.upeu.sysventashola.entity.Usuario;
import pe.edu.upeu.sysventashola.service.UsuarioService;


@Service


public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioDao usuariodao;
	
	@Override
	public int create(Usuario u ) {
		// TODO Auto-generated method stub
		return usuariodao.create(u);
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return usuariodao.update(u);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuariodao.delete(id);
	}

	@Override
	public Usuario read(String nomuser){
		// TODO Auto-generated method stub
		return usuariodao.read(nomuser);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuariodao.readAll();
	}

	
}
