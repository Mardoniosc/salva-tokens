package br.com.tecnisys.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tecnisys.domain.Token;
import br.com.tecnisys.service.TokenService;

@RestController
@RequestMapping("token")
public class TokenResource {

	@Autowired
	private TokenService service;
	
	@GetMapping()
	public Token getToken(@RequestParam(value = "tokenfirebase", defaultValue = "null" ) String tokenFirebase) {
		Token obj = new Token(null, tokenFirebase);
		return service.insert(obj);
	}
}
