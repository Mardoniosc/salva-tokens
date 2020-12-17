package br.com.tecnisys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tecnisys.domain.Token;
import br.com.tecnisys.repositories.TokenRepository;

@Service
public class TokenService {

	@Autowired
	private TokenRepository repo;
	
	
	public Token insert(Token obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
}
