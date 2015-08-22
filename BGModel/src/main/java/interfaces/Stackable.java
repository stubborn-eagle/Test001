package interfaces;

/**
 * Interface implemented by stackable GamePieces
 */
public interface Stackable {

    /**
     * Set the {@link Stack} ID to which the piece belongs.
     * @param id the {@link Stack} ID to which this piece belongs
     */
    //void setParent(String id);

    /**
     * Get the {@link Stack} ID to which the piece belongs.
     * @return the {@link Stack} ID to which the piece belongs, or null if it doesn't belong to a stack
     */
    //String getParent();

    /**
     * Get the position of the piece in the {@link Stack}.
     * @return the position of the piece in the {@link Stack}
     */
    //Integer getStackPosition();

}
