package VinylRecordStore;

/**
 * Represents a vintage record player that implements the RecordPlayer interface.
 * Provides functionality to play and pause a vinyl record.
 */
public class VintageRecordPlayer implements RecordPlayer {

    /**
     * Plays the vinyl record.
     * Prints a message indicating that the vintage record player is playing.
     */
    @Override
    public void play() {
        System.out.println("Recording vintage player is playing ");
    }

    /**
     * Pauses the vinyl record.
     * Prints a message indicating that the vintage record player is pausing.
     */
    @Override
    public void pause() {
        System.out.println("Recording vintage player is pausing ");
    }
}
