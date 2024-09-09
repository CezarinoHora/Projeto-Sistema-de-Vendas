/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Cezarino Hora
 */
public class Itens_venda {
    
    //Atributos
    private int id_itensv;
    private Vendas venda;
    private Produtos produto;
    private double vlr_subtotal;
    
    
    //Getters Setters

    public int getId_itensv() {
        return id_itensv;
    }

    public void setId_itensv(int id_itensv) {
        this.id_itensv = id_itensv;
    }

    public Vendas getVenda() {
        return venda;
    }

    public void setVenda(Vendas venda) {
        this.venda = venda;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public double getVlr_subtotal() {
        return vlr_subtotal;
    }

    public void setVlr_subtotal(double vlr_subtotal) {
        this.vlr_subtotal = vlr_subtotal;
    }
    
    
    
    
}
