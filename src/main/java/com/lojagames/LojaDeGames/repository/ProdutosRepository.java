package com.lojagames.LojaDeGames.repository;

import com.lojagames.LojaDeGames.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<Produtos,Long> {

    public List<Produtos> findAllByGameContainingIgnoreCase(@Param("game") String game);




}