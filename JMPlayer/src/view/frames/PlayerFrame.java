package view.frames;

public class PlayerFrame extends javax.swing.JFrame {

    public PlayerFrame() {
        initComponents();
        playButton.requestFocusInWindow();
    }

    // <editor-fold defaultstate="collapsed" desc="Initialization function">
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        libraryLabel = new javax.swing.JLabel();
        libraryScrollPane = new javax.swing.JScrollPane();
        libraryList = new javax.swing.JList<>();
        playlistComboBox = new javax.swing.JComboBox<>();
        playlistScrollPane = new javax.swing.JScrollPane();
        playlistList = new javax.swing.JList<>();
        playerPanel = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        randomButton = new javax.swing.JButton();
        loopButton = new javax.swing.JButton();
        syncButton = new javax.swing.JButton();
        paramsButton = new javax.swing.JButton();
        coverLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        tagsLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        importPLaylistButton = new javax.swing.JMenuItem();
        exportPlaylistButton = new javax.swing.JMenuItem();
        fileSeparator1 = new javax.swing.JPopupMenu.Separator();
        addButton = new javax.swing.JMenuItem();
        fileSeparator2 = new javax.swing.JPopupMenu.Separator();
        exitButton = new javax.swing.JMenuItem();
        optionsMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        supportButton = new javax.swing.JMenuItem();
        helpSeparator1 = new javax.swing.JPopupMenu.Separator();
        extensionsButton = new javax.swing.JMenuItem();
        helpSeparator2 = new javax.swing.JPopupMenu.Separator();
        aboutButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(432, 454));
        setResizable(false);

        libraryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        libraryLabel.setText("Library");

        libraryScrollPane.setViewportView(libraryList);

        playlistComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));
        playlistComboBox.setMaximumSize(new java.awt.Dimension(0, 0));
        playlistComboBox.setMinimumSize(new java.awt.Dimension(0, 0));
        ((javax.swing.JLabel)playlistComboBox.getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        playlistList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        playlistList.setMaximumSize(new java.awt.Dimension(0, 0));
        playlistList.setMinimumSize(new java.awt.Dimension(0, 0));
        playlistList.setPreferredSize(new java.awt.Dimension(0, 0));
        playlistScrollPane.setViewportView(playlistList);

        playerPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        playerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/play.png"))); // NOI18N
        playButton.setBorderPainted(false);
        playButton.setContentAreaFilled(false);
        playButton.setFocusPainted(false);
        playerPanel.add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 0, 64, 64));

        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/next.png"))); // NOI18N
        nextButton.setBorderPainted(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setFocusPainted(false);
        playerPanel.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 0, 64, 64));

        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/previous.png"))); // NOI18N
        previousButton.setBorderPainted(false);
        previousButton.setContentAreaFilled(false);
        previousButton.setFocusPainted(false);
        playerPanel.add(previousButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 64, 64));

        randomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/random_off.png"))); // NOI18N
        randomButton.setBorderPainted(false);
        randomButton.setContentAreaFilled(false);
        randomButton.setFocusPainted(false);
        randomButton.setMaximumSize(new java.awt.Dimension(32, 32));
        randomButton.setMinimumSize(new java.awt.Dimension(32, 32));
        randomButton.setPreferredSize(new java.awt.Dimension(32, 32));
        playerPanel.add(randomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 30, 30));

        loopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/loop_on.png"))); // NOI18N
        loopButton.setBorderPainted(false);
        loopButton.setContentAreaFilled(false);
        loopButton.setFocusPainted(false);
        loopButton.setMaximumSize(new java.awt.Dimension(32, 32));
        loopButton.setMinimumSize(new java.awt.Dimension(32, 32));
        loopButton.setPreferredSize(new java.awt.Dimension(32, 32));
        playerPanel.add(loopButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 30, 30));

        syncButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/sync.png"))); // NOI18N
        syncButton.setBorderPainted(false);
        syncButton.setContentAreaFilled(false);
        syncButton.setFocusPainted(false);
        syncButton.setMaximumSize(new java.awt.Dimension(32, 32));
        syncButton.setMinimumSize(new java.awt.Dimension(32, 32));
        syncButton.setPreferredSize(new java.awt.Dimension(32, 32));
        playerPanel.add(syncButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 30, 30));

        paramsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/params.png"))); // NOI18N
        paramsButton.setBorderPainted(false);
        paramsButton.setContentAreaFilled(false);
        paramsButton.setFocusPainted(false);
        paramsButton.setMaximumSize(new java.awt.Dimension(32, 32));
        paramsButton.setMinimumSize(new java.awt.Dimension(32, 32));
        paramsButton.setPreferredSize(new java.awt.Dimension(32, 32));
        playerPanel.add(paramsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 30, 30));

        coverLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/cover.png"))); // NOI18N
        coverLabel.setToolTipText("");
        coverLabel.setFocusable(false);

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        titleLabel.setText(" ");

        tagsLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        tagsLabel.setText(" ");

        fileMenu.setText("File");

        importPLaylistButton.setText("Import playlist");
        fileMenu.add(importPLaylistButton);

        exportPlaylistButton.setText("Export playlist");
        fileMenu.add(exportPlaylistButton);
        fileMenu.add(fileSeparator1);

        addButton.setText("Add to the library...");
        fileMenu.add(addButton);
        fileMenu.add(fileSeparator2);

        exitButton.setText("Exit");
        fileMenu.add(exitButton);

        menuBar.add(fileMenu);

        optionsMenu.setText("Options");
        menuBar.add(optionsMenu);

        helpMenu.setText("Help");

        supportButton.setText("Support");
        helpMenu.add(supportButton);
        helpMenu.add(helpSeparator1);

        extensionsButton.setText("Extensions");
        helpMenu.add(extensionsButton);
        helpMenu.add(helpSeparator2);

        aboutButton.setText("About");
        helpMenu.add(aboutButton);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(libraryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(libraryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(playlistScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playlistComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 204, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(coverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tagsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(libraryLabel)
                    .addComponent(playlistComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(libraryScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(playlistScrollPane))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(coverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(2, 2, 2)
                        .addComponent(tagsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Main Function">
    public static void main(String args[]) {
        java.util.Properties props = new java.util.Properties();
        props.put("logoString", "");
        
        com.jtattoo.plaf.noire.NoireLookAndFeel.setCurrentTheme(props);
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
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Variables declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutButton;
    private javax.swing.JMenuItem addButton;
    private javax.swing.JLabel coverLabel;
    private javax.swing.JMenuItem exitButton;
    private javax.swing.JMenuItem exportPlaylistButton;
    private javax.swing.JMenuItem extensionsButton;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPopupMenu.Separator fileSeparator1;
    private javax.swing.JPopupMenu.Separator fileSeparator2;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPopupMenu.Separator helpSeparator1;
    private javax.swing.JPopupMenu.Separator helpSeparator2;
    private javax.swing.JMenuItem importPLaylistButton;
    private javax.swing.JLabel libraryLabel;
    private javax.swing.JList<String> libraryList;
    private javax.swing.JScrollPane libraryScrollPane;
    private javax.swing.JButton loopButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton nextButton;
    private javax.swing.JMenu optionsMenu;
    private javax.swing.JButton paramsButton;
    private javax.swing.JButton playButton;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JComboBox<String> playlistComboBox;
    private javax.swing.JList<String> playlistList;
    private javax.swing.JScrollPane playlistScrollPane;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton randomButton;
    private javax.swing.JMenuItem supportButton;
    private javax.swing.JButton syncButton;
    private javax.swing.JLabel tagsLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>

}
