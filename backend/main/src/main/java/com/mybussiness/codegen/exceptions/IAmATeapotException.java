package com.mybussiness.codegen.exceptions;

import javax.annotation.processing.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Generated(value = "com.exocoding.codegen", comments = "Generated by ExoCoding")
@ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
public class IAmATeapotException extends RuntimeException {}
