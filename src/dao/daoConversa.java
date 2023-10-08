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
import modal.modalConversa;

/**
 *
 * @author User
 */
public class daoConversa {

    public void createConversa(modalConversa c) throws SQLException {
        Connection con = conexao.conexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tbl_conversa "
                    + "(USUARIO_ID_1, USUARIO_ID_2, MENSAGEM, DATA_HORA) VALUES (?, ?, ?, ?)");
            stmt.setInt(1, c.getUsuarioId1());
            stmt.setInt(2, c.getUsuarioId2());
            stmt.setString(3, c.getMensagem());
            stmt.setTimestamp(4, c.getDataHora());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar a conversa: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar o statement: " + ex.getMessage());
                }
            }
        }
    }

    public void upgradeConversa(modalConversa c) throws SQLException {
        Connection con = conexao.conexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tbl_conversa SET mensagem = IFNULL(CONCAT(mensagem, ?), mensagem) WHERE conversa_id = ?;");
            stmt.setString(1, c.getMensagem());
            stmt.setInt(2, c.getId());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar a conversa: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar o statement: " + ex.getMessage());
                }
            }
        }
    }

}
