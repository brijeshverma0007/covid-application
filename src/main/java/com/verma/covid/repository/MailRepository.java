package com.verma.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verma.covid.model.EmailModel;

@Repository
public interface MailRepository extends JpaRepository<EmailModel, String> {
	
}
