package io.github.ATTILASAMUELL.domain.repository;

import io.github.ATTILASAMUELL.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
