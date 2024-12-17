package VinylRecordStore;


public class Main {
    public static void main(String[] args) {
        // Create a vintage record player instance
        RecordPlayer player = new VintageRecordPlayer();

        // Adapt the RecordPlayer to ModernMediaPlayer using the adapter
        ModernMediaPlayer adapter = new RecordPlayerAdapter(player);

        // Play and pause using the adapter
        adapter.play();
        adapter.pause();
    }
}
