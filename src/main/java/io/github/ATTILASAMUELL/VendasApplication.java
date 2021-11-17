package io.github.ATTILASAMUELL;

import io.github.ATTILASAMUELL.domain.entity.Cliente;
import io.github.ATTILASAMUELL.domain.entity.Pedido;
import io.github.ATTILASAMUELL.domain.repository.Clientes;
import io.github.ATTILASAMUELL.domain.repository.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class VendasApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class,args);

        

    }
}
