package com.taxiservice.admin.catalogo.domain.exceptions;

import java.util.List;

public class DomainExceptions extends RuntimeException {
    private final List<Error> errors;

    public DomainExceptions(final List<Error> anErrors) {
        super("", anErrors);
    }

    public DomainExceptions(String message, Throwable cause) {
        super(message, cause);
    }


}
