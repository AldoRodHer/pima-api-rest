package com.pima.core.repository;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pima.core.entity.InfoEmail;

@Repository(value="InfoEmailRepository")
public interface InfoEmailRepository extends JpaRepository<InfoEmail, Serializable> {
	public abstract InfoEmail findByEmail(String email);
	public abstract boolean existsByEmail(String email);
}