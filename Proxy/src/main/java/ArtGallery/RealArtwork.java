package ArtGallery;

public class RealArtwork implements Artwork {
    @Override
    public void watch() {
        System.out.println("Watching Artwork...");
    }

    @Override
    public void buy() {
        System.out.println("Buying Artwork...");
    }
}
