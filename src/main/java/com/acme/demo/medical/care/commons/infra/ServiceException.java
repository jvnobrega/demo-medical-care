package com.acme.demo.medical.care.commons.infra;

import com.acme.demo.medical.care.commons.domain.error.ApplicationErrorCode;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
public class ServiceException extends RuntimeException implements Serializable {
  @Serial
  private static final long serialVersionUID = 2405172041950251807L;

  private final ApplicationErrorCode applicationErrorCode;

  public ServiceException(ApplicationErrorCode applicationErrorCode) {
    super(applicationErrorCode.getMessage());
    this.applicationErrorCode = applicationErrorCode;
  }

  public ServiceException(ApplicationErrorCode applicationErrorCode, String message) {
    super(message);
    this.applicationErrorCode = applicationErrorCode;
  }

}
