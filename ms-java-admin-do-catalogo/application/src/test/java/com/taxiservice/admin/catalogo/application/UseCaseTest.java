package com.taxiservice.admin.catalogo.application;

import com.taxiservice.admin.catalogo.domain.category.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UseCaseTest {

     @Test
     void deve_criar_uma_nova_categoria() {
         UseCase useCase = new UseCase();
         Category category = useCase.execute("1", "Category 1");
         Assertions.assertNotNull(category);
     }
}
