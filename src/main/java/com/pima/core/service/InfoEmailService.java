package com.pima.core.service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.pima.core.entity.InfoEmail;
import com.pima.core.repository.InfoEmailRepository;

@Service(value="InfoEmailService")
public class InfoEmailService {
	@Autowired
	@Qualifier(value="InfoEmailRepository")
	private InfoEmailRepository repo;
	
	private static final Log logger = LogFactory.getLog(InfoEmailService.class);
	
	public boolean create(InfoEmail email) {
		logger.info("CREANDO NUEVO REGISTRO EN \"INFOEMAIL\"");
		try {
			repo.save(email);
			logger.info("REGISTRO CREADO EN \"INFOEMAIL\"");
			return true;
		}catch(Exception e) {
			logger.error("ERROR AL CREAR EL REGISTRO EN \"INFOEMAIL\"");
			return false;
		}
	}
	
	public boolean update(InfoEmail email) {
		try {
			if(repo.existsByEmail(email.getEmail())) {
				InfoEmail emailObj = repo.findByEmail(email.getEmail());
				//TODO: Update object
				repo.save(emailObj);
			}else {
				create(email);
			}
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
