package com.pima.core.service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.pima.core.entity.DomainEmail;
import com.pima.core.repository.DomainEmailRepository;

@Service(value="DomainEmailService")
public class DomainEmailService {
	@Autowired
	@Qualifier(value="DomainEmailRepository")
	private DomainEmailRepository repo;
	
private static final Log logger = LogFactory.getLog(InfoEmailService.class);
	
	public boolean create(DomainEmail domain) {
		logger.info("CREANDO NUEVO REGISTRO EN \"DOMAINEMAIL\"");
		try {
			repo.save(domain);
			logger.info("REGISTRO CREADO EN \"DOMAINEMAIL\"");
			return true;
		}catch(Exception e) {
			logger.error("ERROR AL CREAR EL REGISTRO EN \"DOMAINEMAIL\"");
			return false;
		}
	}
}
