package br.com.northon.restspringbootandjavastudy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.northon.restspringbootandjavastudy.controller.request.MeteorologyRequest;
import br.com.northon.restspringbootandjavastudy.controller.response.MeteorologyResponse;

@RestController("/meteorology")
public class MeteorologyController {

	@PostMapping("/register")
	public MeteorologyResponse meteorologyPost(@RequestBody MeteorologyRequest request) {
		
		return new MeteorologyResponse("The information was successfully registered. Thank's for your collaboration");
	}
}
