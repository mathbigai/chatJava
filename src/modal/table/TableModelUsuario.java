/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal.table;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modal.modalCadastroUsuario;

/**
 *
 * @author Matheus
 */
public class TableModelUsuario extends AbstractTableModel {

    public List<modalCadastroUsuario> dados = new ArrayList<>();
    private String[] colunas = {"ID", "Nome", "Login"};

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getId();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getLogin();
        }
        return null;
    }
    
     @Override
    public Class getColumnClass(int column) {
        switch (column) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Boolean.class;
        }
        return null;
    }

    public void addRow(modalCadastroUsuario q) {
        this.dados.add(q);
        this.fireTableDataChanged();
    }

}
