package br.com.northon.restspringbootandjavastudy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.northon.restspringbootandjavastudy.controller.request.MeteorologyRequest;
import br.com.northon.restspringbootandjavastudy.controller.response.MeteorologyResponse;
import br.com.northon.restspringbootandjavastudy.service.MeteorologyService;

@RequestMapping
@RestController
public class MeteorologyController {
	
	@Autowired
	private MeteorologyService service;

	@PostMapping("/meteorology/register")
	public MeteorologyResponse meteorologyPost(@Valid @RequestBody MeteorologyRequest request) throws Exception {
		
		service.meteorologyRegister(request);
		
		return new MeteorologyResponse("The information was successfully saved.");
	}
}
