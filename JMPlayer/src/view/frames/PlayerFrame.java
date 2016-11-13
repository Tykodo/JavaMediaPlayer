package view.frames;

import javax.swing.JOptionPane;

public class PlayerFrame extends javax.swing.JFrame implements Runnable {

    private final model.Model model;
    private final controller.PlayerController controller;

    public PlayerFrame() {
        model = new model.Model();
        controller = new controller.PlayerController(this, model);

        initComponents();
        playButton.requestFocusInWindow();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        llibraryPopup = new javax.swing.JPopupMenu();
        addToPlaylistMenu = new javax.swing.JMenuItem();
        libraryPopupSeparator1 = new javax.swing.JPopupMenu.Separator();
        addToLibraryMenu = new javax.swing.JMenuItem();
        removeFromLibraryMenu = new javax.swing.JMenuItem();
        libraryPopupSeparator2 = new javax.swing.JPopupMenu.Separator();
        sortLibraryMenu = new javax.swing.JMenuItem();
        playlistPopup = new javax.swing.JPopupMenu();
        removeFromPlaylistMenu = new javax.swing.JMenuItem();
        removePlaylistMenu = new javax.swing.JMenuItem();
        playlistPopupSeparator = new javax.swing.JPopupMenu.Separator();
        sortPlaylistMenu = new javax.swing.JMenuItem();
        libraryLabel = new javax.swing.JLabel();
        libraryScrollPane = new javax.swing.JScrollPane();
        libraryList = new javax.swing.JList<>();
        playlistComboBox = new javax.swing.JComboBox<>(model.getPlaylistsModel());
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
        fileMenuSeparator1 = new javax.swing.JPopupMenu.Separator();
        addToLibraryButton = new javax.swing.JMenuItem();
        createPlaylistButton = new javax.swing.JMenuItem();
        fileMenuSeparator2 = new javax.swing.JPopupMenu.Separator();
        exitButton = new javax.swing.JMenuItem();
        optionsMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        supportButton = new javax.swing.JMenuItem();
        helpSeparator1 = new javax.swing.JPopupMenu.Separator();
        extensionsButton = new javax.swing.JMenuItem();
        helpSeparator2 = new javax.swing.JPopupMenu.Separator();
        aboutButton = new javax.swing.JMenuItem();

        llibraryPopup.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        addToPlaylistMenu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        addToPlaylistMenu.setText("Add to playlist");
        addToPlaylistMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToPlaylistMenuActionPerformed(evt);
            }
        });
        llibraryPopup.add(addToPlaylistMenu);
        llibraryPopup.add(libraryPopupSeparator1);

        addToLibraryMenu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        addToLibraryMenu.setText("Import samples");
        addToLibraryMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToLibraryMenuActionPerformed(evt);
            }
        });
        llibraryPopup.add(addToLibraryMenu);

        removeFromLibraryMenu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        removeFromLibraryMenu.setText("Remove samples");
        removeFromLibraryMenu.setToolTipText("");
        removeFromLibraryMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromLibraryMenuActionPerformed(evt);
            }
        });
        llibraryPopup.add(removeFromLibraryMenu);
        llibraryPopup.add(libraryPopupSeparator2);

        sortLibraryMenu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sortLibraryMenu.setText("Sort samples");
        sortLibraryMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortLibraryMenuActionPerformed(evt);
            }
        });
        llibraryPopup.add(sortLibraryMenu);

        playlistPopup.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        removeFromPlaylistMenu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        removeFromPlaylistMenu.setText("Remove samples");
        removeFromPlaylistMenu.setToolTipText("");
        removeFromPlaylistMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromPlaylistMenuActionPerformed(evt);
            }
        });
        playlistPopup.add(removeFromPlaylistMenu);

        removePlaylistMenu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        removePlaylistMenu.setText("Remove");
        removePlaylistMenu.setToolTipText("");
        removePlaylistMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlaylistMenuActionPerformed(evt);
            }
        });
        playlistPopup.add(removePlaylistMenu);
        playlistPopup.add(playlistPopupSeparator);

        sortPlaylistMenu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sortPlaylistMenu.setText("Sort samples");
        sortPlaylistMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortPlaylistMenuActionPerformed(evt);
            }
        });
        playlistPopup.add(sortPlaylistMenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaMediaPlayer");
        setMinimumSize(new java.awt.Dimension(432, 454));
        setName("PlayerFrame"); // NOI18N
        setResizable(false);

        libraryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        libraryLabel.setText("Library");

        libraryList.setComponentPopupMenu(llibraryPopup);
        libraryList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        libraryList.setDropMode(javax.swing.DropMode.INSERT);
        libraryScrollPane.setViewportView(libraryList);
        libraryList.setListData(model.getLibraryModel());

        playlistComboBox.setMaximumSize(new java.awt.Dimension(0, 0));
        playlistComboBox.setMinimumSize(new java.awt.Dimension(0, 0));
        ((javax.swing.JLabel)playlistComboBox.getRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playlistComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlistComboBoxActionPerformed(evt);
            }
        });

        playlistList.setComponentPopupMenu(playlistPopup);
        playlistList.setDropMode(javax.swing.DropMode.INSERT);
        playlistList.setMaximumSize(new java.awt.Dimension(0, 0));
        playlistList.setMinimumSize(new java.awt.Dimension(0, 0));
        playlistList.setPreferredSize(new java.awt.Dimension(0, 0));
        playlistScrollPane.setViewportView(playlistList);
        playlistList.setListData(model.getPlaylistModel(playlistComboBox.getSelectedIndex()));

        playerPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        playerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/play.png"))); // NOI18N
        playButton.setToolTipText("Play");
        playButton.setBorderPainted(false);
        playButton.setContentAreaFilled(false);
        playButton.setFocusPainted(false);
        playerPanel.add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 0, 64, 64));
        playButton.getAccessibleContext().setAccessibleDescription("");

        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/next.png"))); // NOI18N
        nextButton.setToolTipText("Next");
        nextButton.setBorderPainted(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setFocusPainted(false);
        playerPanel.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 0, 64, 64));

        previousButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/previous.png"))); // NOI18N
        previousButton.setToolTipText("Previous");
        previousButton.setBorderPainted(false);
        previousButton.setContentAreaFilled(false);
        previousButton.setFocusPainted(false);
        playerPanel.add(previousButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 64, 64));

        randomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/random_off.png"))); // NOI18N
        randomButton.setToolTipText("Random");
        randomButton.setBorderPainted(false);
        randomButton.setContentAreaFilled(false);
        randomButton.setFocusPainted(false);
        randomButton.setMaximumSize(new java.awt.Dimension(32, 32));
        randomButton.setMinimumSize(new java.awt.Dimension(32, 32));
        randomButton.setPreferredSize(new java.awt.Dimension(32, 32));
        playerPanel.add(randomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 30, 30));

        loopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/loop_on.png"))); // NOI18N
        loopButton.setToolTipText("Loop");
        loopButton.setBorderPainted(false);
        loopButton.setContentAreaFilled(false);
        loopButton.setFocusPainted(false);
        loopButton.setMaximumSize(new java.awt.Dimension(32, 32));
        loopButton.setMinimumSize(new java.awt.Dimension(32, 32));
        loopButton.setPreferredSize(new java.awt.Dimension(32, 32));
        playerPanel.add(loopButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 30, 30));

        syncButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/sync.png"))); // NOI18N
        syncButton.setToolTipText("Synchronize");
        syncButton.setBorderPainted(false);
        syncButton.setContentAreaFilled(false);
        syncButton.setFocusPainted(false);
        syncButton.setMaximumSize(new java.awt.Dimension(32, 32));
        syncButton.setMinimumSize(new java.awt.Dimension(32, 32));
        syncButton.setPreferredSize(new java.awt.Dimension(32, 32));
        playerPanel.add(syncButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 30, 30));

        paramsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/params.png"))); // NOI18N
        paramsButton.setToolTipText("Parameters");
        paramsButton.setBorderPainted(false);
        paramsButton.setContentAreaFilled(false);
        paramsButton.setFocusPainted(false);
        paramsButton.setMaximumSize(new java.awt.Dimension(32, 32));
        paramsButton.setMinimumSize(new java.awt.Dimension(32, 32));
        paramsButton.setPreferredSize(new java.awt.Dimension(32, 32));
        playerPanel.add(paramsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 30, 30));

        coverLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic/cover.png"))); // NOI18N
        coverLabel.setToolTipText("Cover");
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
        fileMenu.add(fileMenuSeparator1);

        addToLibraryButton.setText("Add to the library");
        addToLibraryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToLibraryButtonActionPerformed(evt);
            }
        });
        fileMenu.add(addToLibraryButton);

        createPlaylistButton.setText("Create a playlist");
        createPlaylistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlaylistButtonActionPerformed(evt);
            }
        });
        fileMenu.add(createPlaylistButton);
        fileMenu.add(fileMenuSeparator2);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
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
                        .addComponent(coverLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tagsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(libraryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(libraryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playlistComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playlistScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
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

    private void addToLibraryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToLibraryButtonActionPerformed
        controller.addSamplesToLibrary();
        libraryList.setListData(model.getLibraryModel());
    }//GEN-LAST:event_addToLibraryButtonActionPerformed

    private void addToLibraryMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToLibraryMenuActionPerformed
        controller.addSamplesToLibrary();
        libraryList.setListData(model.getLibraryModel());
    }//GEN-LAST:event_addToLibraryMenuActionPerformed

    private void removeFromLibraryMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromLibraryMenuActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Do you really want to delete these samples from the library?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.OK_OPTION) {
            controller.removeSamplesFromLibrary(libraryList.getSelectedIndices());
            libraryList.setListData(model.getLibraryModel());
        }
    }//GEN-LAST:event_removeFromLibraryMenuActionPerformed

    private void sortLibraryMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortLibraryMenuActionPerformed
        controller.sortLibrary();
        libraryList.setListData(model.getLibraryModel());
    }//GEN-LAST:event_sortLibraryMenuActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        controller.prepareToExit();
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void playlistComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlistComboBoxActionPerformed
        playlistList.setListData(model.getPlaylistModel(playlistComboBox.getSelectedIndex()));
    }//GEN-LAST:event_playlistComboBoxActionPerformed

    private void addToPlaylistMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToPlaylistMenuActionPerformed
        controller.addSamplesToPlaylist(playlistComboBox.getSelectedIndex(), libraryList.getSelectedIndices());
        playlistList.setListData(model.getPlaylistModel(playlistComboBox.getSelectedIndex()));
    }//GEN-LAST:event_addToPlaylistMenuActionPerformed

    private void removeFromPlaylistMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromPlaylistMenuActionPerformed
        controller.removeSamplesFromPlaylist(playlistComboBox.getSelectedIndex(), playlistList.getSelectedIndices());
        playlistList.setListData(model.getPlaylistModel(playlistComboBox.getSelectedIndex()));
    }//GEN-LAST:event_removeFromPlaylistMenuActionPerformed

    private void sortPlaylistMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortPlaylistMenuActionPerformed
        controller.sortPlaylist(playlistComboBox.getSelectedIndex());
        playlistList.setListData(model.getPlaylistModel(playlistComboBox.getSelectedIndex()));
    }//GEN-LAST:event_sortPlaylistMenuActionPerformed

    private void createPlaylistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlaylistButtonActionPerformed
        String name = JOptionPane.showInputDialog(this, null, "New playlist", -1);
        if (name != null && !name.isEmpty()) {
            controller.createPlaylist(name);
            playlistComboBox.addItem(name);
        }
    }//GEN-LAST:event_createPlaylistButtonActionPerformed

    private void removePlaylistMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlaylistMenuActionPerformed
        int index = playlistComboBox.getSelectedIndex();
        if (index == 0) {
            JOptionPane.showMessageDialog(this, "Impossible to remove the list in progress!", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this, "Do you really want to delete the playlist?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.OK_OPTION) {
                playlistComboBox.removeItemAt(index);
                controller.removePlaylist(index);
            }
        }
    }//GEN-LAST:event_removePlaylistMenuActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Main Function">
    @Override
    public void run() {
        java.util.Properties props = new java.util.Properties();
        props.put("logoString", "");

        com.jtattoo.plaf.noire.NoireLookAndFeel.setCurrentTheme(props);
        try {
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        PlayerFrame player = new PlayerFrame();
        player.setLocationRelativeTo(null);
        player.setVisible(true);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Variables declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutButton;
    private javax.swing.JMenuItem addToLibraryButton;
    private javax.swing.JMenuItem addToLibraryMenu;
    private javax.swing.JMenuItem addToPlaylistMenu;
    private javax.swing.JLabel coverLabel;
    private javax.swing.JMenuItem createPlaylistButton;
    private javax.swing.JMenuItem exitButton;
    private javax.swing.JMenuItem exportPlaylistButton;
    private javax.swing.JMenuItem extensionsButton;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPopupMenu.Separator fileMenuSeparator1;
    private javax.swing.JPopupMenu.Separator fileMenuSeparator2;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPopupMenu.Separator helpSeparator1;
    private javax.swing.JPopupMenu.Separator helpSeparator2;
    private javax.swing.JMenuItem importPLaylistButton;
    private javax.swing.JLabel libraryLabel;
    private javax.swing.JList<String> libraryList;
    private javax.swing.JPopupMenu.Separator libraryPopupSeparator1;
    private javax.swing.JPopupMenu.Separator libraryPopupSeparator2;
    private javax.swing.JScrollPane libraryScrollPane;
    private javax.swing.JPopupMenu llibraryPopup;
    private javax.swing.JButton loopButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton nextButton;
    private javax.swing.JMenu optionsMenu;
    private javax.swing.JButton paramsButton;
    private javax.swing.JButton playButton;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JComboBox<String> playlistComboBox;
    private javax.swing.JList<String> playlistList;
    private javax.swing.JPopupMenu playlistPopup;
    private javax.swing.JPopupMenu.Separator playlistPopupSeparator;
    private javax.swing.JScrollPane playlistScrollPane;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton randomButton;
    private javax.swing.JMenuItem removeFromLibraryMenu;
    private javax.swing.JMenuItem removeFromPlaylistMenu;
    private javax.swing.JMenuItem removePlaylistMenu;
    private javax.swing.JMenuItem sortLibraryMenu;
    private javax.swing.JMenuItem sortPlaylistMenu;
    private javax.swing.JMenuItem supportButton;
    private javax.swing.JButton syncButton;
    private javax.swing.JLabel tagsLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>

}
