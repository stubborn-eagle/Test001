package interfaces;

import java.util.List;

/** Basic class for representing a game zone of the boardgame. */
public interface GameZone {

    /**
     * Get the ID that identifies the {@link GameZone}.
     * @return the ID of the GameZone
     */
    String getId();

    /**
     * Set the ID that identifies the {@link GameZone}.
     * @param id the ID of the GameZone
     */
    void setId(String id);

    /**
     * Add another {@link GameZone} inside the GameZone.
     * @param gameZoneId the ID of the GameZone to add
     */
    void addGameZone(String gameZoneId);

    /**
     * Remove another {@link GameZone} from the GameZone.
     * @param gameZoneId the ID of the GameZone to remove
     */
    void removeGameZone(String gameZoneId);

    /**
     * Add a {@link GamePiece} to the {@link GameZone}.
     * @param gamePieceId the ID of the GameZone to add
     */
    void addGamePiece(String gamePieceId);

    /**
     * Remove a {@link GamePiece} from the {@link GameZone}.
     * @param gamePieceId the ID of the GameZone to remove
     */
    void removeGamePiece(String gamePieceId);

    /**
     * Get all the ID of GamePiece objects in the GameZone
     * @return the list of GamePieces in the GameZone
     */
    List<String> getGamePieces();

    /**
     * Get all the ID of GameZone objects in the GameZone
     * @return the list of GameZones in the GameZone
     */
    List<String> getGameZones();

    /**
     * Get the ID of the parent GameZone
     * @return the ID of the parent GameZone or {@link null} if there isn't a parent GameZone
     */
    String getParentGameZone();

    /**
     * Check if the {@link GameZone} is public.
     * @return true if the GameZone is public
     */
    boolean isPublic();

    /**
     * Add a {@link GameZone} to the legal GameZone list.
     * @param gameZoneId the ID of the GameZone to add to the legal GameZone list
     */
    void addLegalGameZone(String gameZoneId);

    /**
     * Move a {@link GamePiece} from the {@link GameZone} to a legal GameZone.
     * @param gamePieceId the ID of the GamePiece to move
     * @param toGameZoneId the ID of the GameZone in which the GamePiece will be moved
     */
    void moveGamePiece(String gamePieceId, String toGameZoneId);

    /**
     * Move a {@link GameZone} into a legal GameZone.
     * @param gameZoneId the ID of the GameZone to move
     * @param toGameZoneId the ID of the GameZone in which the GameZone will be moved
     */

}
