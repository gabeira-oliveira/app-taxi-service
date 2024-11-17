package com.taxiservice.admin.catalogo.domain.category;

import com.taxiservice.admin.catalogo.domain.exceptions.DomainException;
import com.taxiservice.admin.catalogo.domain.validation.handler.ThrowsValidationHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CategoryTest {

    @Test
    void deve_criar_uma_nova_categoria() {
        final var inName = "Category 1";
        final var inDescription = "Description 1";
        final var inIsActive = true;

        final var outCategory = Category.create(inName, inDescription, inIsActive);

        Assertions.assertNotNull(outCategory);
        Assertions.assertNotNull(outCategory.getId());
        Assertions.assertEquals(inName, outCategory.getName());
        Assertions.assertEquals(inDescription, outCategory.getDescription());
        Assertions.assertEquals(inIsActive, outCategory.isActive());
        Assertions.assertNotNull(outCategory.getCreatedAt());
        Assertions.assertNotNull(outCategory.getUpdatedAt());
        Assertions.assertNull(outCategory.getDeletedAt());
    }

    @Test
    void nao_deve_aceitar_nova_categoria_com_nome_nulo() {
        final String expectedName = null;
        final var expectedErrorMessage = "Name must not be null";
        final var expectedErrorCount = 1;

        final var inDescription = "Description 1";
        final var inIsActive = true;

        final var outCategory = Category.create(expectedName, inDescription, inIsActive);

        final var actualException =
                Assertions.assertThrows(DomainException.class, () -> outCategory.validate(new ThrowsValidationHandler()));

        Assertions.assertEquals(expectedErrorCount, actualException.getErrors().size());
        Assertions.assertEquals(expectedErrorMessage, actualException.getErrors().get(0).message());

    }

}
