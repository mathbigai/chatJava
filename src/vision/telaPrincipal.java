/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vision;

import Conexao.conexao;
import dao.daoConversa;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import modal.modalConversa;
import vision.cadastro.telaCadastroUsuario;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.BorderFactory;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class telaPrincipal extends javax.swing.JFrame {

    conexao conn = new conexao();
    modalConversa mConversa = new modalConversa();
    daoConversa dConversa = new daoConversa();
    Map<String, String> usuarioNomes = new HashMap<>();
    int idConversa = 0;
    String nomeUsuario, nomeUsuarioSelecionado, mensagem;
    private int lastSelectedIndex = -1;

    /**
     * Creates new form telaPrincipal
     *
     * @param idUsuario
     * @param nomeUsuario
     */
    public telaPrincipal(int idUsuario, String nomeUsuario) {
        initComponents();

        try {
            adicionaBotoesUsuarios(idUsuario);
        } catch (IOException ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.nomeUsuario = nomeUsuario;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGeral = new javax.swing.JPanel();
        jPanelDisponiveis = new javax.swing.JPanel();
        jPanelConversa = new javax.swing.JPanel();
        jLabelConversa = new javax.swing.JLabel();
        jLabelUsuarioConversa = new javax.swing.JLabel();
        jTextFieldMensagem = new javax.swing.JTextField();
        jButtonEnviarMensagem = new javax.swing.JButton();
        jMenuBarGeral = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversa IF");

        jPanelDisponiveis.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelDisponiveisLayout = new javax.swing.GroupLayout(jPanelDisponiveis);
        jPanelDisponiveis.setLayout(jPanelDisponiveisLayout);
        jPanelDisponiveisLayout.setHorizontalGroup(
            jPanelDisponiveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanelDisponiveisLayout.setVerticalGroup(
            jPanelDisponiveisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        jPanelConversa.setBorder(javax.swing.BorderFactory.createTitledBorder("Conversa"));

        jLabelConversa.setBackground(new java.awt.Color(255, 255, 255));
        jLabelConversa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConversa.setText("Selecione uma Conversa");

        javax.swing.GroupLayout jPanelConversaLayout = new javax.swing.GroupLayout(jPanelConversa);
        jPanelConversa.setLayout(jPanelConversaLayout);
        jPanelConversaLayout.setHorizontalGroup(
            jPanelConversaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelConversa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelConversaLayout.setVerticalGroup(
            jPanelConversaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConversaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelConversa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        jLabelUsuarioConversa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelUsuarioConversa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jTextFieldMensagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMensagemKeyPressed(evt);
            }
        });

        jButtonEnviarMensagem.setText("Enviar");
        jButtonEnviarMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarMensagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGeralLayout = new javax.swing.GroupLayout(jPanelGeral);
        jPanelGeral.setLayout(jPanelGeralLayout);
        jPanelGeralLayout.setHorizontalGroup(
            jPanelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeralLayout.createSequentialGroup()
                .addComponent(jPanelDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelConversa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelGeralLayout.createSequentialGroup()
                        .addGroup(jPanelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGeralLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextFieldMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEnviarMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                            .addComponent(jLabelUsuarioConversa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanelGeralLayout.setVerticalGroup(
            jPanelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDisponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuarioConversa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConversa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEnviarMensagem))
                .addContainerGap())
        );

        jMenuCadastro.setText("Cadastro");

        jMenuItemUsuario.setText("Usuario");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemUsuario);

        jMenuBarGeral.add(jMenuCadastro);

        setJMenuBar(jMenuBarGeral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
        telaCadastroUsuario telaCadastroUsuario1 = new telaCadastroUsuario();
        telaCadastroUsuario1.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed

    private void jButtonEnviarMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarMensagemActionPerformed
        mandarMensagem();
    }//GEN-LAST:event_jButtonEnviarMensagemActionPerformed

    private void jTextFieldMensagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMensagemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            mandarMensagem();
        }
    }//GEN-LAST:event_jTextFieldMensagemKeyPressed

    private void adicionaBotoesUsuarios(int idUsuario) throws IOException {
        // Configura o layout vertical.
        jPanelDisponiveis.setLayout(new BoxLayout(jPanelDisponiveis, BoxLayout.Y_AXIS));

        List<JButton> buttons = new ArrayList<>();
        conn.executaSQL("SELECT USUARIO_ID, USUARIO_NOME, USUARIO_FOTO FROM TBL_USUARIO WHERE USUARIO_ID <> " + idUsuario);

        try {
            while (conn.rs.next()) {

                String nome = conn.rs.getString("USUARIO_NOME");
                String id = conn.rs.getString("USUARIO_ID");
                String nomeTotal = id + " - " + nome;
                BufferedImage imagem = null; // Inicialize com null

                if (conn.rs.getBytes("usuario_foto") != null && conn.rs.getBytes("usuario_foto").length > 0) {
                    byte[] imagemBytes = conn.rs.getBytes("usuario_foto");
                    ByteArrayInputStream bais = new ByteArrayInputStream(imagemBytes);
                    imagem = ImageIO.read(bais);
                }

                // Cria o botão
                JButton button = new JButton(nomeTotal);
                button.setPreferredSize(new Dimension(200, 50));

                // Configura o estilo do botão
                button.setBackground(new Color(37, 211, 102)); // Verde do WhatsApp
                button.setForeground(Color.WHITE);

                // Fonte do texto
                Font font = new Font("Arial", Font.BOLD, 14);
                button.setFont(font);

                // Borda arredondada
                button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
                button.setFocusPainted(false); // Remove o contorno de foco
                // Define um ícone da imagem do usuário (se disponível)
                if (imagem != null) {
                    Image scaledImage = imagem.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                    button.setIcon(new ImageIcon(scaledImage));
                }

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton clickedButton = (JButton) e.getSource();
                        String buttonText = clickedButton.getText();
                        String[] partes = buttonText.split("-");

                        if (partes.length >= 2) {
                            String nome = partes[1].trim();

                            jLabelUsuarioConversa.setText(buttonText);
                            nomeUsuarioSelecionado = nome;
                            conversa(buttonText, String.valueOf(idUsuario));
                        }
                    }
                });

                buttons.add(button);
                usuarioNomes.put(id, nome);
            }
            jLabelUsuarioConversa.setText(buttons.get(0).getText());
            for (JButton button : buttons) {
                jPanelDisponiveis.add(button);
            }

            jPanelDisponiveis.setVisible(true);
            jPanelDisponiveis.revalidate(); // Use revalidate() em vez de repaint() para atualizar o layout.
            conn.rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
// Função para redimensionar uma imagem

    private void conversa(String usuario, String idUsuario) {
        System.out.println(idUsuario);
        String[] partes = usuario.split("-");
        String idUsuarioSelecionado = partes[0].trim();
        conn.executaSQL("SELECT MENSAGEM, CONVERSA_ID FROM TBL_CONVERSA WHERE (USUARIO_ID_1 = " + idUsuario + " AND USUARIO_ID_2 = " + idUsuarioSelecionado + ") OR (USUARIO_ID_1 = " + idUsuarioSelecionado + " AND USUARIO_ID_2 = " + idUsuario + ");");

        try {
            if (conn.rs.next()) {
                mensagem = conn.rs.getString("MENSAGEM");
                idConversa = conn.rs.getInt("CONVERSA_ID");
                if (mensagem.isEmpty()) {
                    trataConvera("");
                } else {
                    trataConvera(mensagem);

                }

            } else {
                mConversa.setUsuarioId1(Integer.parseInt(idUsuario));
                mConversa.setUsuarioId2(Integer.parseInt(idUsuarioSelecionado));
                mConversa.setMensagem("");
                dConversa.createConversa(mConversa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void trataConvera(String conversa) {
        List<String> mensagens = extrairMensagem(conversa);
        usuarioNomes.put("1", "<html><b>" + nomeUsuario + "</b>");
        usuarioNomes.put("2", "<html><b>" + nomeUsuarioSelecionado + "</b>");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat titleFormat = new SimpleDateFormat("d 'de' MMMM", new Locale("pt", "BR"));

        JPanel panelMensagens = new JPanel();
        panelMensagens.setLayout(new BoxLayout(panelMensagens, BoxLayout.Y_AXIS));

        if (mensagens.isEmpty()) {
            jPanelConversa.removeAll();
            jPanelConversa.setLayout(new BorderLayout());
            JLabel labelVazio = new JLabel("A conversa está vazia.");
            labelVazio.setHorizontalAlignment(SwingConstants.CENTER);
            jPanelConversa.add(labelVazio, BorderLayout.CENTER);
            revalidate(); // Atualiza o layout da janela
            repaint(); // Repinta a janela
            setVisible(true);
        } else {
            String dataAnterior = null;
            for (String mensagem : mensagens) {
                String dataMensagem = extrairDataMensagem(mensagem);
                try {
                    Date dateM = dateFormat.parse(dataMensagem);
                    String tituloDia = titleFormat.format(dateM);
                    String horaMinutos = new SimpleDateFormat("HH:mm").format(dateM); // Formata apenas a hora e os minutos

                    if (!Objects.equals(dataAnterior, tituloDia)) {
                        JLabel labelTitulo = new JLabel("<html><div style='text-align: center; font-weight: bold;'>" + tituloDia + "</div></html>");
                        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER); // Configura o alinhamento horizontal para centralizar
                        panelMensagens.add(labelTitulo);

                        dataAnterior = tituloDia;
                    }

                    String nomeRemetente = extrairNomeRemetente(mensagem);
                    String soMensagens = extrairMensagens(mensagem);
                    String mensagemFormatada = mensagem;
                    if (nomeRemetente != null) {
                        String cssStyle = "<style>"
                                + ".chat-message { display: flex; flex-direction: column; margin: 8px; }"
                                + ".chat-name { font-weight: bold; margin-bottom: 4px; }"
                                + ".chat-text { background-color: #DCF8C6; padding: 8px; border-radius: 8px; margin-bottom: 4px;width: 200px;overflow-y: auto;  }"
                                + ".chat-time { font-size: 10px; color: #999; }"
                                + "</style>";

                        // Adicione o estilo CSS ao seu JLabel
                        mensagemFormatada = "<html>" + cssStyle + "<div class='chat-message'>"
                                + "<div class='chat-name'>" + nomeRemetente + "</div>"
                                + "<div class='chat-text'>" + soMensagens + "</div>"
                                + "<div class='chat-time'>" + horaMinutos + "</div>"
                                + "</div></html>";
                    }
                    JLabel label = new JLabel(mensagemFormatada);
                    label.setBackground(Color.LIGHT_GRAY);
                    label.setOpaque(true);

                    if (nomeRemetente != null && nomeRemetente.equals(usuarioNomes.get("1"))) {
                        label.setHorizontalAlignment(SwingConstants.RIGHT);
                        label.setForeground(Color.DARK_GRAY);
                    } else if (nomeRemetente != null && nomeRemetente.equals(usuarioNomes.get("2"))) {
                        label.setHorizontalAlignment(SwingConstants.LEFT);
                        label.setForeground(Color.DARK_GRAY);
                    }
                    panelMensagens.add(label);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

            JScrollPane scrollPane = new JScrollPane(panelMensagens);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

            jPanelConversa.removeAll();
            jPanelConversa.setLayout(new BorderLayout());
            jPanelConversa.add(scrollPane, BorderLayout.CENTER);

            // Deixa o ScrollBar no máximo para baixo
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
                    verticalScrollBar.setValue(verticalScrollBar.getMaximum());
                    scrollPane.revalidate();
                    scrollPane.repaint();
                }
            });
            // FIM
            revalidate(); // Atualiza o layout da janela
            repaint(); // Repinta a janela
            setVisible(true);
        }
    }

    private String extrairMensagens(String conversa) {
        StringBuilder mensagens = new StringBuilder();

        Pattern pattern = Pattern.compile("<b>.*?</b>:<br>(.*?)<br>\\(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\)", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(conversa);

        while (matcher.find()) {
            String mensagem = matcher.group(1).trim();
            mensagens.append(mensagem).append("\n"); // Adiciona a mensagem ao StringBuilder
        }

        return mensagens.toString();
    }

    private String extrairNomeRemetente(String mensagem) {
        // Use uma expressão regular para extrair o nome do remetente
        // A expressão regular assume que o nome do remetente é seguido por ":" na mensagem.
        Pattern pattern = Pattern.compile("<b>(.*?)</b>:");
        Matcher matcher = pattern.matcher(mensagem);

        if (matcher.find()) {
            // O grupo 1 da expressão regular contém o nome do remetente
            return "<html><b>" + matcher.group(1).trim() + "</b>";
        }

        // Retorna null se não for possível extrair o nome do remetente.
        return null;
    }

    private String extrairDataMensagem(String mensagem) {
        Pattern pattern = Pattern.compile("\\((.*?)\\)");
        Matcher matcher = pattern.matcher(mensagem);

        if (matcher.find()) {
            // O grupo 1 da expressão regular contém a data
            return matcher.group(1);

        } else {
            System.out.println("Data não encontrada na mensagem.");
        }
        return null;
    }

    private List<String> extrairMensagem(String conversa) {
        String dataResumida;
        List<String> mensagens = new ArrayList<>();

        // Use uma expressão regular para encontrar mensagens na string com nomes de remetentes e timestamps
        Pattern pattern = Pattern.compile("([A-Za-z ]+): (.*?)(?: (\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}))?$", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(conversa);

        while (matcher.find()) {
            String nomeRemetente = matcher.group(1);
            String mensagem = matcher.group(2);
            String data = matcher.group(3); // Captura o timestamp se existir
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("d 'de' MMMM", new Locale("pt", "BR"));
            try {
                Date parsedDate = dateFormat.parse(data);
                dataResumida = dateFormat2.format(parsedDate);

            } catch (ParseException ex) {
                Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Substitua o nome do remetente pelo nome do usuário correspondente
            if (usuarioNomes.containsKey(nomeRemetente)) {

                mensagem = mensagem.replace(nomeRemetente + ":", usuarioNomes.get(nomeRemetente) + ":");
            }

            mensagens.add("<html><b>" + nomeRemetente + "</b>:<br>" + mensagem + "<br>(" + data + ")");

        }
        return mensagens;
    }

    private void mandarMensagem() {
        if (jTextFieldMensagem.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo mensagem não pode ser em branco");
        } else {
            // Obtenha a data e hora atual
            LocalDateTime now = LocalDateTime.now();

            // Defina um formato desejado para a data e hora
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            // Formate a data e hora de acordo com o formato
            String formattedDateTime = now.format(formatter);
            mConversa.setId(idConversa);
            mConversa.setMensagem(nomeUsuario + ": " + jTextFieldMensagem.getText() + " " + formattedDateTime + "\n");
            try {
                dConversa.upgradeConversa(mConversa);
                mensagem += mConversa.getMensagem();
                trataConvera(mensagem);
                jTextFieldMensagem.setText("");
            } catch (SQLException ex) {

                Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal(0, "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviarMensagem;
    private javax.swing.JLabel jLabelConversa;
    private javax.swing.JLabel jLabelUsuarioConversa;
    private javax.swing.JMenuBar jMenuBarGeral;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JPanel jPanelConversa;
    private javax.swing.JPanel jPanelDisponiveis;
    private javax.swing.JPanel jPanelGeral;
    private javax.swing.JTextField jTextFieldMensagem;
    // End of variables declaration//GEN-END:variables

}