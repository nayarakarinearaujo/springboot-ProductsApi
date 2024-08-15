package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

// Em um record, os valores dos campos são imutáveis após a criação.
// Podemos apenas ler, não alterar.

public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {
// @NotBlank garante que 'name' não seja nulo e não esteja vazio (sem espaços em branco).
// @NotNull garante que 'value' não seja nulo.
// Essas anotações ajudam a validar os dados antes de criar o record.

}
