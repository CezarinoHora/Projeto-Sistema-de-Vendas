/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Vendas;

/**
 *
 * @author Cezarino Hora
 */
public class VendasDao {
    
    
    //Conexão com o Banco
    private Connection con;

    public VendasDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    //Cadastrar Venda
 /*   public void cadastrarVenda(Vendas obj){
        
        try {
            //1 passo - criar o comando sql
            String sql = "INSERT INTO tb_venda (data_venda, vlr_total_venda, observacoes, id_cliente, id_Func, id_fpgto) values(?,?,?,?,?,?)";
            
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, obj.getData_venda());
            stmt.setDouble(2, obj.getvlr_total_venda());
            stmt.setString(3, obj.getobservacoes());
            stmt.setInt(4,obj.getCliente().id_cliente());
            stmt.setInt(5,obj.getFuncionarios().id_func());
            stmt.setInt(6,obj.getfpagamento().id_fpgto());
            
            stmt.execute();
            
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso!");     
            
            
            
            
        } catch (Exception erro) {
                
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
           
        }    
            
   
    }
 *\   
    
    //Retorna a última venda
    
    
    
}
