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

/**
 *
 * @author Cezarino Hora
 */
public class FornecedoresDao {
    
    private Connection con;

    public FornecedoresDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    //Metodo cadastrarFornecedores
    public void cadastrarFornecedores(Fornecedores obj) {
        try {
            //1 passo - criar o comando sql
            String sql = "insert into tb_fornecedor (nome,cnpj,email,telefone,cep,endereco,cidade,uf) "
                    + ""
                    + "values (?,?,?,?,?,?,?,?)";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnpj());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getTelefone());
            stmt.setString(5, obj.getCep());
            stmt.setString(6, obj.getEndereco());
            stmt.setString(7, obj.getCidade());
            stmt.setString(8, obj.getUf());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");

        } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    //Método Excluir Fornecedores
    public void excluirFornecedores(Fornecedores obj) {
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este Fornecedor?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            try {
                // 1 passo - Criar o comando sql
                String sql = "delete from tb_fornecedor where id_forn = ?";

                // 2 passo - conectar o banco de dados e organizar o comando sql
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, obj.getId_forn());

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

    //Método alterarFornecedores
    public void alterarFornecedor(Fornecedores obj) {
               try {
            //1 passo - criar o comando sql
            String sql = "update tb_fornecedor set nome=?, cnpj=?, email=?, telefone=?, cep=?, endereco=?, cidade=?, uf=? "
                    + "where id_forn=?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnpj());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getTelefone());
            stmt.setString(5, obj.getCep());
            stmt.setString(6, obj.getEndereco());
            stmt.setString(7, obj.getCidade());
            stmt.setString(8, obj.getUf());
            stmt.setInt(9, obj.getId_forn());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    //Método ListarFornecedores
    public List<Fornecedores> listarFornecedores() {
        try {

            //1 passo criar a lista
            List<Fornecedores> lista = new ArrayList<>();

            //2 passo - criar o sql
            String sql = "select * from tb_fornecedor order by nome";
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedores obj = new Fornecedores();

                obj.setId_forn(rs.getInt("id_forn"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("Cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;

        }

    }
    
    
    
    
    //Metodo Listar Fornecedores por nome
    public List<Fornecedores> listarFornecedoresPorNome() {
        try {

            //1 passo criar a lista
            List<Fornecedores> lista = new ArrayList<>();

            //2 passo - criar o sql
            String sql = "select * from tb_fornecedor where nome like ? order by nome";
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedores obj = new Fornecedores();

                obj.setId_forn(rs.getInt("id_forn"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("Cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;

        }

    }
    
    //Metodo Buscar cliente por nome
        public List<Fornecedores> BuscaFornecedoresPorNome(String nome) {
        try {

            //1 passo criar a lista
            List<Fornecedores> lista = new ArrayList<>();

            //2 passo - criar o sql
            String sql = "select * from tb_fornecedor where nome like ? order by nome";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,nome);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedores obj = new Fornecedores();

                obj.setId_cliente(rs.getInt("id_forn"));
                obj.setNome(rs.getString("nome"));
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("uf"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;

        }

    }
    
    
}
