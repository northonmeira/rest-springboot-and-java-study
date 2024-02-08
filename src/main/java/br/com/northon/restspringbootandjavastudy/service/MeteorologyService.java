package br.com.northon.restspringbootandjavastudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.northon.restspringbootandjavastudy.controller.request.MeteorologyRequest;
import br.com.northon.restspringbootandjavastudy.repository.MeteorologyRepository;
import br.com.northon.restspringbootandjavastudy.repository.entity.MeteorologyEntity;

@Service
public class MeteorologyService {
	
	@Autowired
	private MeteorologyRepository meteorologyRepository;

	public void meteorologyRegister(MeteorologyRequest request) {
		
		MeteorologyEntity entity = new MeteorologyEntity();
		
		entity.setTemperature(request.getClimateCondition().getTemperature());
		entity.setWeatherCondition(request.getClimateCondition().getWeatherCondition());
		entity.setDate(request.getDate());
		entity.setCity(request.getCity());
		entity.setState(request.getState());
		
		meteorologyRepository.save(entity);
//		meteorologyRepository.findAll();
		
	}

	public boolean isValid(MeteorologyRequest request) {
		// TODO Auto-generated method stub
		return true;
	}
}
