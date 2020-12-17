package br.com.tecnisys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tecnisys.domain.Token;


@Repository
public interface TokenRepository extends JpaRepository<Token, Integer>{

}
