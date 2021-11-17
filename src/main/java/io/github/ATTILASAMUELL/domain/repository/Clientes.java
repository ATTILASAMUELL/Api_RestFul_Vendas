package io.github.ATTILASAMUELL.domain.repository;


import io.github.ATTILASAMUELL.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface Clientes extends JpaRepository<Cliente, Integer> {


    List<Cliente> findByNomeLike(String nome);

    boolean existsByNome(String nome);

    @Query(value= " select c from Cliente c where c.nome like :nome") //HQL
    List<Cliente> encontrarPorNome(@Param("nome") String nome);

    // pesquisa com sql nativo: "select * from cliente c where c.nome like '%:nome%' ", nativeQuery = true

    @Query("delete from Cliente c where c.nome =:nome")
    @Modifying //indicando que é atualização de deleção e não somente de leitura
    void deleteByNome(String nome);

    @Query(" select c from Cliente c left join fetch c.pedidos where c.id =:id")
    Cliente findClienteFetchPedidos(@Param("id") Integer id);






}
