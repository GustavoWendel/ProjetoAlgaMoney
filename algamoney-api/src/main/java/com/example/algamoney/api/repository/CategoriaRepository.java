package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.models.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
