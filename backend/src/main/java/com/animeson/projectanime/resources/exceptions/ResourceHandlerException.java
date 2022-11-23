package com.animeson.projectanime.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.animeson.projectanime.services.exceptions.DatabaseException;
import com.animeson.projectanime.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceHandlerException {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException e, HttpServletRequest request) {

		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError();

		err.setTimeStamp(Instant.now());
		err.setStatus(status.value());
		err.setError("Resource not found");
		err.setMensage(e.getMessage());
		err.setPath(request.getRequestURI());

		return ResponseEntity.status(status).body(err);
	}

	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> databaseIntegrity(DatabaseException e, HttpServletRequest request) {

		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError();

		err.setTimeStamp(Instant.now());
		err.setStatus(status.value());
		err.setError("Resource integrity");
		err.setMensage(e.getMessage());
		err.setPath(request.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ValidationError> validation(MethodArgumentNotValidException e,HttpServletRequest request){

		HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
		ValidationError err = new ValidationError();
		
		err.setTimeStamp(Instant.now());
		err.setStatus(status.value());
		err.setError("Validation exception");
		err.setMensage(e.getMessage());
		err.setPath(request.getRequestURI());
		
	for (FieldError f : e.getBindingResult().getFieldErrors()) {
		err.addError(f.getField(), f.getDefaultMessage());
	}	
		
		return ResponseEntity.status(status).body(err);
	}
}
