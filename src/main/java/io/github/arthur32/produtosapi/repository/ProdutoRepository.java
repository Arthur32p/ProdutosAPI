package io.github.arthur32.produtosapi.repository;

import io.github.arthur32.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
