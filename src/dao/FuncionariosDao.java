/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import View.Frmmenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Funcionarios;

/**
 *
 * @author Cezarino Hora
 */
public class FuncionariosDao {
    
    //Conexão
    private Connection con;

    public FuncionariosDao() {
        this.con = new ConnectionFactory().getConnection();

    }

    // Método Cadastrar Funcionário
    public void cadastrarFuncionarios(Funcionarios obj) {
        try {
            //1 passo - criar o comando sql
            String sql = "insert into tb_funcionario (nome,cpf,email,senha,cargo,nivel_acesso,telefone,cep,endereco,cidade,uf) "
                    + " values (?,?,?,?,?,?,?,?,?,?,?)";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getSenha());
            stmt.setString(5, obj.getCargo());
            stmt.setString(6, obj.getNivel_acesso());
            stmt.setString(7, obj.getTelefone());
            stmt.setString(8, obj.getCep());
            stmt.setString(9, obj.getEndereco());
            stmt.setString(10, obj.getCidade());
            stmt.setString(11, obj.getUf());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");

        } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }

    //Método Alterar Funcionários
    public void alterarFuncionario(Funcionarios obj) {
               try {
            //1 passo - criar o comando sql
            String sql = "update tb_funcionario set nome=?, cpf=?, email=?, senha=?, cargo=?, nivel_acesso=?, telefone=?, cep=?, endereco=?, cidade=?, uf=? "
                    + "where id_func=?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setString(3, obj.getEmail());
            
            stmt.setString(4, obj.getSenha());
            stmt.setString(5, obj.getCargo());
            stmt.setString(6, obj.getNivel_acesso());
            
            stmt.setString(7, obj.getTelefone());
            stmt.setString(8, obj.getCep());
            stmt.setString(9, obj.getEndereco());
            stmt.setString(10, obj.getCidade());
            stmt.setString(11, obj.getUf());
            stmt.setInt(12, obj.getId_func());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }    
    
    
    //Método Excluir Funcionários
    public void excluirFuncionario(Funcionarios obj) {
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este Funcionário?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            try {
                // 1 passo - Criar o comando sql
                String sql = "delete from tb_funcionario where id_func = ?";

                // 2 passo - conectar o banco de dados e organizar o comando sql
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, obj.getId_func());

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
    
    
    
    
    
    
    // Método Listar Todos Funcionários
    public List<Funcionarios> listarFuncionarios() {
        try {

            //1 passo criar a lista
            List<Funcionarios> lista = new ArrayList<>();

            //2 passo - criar o sql
            String sql = "select * from tb_funcionario order by nome";
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionarios obj = new Funcionarios();

                obj.setId_func(rs.getInt("id_Func"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
                
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

    //Metodo Buscar funcionário por nome
    public List<Funcionarios> BuscaFuncionarioPorNome(String nome) {
        try {

            //1 passo criar a lista
            List<Funcionarios> lista = new ArrayList<>();

            //2 passo - criar o sql
            String sql = "select * from tb_funcionario where nome like ? order by nome";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionarios obj = new Funcionarios();

                obj.setId_func(rs.getInt("id_func"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
                              
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


    //Método Efetuar Login
    public void efetuaLogin(String email, String senha){
        try {
            
            //1 passo - SQL
            String  sql = "select * from tb_funcionario where email=? and senha=?";
                PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,email);
            stmt.setString(2,senha);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                //Usuário Logou corretamente
                JOptionPane.showMessageDialog(null,"Seja bem vindo ao Sistema de Vendas");
                Frmmenu tela = new Frmmenu();
                tela.usuariologado = rs.getString("nome");               
                tela.setVisible(true);
                
            }else{
                //Dados Incorretos
                JOptionPane.showMessageDialog(null,"Dados Incorretos");
            }
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Erro: "+ erro);
            
        }
        
    }
}
