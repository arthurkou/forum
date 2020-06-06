package br.com.alura.forum.config.validacao.security;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

	public String gerarToken(Authentication authentication) {
		return null;
	}

}
