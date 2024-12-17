package ArtGallery;

public class Main {
    public static void main(String[] args) {
        RealArtwork realArtwork=new RealArtwork();
        ArtworkProxy proxy=new ArtworkProxy(realArtwork);
        proxy.watch();
        proxy.buy();
    }
}
