package model;

import java.util.ArrayList;

public class Model {

    private ArrayList<Sample> library;
    private ArrayList<Playlist> playlists;

    public Model() {
        library = new ArrayList<>();
        playlists = new ArrayList<>();
        
        populate();
    }

    // <editor-fold defaultstate="collapsed" desc="Library">
    public ArrayList<Sample> getLibrary() {
        return library;
    }
    
    public void setLibrary(ArrayList<Sample> library) {
        this.library = library;
    }

    public void addSampleToLibrary(Sample sample) {
        if(!library.contains(sample))
            library.add(sample);
    }
    
    public void removeSampleFromLibrary(int index) {
        if(index > 0 && index < library.size());
            library.remove(index);
    }
    
    public void sortLibrary(java.util.Comparator comparator) {
        library.sort(comparator);
    }
    
    public String[] getLibraryModel() {
        String[] model = new String[library.size()];
        for (int i = 0; i < library.size(); i++)
            model[i] = library.get(i).toString();
        return model;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Playlists">
    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }
        
    public void addPlaylist(Playlist playlist) {
        if(!playlists.contains(playlist))
            playlists.add(playlist);
    }
    
    public void removePlaylist(int index) {
        if(index > 0 && index < playlists.size());
            playlists.remove(index);
    }
    
    public void addSampleToPlaylist(int playlistIndex, int sampleIndex) {
        playlists.get(playlistIndex).addSample(library.get(sampleIndex));
    }
    
    public void removeSampleFromPlaylist(int playlistIndex, int sampleIndex) {
        playlists.get(playlistIndex).removeSample(sampleIndex);
    }
    
    public void sortPlaylist(int index, java.util.Comparator comparator) {
        playlists.get(index).sort(comparator);
    }
    
    public String[] getPlaylistModel(int index) {
        return playlists.get(index).getPlaylistModel();
    }
    
    public String[] getPlaylistsModel() {
        String[] model = new String[playlists.size()];
        for (int i = 0; i < playlists.size(); i++)
            model[i] = playlists.get(i).toString();
        return model;
    }
    // </editor-fold>

    //DO NOT FORGET TO REMOVE!!!
    private void populate() {
        addSampleToLibrary(new Sample("D:\\Music\\Mes musiques\\A Day To Remember - I'm Already Gone.mp3"));
        addSampleToLibrary(new Sample("D:\\Music\\Mes musiques\\30 Sai no Hoken Taiiku - Koi no Doutei.mp3"));
        addSampleToLibrary(new Sample("D:\\Music\\Mes musiques\\30 Sai no Hoken Taiiku - Learn Together.mp3"));
        addSampleToLibrary(new Sample("D:\\Music\\Mes musiques\\A Channel - Morning Arch.mp3"));
        addSampleToLibrary(new Sample("D:\\Music\\Mes musiques\\A Day To Remember - I Surrender.mp3"));
    
        addPlaylist(new Playlist("Now Playing"));
        addPlaylist(new Playlist("Playlist 1"));
        addPlaylist(new Playlist("Playlist 2"));
        
        addSampleToPlaylist(1, 0);
        addSampleToPlaylist(1, 1);
        addSampleToPlaylist(2, 2);
        addSampleToPlaylist(2, 3);
        addSampleToPlaylist(2, 4);
    }

}
