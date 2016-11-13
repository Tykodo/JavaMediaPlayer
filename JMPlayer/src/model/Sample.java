package model;

public class Sample {
    
    private final String path;
    
    public Sample(String path) {
        this.path = path;
    }
    
    @Override
    public boolean equals(Object o) {
        return (o instanceof Sample ?
                    path.equals(((Sample) o).path) :
                    false
                );
    }

    @Override
    public String toString() {
        return new java.io.File(path).getName();
    }

}
