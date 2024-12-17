package VinylRecordStore;

/**
 * Adapter class that allows a RecordPlayer to be used as a ModernMediaPlayer.
 */
public class RecordPlayerAdapter implements ModernMediaPlayer {
    private RecordPlayer player;

    /**
     * Constructs the adapter with a RecordPlayer instance.
     *
     * @param player The RecordPlayer to adapt.
     */
    public RecordPlayerAdapter(RecordPlayer player) {
        this.player = player;
    }

    /**
     * Plays the record using the adapted RecordPlayer.
     */
    @Override
    public void play() {
        System.out.println("The player is playing...");
        player.play();
    }

    /**
     * Pauses the record using the adapted RecordPlayer.
     */
    @Override
    public void pause() {
        System.out.println("The player is pausing...");
        player.pause();
    }
}
