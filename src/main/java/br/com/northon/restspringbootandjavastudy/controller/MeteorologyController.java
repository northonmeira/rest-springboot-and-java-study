package br.com.northon.restspringbootandjavastudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.northon.restspringbootandjavastudy.controller.request.MeteorologyRequest;
import br.com.northon.restspringbootandjavastudy.controller.response.MeteorologyResponse;
import br.com.northon.restspringbootandjavastudy.service.MeteorologyService;

@RestController()
public class MeteorologyController {
	
	@Autowired
	private MeteorologyService service;

	@PostMapping("/meteorology/register")
	public MeteorologyResponse meteorologyPost(@RequestBody MeteorologyRequest request) throws Exception {
		
		service.meteorologyRegister();
		
		throw new Exception("Mensagem forçada");
//		return new MeteorologyResponse("The information was successfully registered. Thank's for your collaboration");
	}
}
