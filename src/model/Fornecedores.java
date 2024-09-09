/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Cezarino Hora
 */
public class Fornecedores extends Clientes{
    
    //atributos
    private int id_forn;
    private String cnpj;
    
    
    //getters e setters

    public int getId_forn() {
        return id_forn;
    }

    public void setId_forn(int id_forn) {
        this.id_forn = id_forn;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString(){
        return this.getNome();
    
    }
    
}
