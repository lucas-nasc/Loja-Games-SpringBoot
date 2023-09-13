package com.lojagames.LojaDeGames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atribulo é obrigatorio")
    @Size(min = 2, max = 100,message = "O atributo titulo é obrigatorio")
    private String game;

    @NotBlank(message = "Atributo obrigatorio")
    @Size(min =5, max = 100,message = "O atributo é obrigatorio")
    private String totalJogadores;

    @ManyToOne
    @JsonIgnoreProperties("produtos")
    private Categoria categoria;

    @ManyToOne
    @JsonIgnoreProperties("produtos")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getTotalJogadores() {
        return totalJogadores;
    }

    public void setTotalJogadores(String totalJogadores) {
        this.totalJogadores = totalJogadores;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
