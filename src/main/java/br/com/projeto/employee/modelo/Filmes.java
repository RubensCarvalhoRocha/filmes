package br.com.projeto.employee.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "filmes")
public class Filmes {
   
    //Declarando as colunas da minha tabela:
    @Id                                                                 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //--> Gerador de Id automatico
    private long id;
    private String nomeFilme;
    private String diretor;
    private String ano;
    private float nota;

    //Getters e Setters:
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }

}