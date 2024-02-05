package br.com.northon.restspringbootandjavastudy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedClimateInfoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3443253612359529340L;

}
