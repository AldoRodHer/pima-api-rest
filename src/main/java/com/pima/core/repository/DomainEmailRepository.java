package com.pima.core.repository;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pima.core.entity.DomainEmail;

@Repository(value="DomainEmailRepository")
public interface DomainEmailRepository extends JpaRepository<DomainEmail, Serializable>{
	public abstract DomainEmail findByDomain(String domain);
	public abstract boolean existsByDomain(String domain);
}
