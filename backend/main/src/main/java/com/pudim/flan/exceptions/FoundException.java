package com.pudim.flan.exceptions;

import javax.annotation.processing.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Generated(value = "com.exocoding.codegen", comments = "Generated by ExoCoding")
@ResponseStatus(code = HttpStatus.FOUND)
public class FoundException extends RuntimeException {}
