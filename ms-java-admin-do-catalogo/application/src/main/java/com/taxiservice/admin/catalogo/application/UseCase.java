package com.taxiservice.admin.catalogo.application;

import com.taxiservice.admin.catalogo.domain.category.Category;

public class UseCase {

    public Category execute(String id, String name) {
        return Category.create(name, "description", true);
    }
}