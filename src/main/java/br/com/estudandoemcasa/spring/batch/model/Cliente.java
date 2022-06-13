package br.com.estudandoemcasa.spring.batch.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String sobreNome;
    private String idade;
    private String email;

    private List<Transacao> listaTransacao = new ArrayList<>();

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Transacao> getListaTransacao() {
        return listaTransacao;
    }

    public void setListaTransacao(List<Transacao> listaTransacao) {
        this.listaTransacao = listaTransacao;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", idade='" + idade + '\'' +
                ", email='" + email + '\''+
                (listaTransacao.isEmpty() ? "" : ", \ntransações=" + listaTransacao) +
                '}';
    }
}
