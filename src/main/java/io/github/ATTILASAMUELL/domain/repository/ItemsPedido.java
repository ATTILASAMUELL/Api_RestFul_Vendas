package io.github.ATTILASAMUELL.domain.repository;

import io.github.ATTILASAMUELL.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
