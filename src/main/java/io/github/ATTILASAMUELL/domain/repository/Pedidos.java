package io.github.ATTILASAMUELL.domain.repository;

import io.github.ATTILASAMUELL.domain.entity.Cliente;
import io.github.ATTILASAMUELL.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido>  findByCliente(Cliente cliente);
}
