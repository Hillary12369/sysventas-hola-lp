package pe.edu.upeu.sysventashola.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysventashola.dao.PersonaDao;
import pe.edu.upeu.sysventashola.entity.Persona;
import pe.edu.upeu.sysventashola.service.PersonaService;

@Service

public class PersonaServiceImpl implements PersonaService{

	@Autowired
	private PersonaDao personadao;
	
	@Override
	public int create(Persona p) {
		// TODO Auto-generated method stub
		return personadao.create(p);
	}

	@Override
	public int update(Persona p) {
		// TODO Auto-generated method stub
		return personadao.update(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personadao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id){
		// TODO Auto-generated method stub
		return personadao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return personadao.readAll();
	}
}