/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author ariani
 */
public class ClienteDAO extends ExecuteSQL{
    
    public ClienteDAO(Connection Con){
        super(Con);
    }
    
    public String Inserir_Cliente(Cliente c){
        String sql = "INSERT INTO cliente VALUES (0,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, c.getNome());
            ps.setString(2, c.getLogin());
            ps.setString(3, c.getSenha());
            
            if(ps.executeUpdate() > 0){
                return "Cliente Cadastrado com Sucesso!";
            }else{
                return "Erro ao Cadastrar Cliente!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public List<Cliente> Listar_Cliente(){
        String sql = "SELECT codigo,nome,login,senha FROM cliente";
        List<Cliente> lista = new ArrayList<Cliente>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Cliente c = new Cliente();
                    c.setCod(rs.getInt(1));
                    c.setNome(rs.getString(2));
                    c.setLogin(rs.getString(3));
                    c.setSenha(rs.getString(4));
                    
                    lista.add(c);
                }
            return lista;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
        
    }
    
    public List<Cliente> Pesquisar_Nome_Cliente(String nome){
        String sql = "SELECT codigo, nome, login, senha FROM cliente WHERE nome LIKE '" + nome + "%'";
        List<Cliente> lista = new ArrayList<Cliente>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Cliente c = new Cliente();
                    c.setCod(rs.getInt(1));
                    c.setNome(rs.getString(2));
                    c.setLogin(rs.getString(3));
                    c.setSenha(rs.getString(4));
                    
                    lista.add(c);
                }
            return lista;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Cliente> Pesquisar_Cod_Cliente(int cod){
        String sql = "SELECT codigo, nome, login, senha FROM cliente WHERE codigo = '" + cod + "'" ;
        List<Cliente> lista = new ArrayList<Cliente>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Cliente c = new Cliente();
                    c.setCod(rs.getInt(1));
                    c.setNome(rs.getString(2));
                    c.setLogin(rs.getString(3));
                    c.setSenha(rs.getString(4));
                    
                    lista.add(c);
                }
            return lista;
            }else{
                return null;
            }
        } catch (Exception e){
            return null;
        }
    }
    

    
             public Cliente Consulta_Cliente(int cod){
        
         Cliente c = new Cliente();
         
        try {
            
            String sql = "SELECT * FROM cliente WHERE codigo =  " + cod + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            
            if(rs != null){
                while(rs.next()){
                                      
                    c.setCod(rs.getInt(1));
                    c.setNome(rs.getString(2));
                    c.setLogin(rs.getString(3));
                    c.setSenha(rs.getString(4));
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if(c.getCod() == cod){
            JOptionPane.showMessageDialog(null, "Cliente encontrado com sucesso!");
        }else{
        JOptionPane.showMessageDialog(null, "Cliente Não encontrado com sucesso!");    
        }
        return c;
    }
    
    
    
    
    public void Alterar_Cliente(Cliente c){
        String sql = "UPDATE cliente SET nome = ?, login = ?, senha = ?"
                + "WHERE codigo = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getLogin());
            ps.setString(3, c.getSenha());
            ps.setString(4, "" + c.getCod());
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null,"Cliente Atualizado com Sucesso!");
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao Atualizar o Cliente!");
            }
        } catch (Exception e) {
           e.getMessage();
        }
    }
    
    public List<Cliente> ListaComboCliente(){
        String sql = "SELECT nome FROM cliente ORDER BY nome";
        List<Cliente> lista = new ArrayList<Cliente>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Cliente c= new Cliente();
                    c.setNome(rs.getString(1));
                    lista.add(c);
                }
                return lista;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public String Excluir_Cliente(Cliente c){
        String sql = "DELETE FROM cliente WHERE codigo = ?";
    
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, c.getCod());
            
            if(ps.executeUpdate() > 0){
                return "Cliente Excluído com Sucesso!";
            }else{
                return "Erro ao Excluir!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    
    }
}