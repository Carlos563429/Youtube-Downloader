/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src;

import java.awt.Color;

/**
 *
 * @author lenoc
 */
public class DownloaderUI extends javax.swing.JFrame {

    /**
     * Creates new form DownloaderUI
     */
    private int xMouse;
    private int yMouse;

    public DownloaderUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPane = new javax.swing.JPanel();
        headerPane = new javax.swing.JPanel();
        resizeHeaderPane = new javax.swing.JPanel();
        closePane = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        linkField = new javax.swing.JTextField();
        linkLabel = new javax.swing.JLabel();
        linkSeparator = new javax.swing.JSeparator();
        linkLabel1 = new javax.swing.JLabel();
        searchPane = new javax.swing.JPanel();
        searchLabel = new javax.swing.JLabel();
        downloadPane = new javax.swing.JPanel();
        downloadLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgroundPane.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPane.setBackground(new java.awt.Color(251, 80, 64));

        resizeHeaderPane.setBackground(new java.awt.Color(251, 80, 64));
        resizeHeaderPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        resizeHeaderPane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                resizeHeaderPaneMouseDragged(evt);
            }
        });
        resizeHeaderPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resizeHeaderPaneMousePressed(evt);
            }
        });

        closePane.setBackground(new java.awt.Color(251, 80, 64));

        closeLabel.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(255, 255, 255));
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setText("X");
        closeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout closePaneLayout = new javax.swing.GroupLayout(closePane);
        closePane.setLayout(closePaneLayout);
        closePaneLayout.setHorizontalGroup(
            closePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );
        closePaneLayout.setVerticalGroup(
            closePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout resizeHeaderPaneLayout = new javax.swing.GroupLayout(resizeHeaderPane);
        resizeHeaderPane.setLayout(resizeHeaderPaneLayout);
        resizeHeaderPaneLayout.setHorizontalGroup(
            resizeHeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resizeHeaderPaneLayout.createSequentialGroup()
                .addGap(0, 531, Short.MAX_VALUE)
                .addComponent(closePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        resizeHeaderPaneLayout.setVerticalGroup(
            resizeHeaderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resizeHeaderPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Youtube Downloader");

        javax.swing.GroupLayout headerPaneLayout = new javax.swing.GroupLayout(headerPane);
        headerPane.setLayout(headerPaneLayout);
        headerPaneLayout.setHorizontalGroup(
            headerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPaneLayout.createSequentialGroup()
                .addGroup(headerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resizeHeaderPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerPaneLayout.setVerticalGroup(
            headerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPaneLayout.createSequentialGroup()
                .addComponent(resizeHeaderPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        backgroundPane.add(headerPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        linkField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        linkField.setForeground(new java.awt.Color(204, 204, 204));
        linkField.setText("Paste HERE.");
        linkField.setBorder(null);
        linkField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                linkFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                linkFieldFocusLost(evt);
            }
        });
        backgroundPane.add(linkField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 500, 40));

        linkLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        linkLabel.setText("Link:");
        backgroundPane.add(linkLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        backgroundPane.add(linkSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 500, -1));

        linkLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        linkLabel1.setText("Path:");
        backgroundPane.add(linkLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        searchPane.setBackground(new java.awt.Color(251, 80, 64));

        searchLabel.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchLabel.setText("Search...");
        searchLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout searchPaneLayout = new javax.swing.GroupLayout(searchPane);
        searchPane.setLayout(searchPaneLayout);
        searchPaneLayout.setHorizontalGroup(
            searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        searchPaneLayout.setVerticalGroup(
            searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        backgroundPane.add(searchPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 160, 30));

        downloadPane.setBackground(new java.awt.Color(251, 80, 64));

        downloadLabel.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        downloadLabel.setForeground(new java.awt.Color(255, 255, 255));
        downloadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        downloadLabel.setText("Download");
        downloadLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        downloadLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                downloadLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                downloadLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout downloadPaneLayout = new javax.swing.GroupLayout(downloadPane);
        downloadPane.setLayout(downloadPaneLayout);
        downloadPaneLayout.setHorizontalGroup(
            downloadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(downloadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        downloadPaneLayout.setVerticalGroup(
            downloadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(downloadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        backgroundPane.add(downloadPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseEntered
        closePane.setBackground(new Color(255, 205, 197));
        //Default Color (251, 80, 64)
    }//GEN-LAST:event_closeLabelMouseEntered

    private void closeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseExited
        closePane.setBackground(new Color(251, 80, 64));
    }//GEN-LAST:event_closeLabelMouseExited

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void resizeHeaderPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resizeHeaderPaneMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_resizeHeaderPaneMousePressed

    private void resizeHeaderPaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resizeHeaderPaneMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_resizeHeaderPaneMouseDragged

    private void linkFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linkFieldFocusGained

        if (linkField.getText().equals("Paste HERE.")) {
            linkField.setText("");
        }

    }//GEN-LAST:event_linkFieldFocusGained

    private void linkFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_linkFieldFocusLost
        if (linkField.getText().equals("")) {
            linkField.setText("Paste HERE.");
        }
    }//GEN-LAST:event_linkFieldFocusLost

    private void searchLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseEntered
        searchPane.setBackground(new Color(255, 205, 197));
    }//GEN-LAST:event_searchLabelMouseEntered

    private void searchLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseExited
        searchPane.setBackground(new Color(251, 80, 64));
    }//GEN-LAST:event_searchLabelMouseExited

    private void downloadLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downloadLabelMouseExited
        downloadPane.setBackground(new Color(251,80,64));
    }//GEN-LAST:event_downloadLabelMouseExited

    private void downloadLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downloadLabelMouseEntered
        downloadPane.setBackground(new Color(255, 205, 197));
    }//GEN-LAST:event_downloadLabelMouseEntered

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
            java.util.logging.Logger.getLogger(DownloaderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DownloaderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DownloaderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DownloaderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DownloaderUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPane;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel closePane;
    private javax.swing.JLabel downloadLabel;
    private javax.swing.JPanel downloadPane;
    private javax.swing.JPanel headerPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField linkField;
    private javax.swing.JLabel linkLabel;
    private javax.swing.JLabel linkLabel1;
    private javax.swing.JSeparator linkSeparator;
    private javax.swing.JPanel resizeHeaderPane;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JPanel searchPane;
    // End of variables declaration//GEN-END:variables
}
