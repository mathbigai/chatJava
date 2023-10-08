/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Conexao.conexao;

import modal.modalCadastroUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class daoCadastroUsuario {

    public void create(modalCadastroUsuario c) throws SQLException {
        Connection con = conexao.conexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO `tbl_usuario`(`usuario_nome`, `usuario_login`, "
                    + "`usuario_senha`, `usuario_ativo`, `usuario_foto`) VALUES (?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getLogin());
            stmt.setString(3, c.getSenha());
            stmt.setBoolean(4, c.isAtivo());
            stmt.setBytes(5, c.getFoto());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            System.out.println(ex);
        } finally {
            conexao.desconecta(con, stmt);
        }
    }

    public void update(modalCadastroUsuario c) throws SQLException {
        Connection con = conexao.conexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE `tbl_usuario` SET "
                    + "`usuario_nome`=?,`usuario_login`=?,`usuario_senha`=?,`usuario_foto`=? WHERE `usuario_id`=?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getLogin());
            stmt.setString(3, c.getSenha());
            stmt.setBytes(4, c.getFoto());
            stmt.setInt(5, c.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            System.out.println(ex);
        } finally {
            conexao.desconecta(con, stmt);
        }
    }

}
