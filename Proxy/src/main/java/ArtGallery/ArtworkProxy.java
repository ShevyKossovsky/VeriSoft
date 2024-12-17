package ArtGallery;

public class ArtworkProxy implements Artwork {
    private RealArtwork realArtwork;

    //constructor
    public ArtworkProxy(RealArtwork realArtwork) {
        this.realArtwork = realArtwork;
    }

    @Override
    public void watch() {
        if (true) //Checking access for example...
            System.out.println("Checking access...");
        realArtwork.watch();
    }

    @Override
    public void buy() {
        if (true) //Checking access for example...
            System.out.println("Checking access...");
        realArtwork.watch();
    }
}
