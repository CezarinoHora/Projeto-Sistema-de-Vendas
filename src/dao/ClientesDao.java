/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Clientes;

/*
 *
 * @author Cezarino Hora
 */
public class ClientesDao {

    private Connection con;

    public ClientesDao() {
        this.con = new ConnectionFactory().getConnection();

    }

    //Metodo cadastrarCliente
    if (txtcodigo.getText().isEmpty()) { // Verifica se txtcodigo está vazio
        try {
            public void cadastrarCliente(Clientes obj) {
            try {
                //1 passo - criar o comando sql
                String sql = "insert into tb_cliente (nome,cpf,email,telefone,cep,endereco,cidade,uf) "
                        + ""
                        + "values (?,?,?,?,?,?,?,?)";

                //2 passo - conectar o banco de dados e organizar o comando sql
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, obj.getNome());
                stmt.setString(2, obj.getCpf());
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
        }else {
            JOptionPane.showMessageDialog(null, "Código já cadastrado!");
        }            
        
        }

    //Metodo AlterarCliente
    public void alterarCliente(Clientes obj) {
               try {
            //1 passo - criar o comando sql
            String sql = "update tb_cliente set nome=?, cpf=?, email=?, telefone=?, cep=?, endereco=?, cidade=?, uf=? "
                    + "where id_cliente=?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getTelefone());
            stmt.setString(5, obj.getCep());
            stmt.setString(6, obj.getEndereco());
            stmt.setString(7, obj.getCidade());
            stmt.setString(8, obj.getUf());
            stmt.setInt(9, obj.getId_cliente());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

        
        
        
    }

    /*Metodo ExcluirCliente (antigo)
    public void excluirCliente(Clientes obj) {
        
        try {
            //1 passo - Criar o comando sql
            String sql = "delete from tb_cliente where id_cliente = ?";
            
            
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId_cliente());
            
            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }

    }*/

    // Método ExcluirCliente
    public void excluirCliente(Clientes obj) {
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este cliente?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            try {
                // 1 passo - Criar o comando sql
                String sql = "delete from tb_cliente where id_cliente = ?";

                // 2 passo - conectar o banco de dados e organizar o comando sql
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, obj.getId_cliente());

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
     
    //Metodo Listar Todos os Clientes
    public List<Clientes> listarClientes() {
        try {

            //1 passo criar a lista
            List<Clientes> lista = new ArrayList<>();

            //2 passo - criar o sql
            String sql = "select * from tb_cliente order by nome";
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Clientes obj = new Clientes();

                obj.setId_cliente(rs.getInt("id_cliente"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
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
        public List<Clientes> BuscaClientePorNome(String nome) {
        try {

            //1 passo criar a lista
            List<Clientes> lista = new ArrayList<>();

            //2 passo - criar o sql
            String sql = "select * from tb_cliente where nome like ? order by nome";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,nome);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Clientes obj = new Clientes();

                obj.setId_cliente(rs.getInt("id_cliente"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
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
