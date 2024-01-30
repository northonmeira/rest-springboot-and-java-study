package br.com.northon.restspringbootandjavastudy.controller.response;

public class MeteorologyResponse {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MeteorologyResponse(String message) {
		super();
		this.message = message;
	}
	

}
