/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Cezarino Hora
 */
public class Vendas {
    
    
    //Atributos
    private int id_venda;
    private Clientes cliente;
    private String Dt_venda;
    private double Vlr_total_venda;
    private String observacoes;
    
    
    //Getters e Setters

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public String getDt_venda() {
        return Dt_venda;
    }

    public void setDt_venda(String Dt_venda) {
        this.Dt_venda = Dt_venda;
    }

    public double getVlr_total_venda() {
        return Vlr_total_venda;
    }

    public void setVlr_total_venda(double Vlr_total_venda) {
        this.Vlr_total_venda = Vlr_total_venda;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    
}
