/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Fornecedores;
import model.Produtos;

/**
 *
 * @author Cezarino Hora
 */
public class ProdutosDao {
    
    
    //Conexão com o Banco
    private Connection con;

    public ProdutosDao() {
        this.con = new ConnectionFactory().getConnection();
    }

    //Método Cadastrar Produtos
    public void cadastrar(Produtos obj){
        try {
            //1 passo - criar o comando sql
            String sql = "INSERT INTO tb_produto (descricao, qtd_estoque, vlr_preco, id_forn) values(?,?,?,?)";
            
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setInt(2, obj.getQtd_estoque());
            stmt.setDouble(3, obj.getVlr_preco());
            stmt.setInt(4, obj.getFornecedor().getId_forn());
            
            stmt.execute();
            
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso!");     
            
            
            
            
        } catch (Exception erro) {
                
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
           
        }
    }
    
    //Metodo Listar Todos os Produtos
    public List<Produtos> listarProdutos(){
        try {

            //1 passo criar a lista
            List<Produtos> lista = new ArrayList<>();

            //2 passo - criar o sql
            String sql = "SELECT p.id_prod, p.descricao, p.qtd_estoque, p.vlr_preco, f.nome \n" +
                            "FROM BDVENDAS.tb_produto as p\n" +
                            "INNER JOIN BDVENDAS.tb_fornecedor as f on (p.id_forn = f.id_forn);";
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();

                obj.setId_prod(rs.getInt("p.id_prod"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                obj.setVlr_preco(rs.getDouble("p.Vlr_preco"));
                
                f.setNome(rs.getString(("f.nome")));
                
                obj.setFornecedor(f);
                
                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;

        }

    }

    //Método Alterar Produtos
    public void alterar(Produtos obj){
        try {
            //1 passo - criar o comando sql
            String sql = "UPDATE tb_produto SET descricao=?, qtd_estoque=?, vlr_preco=?, id_forn=? WHERE id_prod=?";
            
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setInt(2, obj.getQtd_estoque());
            stmt.setDouble(3, obj.getVlr_preco());
            stmt.setInt(4, obj.getFornecedor().getId_forn());
            
            stmt.setInt(5,obj.getId_prod());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto Alterado com Sucesso!");     

            
        } catch (Exception erro) {
                
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
           
        }
    }
    // Método ExcluirCliente
    public void excluir(Produtos obj) {
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este Produto?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            try {
                // 1 passo - Criar o comando sql
                String sql = "delete from tb_produto where id_prod = ?";

                // 2 passo - conectar o banco de dados e organizar o comando sql
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, obj.getId_prod());

                // 3 passo - executar o comando sql
                stmt.execute();
                stmt.close();

                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro: " + erro);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada.");
        }
    }
    
    //Metodo Pesquisar Produto por nome
    public List<Produtos> PesquisarProdutosPorNome(String descricao) {
        try {

            //1 passo criar a lista
            List<Produtos> lista = new ArrayList<>();

            //2 passo - criar o sql
            String sql = "select * from tb_fproduto where descricao like ? order by descricao";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,descricao);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos obj = new Produtos();

                obj.setId_prod(rs.getInt("id_prod"));
                obj.setDescricao(rs.getString("descricao"));
                obj.setQtd_estoque(rs.getInt("qtd_estoque"));
                obj.setVlr_preco(rs.getDouble("vlr_preco"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;

        }

    }    

    //Metodo Listar Todos os Produtos
    public List<Produtos> listarProdutosPorNome(String descricao){
        try {

            //1 passo criar a lista
            List<Produtos> lista = new ArrayList<>();

            //2 passo - criar o sql
            String sql = "SELECT p.id_prod, p.descricao, p.qtd_estoque, p.vlr_preco, f.nome \n" +
                            "FROM BDVENDAS.tb_produto as p\n" +
                            "INNER JOIN BDVENDAS.tb_fornecedor as f on (p.id_forn = f.id_forn) WHERE p.descricao like ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,descricao);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();

                obj.setId_prod(rs.getInt("p.id_prod"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                obj.setVlr_preco(rs.getDouble("p.Vlr_preco"));
                
                f.setNome(rs.getString(("f.nome")));
                
                obj.setFornecedor(f);
                
                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;

        }
    }
    
 
    //Metodo Consultar por nome
    public Produtos consultaPorNome(String descricao) {
        try {


            //1 passo - criar o sql, organizar e executar
            String sql = "SELECT p.id_prod, p.descricao, p.qtd_estoque, p.vlr_preco, f.nome \n" +
                            "FROM BDVENDAS.tb_produto as p\n" +
                            "INNER JOIN BDVENDAS.tb_fornecedor as f on (p.id_forn = f.id_forn) WHERE p.descricao = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,descricao);
            
            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();
            

            if (rs.next()) {

                obj.setId_prod(rs.getInt("id_prod"));
                obj.setDescricao(rs.getString("descricao"));
                obj.setQtd_estoque(rs.getInt("qtd_estoque"));
                obj.setVlr_preco(rs.getDouble("vlr_preco"));
                
                f.setNome(rs.getString("f.nome"));
                
                obj.setFornecedor(f);


            }
            return obj;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Produto Não Encontrado");
            return null;

        }

    }    
    
    //Metodo Busca produto por código
    public Produtos buscaPorCodigo(int id_prod) {
        try {


            //1 passo - criar o sql, organizar e executar
            String sql = "SELECT p.id_prod, p.descricao, p.qtd_estoque, p.vlr_preco, f.nome \n" +
                            "FROM BDVENDAS.tb_produto as p\n" +
                            "INNER JOIN BDVENDAS.tb_fornecedor as f on (p.id_forn = f.id_forn) WHERE p.id_prod = ?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,id_prod);
            
            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();
            

            if (rs.next()) {

                obj.setId_prod(rs.getInt("id_prod"));
                obj.setDescricao(rs.getString("descricao"));
                obj.setQtd_estoque(rs.getInt("qtd_estoque"));
                obj.setVlr_preco(rs.getDouble("vlr_preco"));
                
                f.setNome(rs.getString("f.nome"));
                
                obj.setFornecedor(f);


            }
            return obj;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Produto Não Encontrado");
            return null;

        }

    }    
 //chave que fecha a classe
}