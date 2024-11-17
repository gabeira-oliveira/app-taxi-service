package com.taxiservice.admin.catalogo.domain.validation.handler;

import com.taxiservice.admin.catalogo.domain.exceptions.DomainException;
import com.taxiservice.admin.catalogo.domain.validation.Error;
import com.taxiservice.admin.catalogo.domain.validation.ValidationHandler;

import java.util.List;

public class ThrowsValidationHandler implements ValidationHandler {
    @Override
    public ValidationHandler append(final Error anError) {
        throw DomainException.with(List.of(anError));
    }

    @Override
    public ValidationHandler append(ValidationHandler anHandler) {
        throw DomainException.with(anHandler.getErrors());
    }

    @Override
    public ValidationHandler validate(Validation aValidation) {
        try {
            aValidation.validate();
        } catch (DomainException e) {
            throw DomainException.with(List.of(new Error(e.getMessage())));
        }
        return this;
    }

    @Override
    public List<Error> getErrors() {
        return List.of();
    }

    @Override
    public boolean hasErrors() {
        return ValidationHandler.super.hasErrors();
    }
}
