package com.acme.demo.medical.care.commons.domain.error;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public interface ApplicationErrorCode extends Serializable {

  String getPrefixCode();

  String getCode();

  String getMessage();

  HttpStatus getStatus();
}
