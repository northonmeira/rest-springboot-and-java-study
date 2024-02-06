package br.com.northon.restspringbootandjavastudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.northon.restspringbootandjavastudy.repository.MeteorologyRepository;

@Service
public class MeteorologyService {
	
	@Autowired
	private MeteorologyRepository meteorologyRepository;

	public void meteorologyRegister() {
		
		meteorologyRepository.save(null);
		
	}
}
