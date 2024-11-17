package com.taxiservice.admin.catalogo.domain.category;

import com.taxiservice.admin.catalogo.domain.validation.ValidationHandler;
import com.taxiservice.admin.catalogo.domain.validation.Validator;
import com.taxiservice.admin.catalogo.domain.validation.Error;

public class CategoryValidator  extends Validator {

    private final Category category;

    public CategoryValidator(Category category, ValidationHandler handler) {
        super(handler);
        this.category = category;
    }

    @Override
    public void validate() {
        if(this.category.getName() == null || this.category.getName().isEmpty()) {
            validationHandler().append(new Error("Name must not be null"));
        }
    }
}
