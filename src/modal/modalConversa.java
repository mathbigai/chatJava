/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

import java.sql.Timestamp;

/**
 *
 * @author User
 */
public class modalConversa {

    private int id;
    private int usuarioId1;
    private int usuarioId2;
    private String mensagem;
    private Timestamp dataHora;

    /**
     * @return the usuarioId1
     */
    public int getUsuarioId1() {
        return usuarioId1;
    }

    /**
     * @param usuarioId1 the usuarioId1 to set
     */
    public void setUsuarioId1(int usuarioId1) {
        this.usuarioId1 = usuarioId1;
    }

    /**
     * @return the usuarioId2
     */
    public int getUsuarioId2() {
        return usuarioId2;
    }

    /**
     * @param usuarioId2 the usuarioId2 to set
     */
    public void setUsuarioId2(int usuarioId2) {
        this.usuarioId2 = usuarioId2;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * @return the dataHora
     */
    public Timestamp getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
