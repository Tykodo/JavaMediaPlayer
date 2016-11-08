package view;

public class PlayerFrame extends javax.swing.JFrame {

    public PlayerFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bibliothèqueLabel = new javax.swing.JLabel();
        bibliothèqueScrollPane = new javax.swing.JScrollPane();
        bibliothèqueList = new javax.swing.JList<>();
        playlistComboBox = new javax.swing.JComboBox<>();
        playlistScrollPane = new javax.swing.JScrollPane();
        playlistList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bibliothèqueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bibliothèqueLabel.setText("Bibliothèque");

        bibliothèqueScrollPane.setViewportView(bibliothèqueList);

        playlistComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ((javax.swing.JLabel)playlistComboBox.getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        playlistList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        playlistScrollPane.setViewportView(playlistList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bibliothèqueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bibliothèqueScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playlistScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(playlistComboBox, 0, 205, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bibliothèqueLabel)
                    .addComponent(playlistComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playlistScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addComponent(bibliothèqueScrollPane))
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Main Function">
    public static void main(String args[]) {
        try
            { javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel"); }
        catch ( ClassNotFoundException | InstantiationException | IllegalAccessException
                                       | javax.swing.UnsupportedLookAndFeelException ex)
        { java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); }

        java.awt.EventQueue.invokeLater(() -> {
            PlayerFrame player = new PlayerFrame();
            player.setLocationRelativeTo(null);
            player.setVisible(true);
        });
    } // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bibliothèqueLabel;
    private javax.swing.JList<String> bibliothèqueList;
    private javax.swing.JScrollPane bibliothèqueScrollPane;
    private javax.swing.JComboBox<String> playlistComboBox;
    private javax.swing.JList<String> playlistList;
    private javax.swing.JScrollPane playlistScrollPane;
    // End of variables declaration//GEN-END:variables
}
