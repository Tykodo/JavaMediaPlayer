package controller;

import model.Sample;

public class PlayerController{

    private final view.frames.PlayerFrame player;
    private final model.Model model;
    
    public PlayerController(view.frames.PlayerFrame player, model.Model model) {
        this.player = player;
        this.model = model;
    }

    public void addSamplesToLibrary() {
        javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
        javax.swing.filechooser.FileNameExtensionFilter filter = new javax.swing.filechooser.FileNameExtensionFilter(
        "MP3 Audio Files", "mp3");
        chooser.setFileFilter(filter);
        chooser.setMultiSelectionEnabled(true);
        int returnVal = chooser.showOpenDialog(player);
        if(returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
            for(java.io.File f : chooser.getSelectedFiles())
                model.addSampleToLibrary(new Sample(f.getAbsolutePath()));
        }
    }

    public void removeSamplesFromLibrary(int[] indexes) {
        for(int i = indexes.length - 1; i >= 0; i--)
            model.removeSampleFromLibrary(indexes[i]);
    }

    public void sortLibrary() {
        model.sortLibrary(new SampleComparator());
    }

    public void prepareToExit() {
        //TODO
    }

    public void addSamplesToPlaylist(int index, int[] indexes) {
        for(int i : indexes)
            model.addSampleToPlaylist(index, i);
    }

    public void removeSamplesFromPlaylist(int index, int[] indexes) {
        for(int i = indexes.length - 1; i >= 0; i--)
            model.removeSampleFromPlaylist(index, indexes[i]);
    }

    public void sortPlaylist(int index) {
        model.sortPlaylist(index, new SampleComparator());
    }

    public void createPlaylist(String string) {
        if(!string.isEmpty())
            model.addPlaylist(new model.Playlist(string));
    }

    public void removePlaylist(int index) {
        model.removePlaylist(index);
    }
    
    class SampleComparator implements java.util.Comparator<Sample> {

        @Override
        public int compare(Sample sample1, Sample sample2) {
            return sample1.toString().compareToIgnoreCase(sample2.toString());
        }
    
    }
    
}
