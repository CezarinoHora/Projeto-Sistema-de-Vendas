/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Cezarino Hora
 */
public class Produtos {
    
    
    //Atributos
    private int id_prod;
    private String descricao;
    private int qtd_estoque;
    private double vlr_preco;
    
    private Fornecedores fornecedor;
    
        
    //Getters e Setters

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public double getVlr_preco() {
        return vlr_preco;
    }

    public void setVlr_preco(double vlr_preco) {
        this.vlr_preco = vlr_preco;
    }

    public Fornecedores getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedores fornecedor) {
        this.fornecedor = fornecedor;
    }
   
}
