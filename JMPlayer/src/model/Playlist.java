package model;

import java.util.ArrayList;

public class Playlist {
    
    private final String name;
    private ArrayList<Sample> samples;
    
    public Playlist(String name) {
        this.name = name;
        samples = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Sample> getSamples() {
        return samples;
    }

    public void setSamples(ArrayList<Sample> samples) {
        this.samples = samples;
    }
    
    public void addSample(Sample sample) {
        if(!samples.contains(sample))
            samples.add(sample);
    }
    
    public void removeSample(int index) {
        if(index > 0 && index < samples.size());
            samples.remove(index);
    }

    public void sort(java.util.Comparator comparator) {
        samples.sort(comparator);
    }

    public String[] getPlaylistModel() {
        String[] model = new String[samples.size()];
        for (int i = 0; i < samples.size(); i++)
            model[i] = samples.get(i).toString();
        return model;
    }
    
    @Override
    public boolean equals(Object o) {
        return (o instanceof Playlist ?
                    name.equals(((Playlist) o).name) :
                    false
                );
    }

    @Override
    public String toString() {
        return name;
    }
    
}
