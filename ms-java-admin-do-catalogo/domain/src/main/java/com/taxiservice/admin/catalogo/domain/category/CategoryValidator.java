package com.taxiservice.admin.catalogo.domain.category;

import com.taxiservice.admin.catalogo.domain.validation.ValidationHandler;
import com.taxiservice.admin.catalogo.domain.validation.Validator;

public class CategoryValidator  extends Validator {

    private final Category category;

    public CategoryValidator(Category category, ValidationHandler handler) {
        super(handler);
        this.category = category;
    }

    @Override
    public void validate() {
        if (category == null) {
            validationHandler().handle("Category must not be null");
            return;
        }
        if (category.getName() == null || category.getName().isEmpty()) {
            validationHandler().handle("Category name must not be null or empty");
        }
    }
}
