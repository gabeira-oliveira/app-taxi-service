package com.taxiservice.admin.catalogo.domain.validation;

public abstract class Validator {
    private final ValidationHandler handler;

    protected Validator(final ValidationHandler handler) {
        this.handler = handler;
    }
    protected ValidationHandler validationHandler() {
        return this.handler;
    }
    public abstract void validate();

}
