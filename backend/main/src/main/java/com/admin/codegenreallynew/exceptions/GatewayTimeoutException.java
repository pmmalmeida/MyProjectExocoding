package com.admin.codegenreallynew.exceptions;

import javax.annotation.processing.Generated;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Generated(value = "com.exocoding.codegen", comments = "Generated by ExoCoding")
@ResponseStatus(code = HttpStatus.GATEWAY_TIMEOUT)
public class GatewayTimeoutException extends RuntimeException {}
