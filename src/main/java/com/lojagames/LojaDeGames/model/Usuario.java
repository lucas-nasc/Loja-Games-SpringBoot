package com.lojagames.LojaDeGames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo é obrigatorio")
    private String nome;

    @NotBlank(message = "O atributo é obrigatorio")
    @Email(message = "O atributo usuario tem que receber um e-mail valido")
    private String usuario;

    @NotBlank(message = "O atributo é obrigatorio")
    @Size(min =8, message = "a senha tem que ter no minimo 8 caracteres")
    private String senha;

    @Size(max = 4000,message = "O link da foto inserida não pode passar dos 4000 caracteres")
    private String foto;
    @OneToMany(fetch = FetchType.LAZY,mappedBy="usuario", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("usuario")
    private List<Produtos> produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<Produtos> getProduto() {
        return produto;
    }

    public void setProduto(List<Produtos> produto) {
        this.produto = produto;
    }
}
