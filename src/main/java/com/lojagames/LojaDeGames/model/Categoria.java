package com.lojagames.LojaDeGames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo titulo é obrigatorio")
    @Size(min =2 ,max =50 , message = "O atributo é obrigatorio")
    private String console;

    @NotBlank(message = "O atributo titulo é obrigatorio")
    @Size(min =2,max =100 , message = "O atributo é obrigatorio")
    private String descricao;

    @OneToMany (fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("categoria")
    private List<Produtos> produtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }
}
