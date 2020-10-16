package pe.edu.upeu.sysventashola;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.sysventashola.dao.UsuarioDao;

@SpringBootTest
class SysventasHolaApplicationTests {
	@Autowired
	UsuarioDao usuarioDao;
	@Test
	void contextLoads() {
		System.out.println(usuarioDao.read("sanchezh").getClave());
	}

}
