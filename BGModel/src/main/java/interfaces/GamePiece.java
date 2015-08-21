package interfaces;

import java.util.Map;

/** Basic class for representing a physical component of the game. */
public interface GamePiece {

    /**
     * Get the ID that identifies the {@link GamePiece}.
     * @return the ID that identifies the GamePiece
     */
    String getId();

    /** Set the ID that identifies the {@link GamePiece}. */
    void setId(String id);

    /**
     * Set the {@link GameZone} to which the {@link GamePiece} belongs.
     * Each GamePiece can belong to a single GameZone.
     * @param gameZone the GameZone to which the GamePiece belongs
     */
    void setGameZone(GameZone gameZone);

    /**
     * Get the {@link GameZone} to which this {@link GamePiece} belong.
     * @return the GameZone to which this GamePiece belongs
     */
    GameZone getGameZone();

    /**
     * Get the plain name for the {@link GamePiece}.
     * @return the plain name for the GamePiece
     */
    String getName();

    /**
     * Get the type of the {@link GamePiece}.
     * It can be "token", "dice", or "card".
     * @return the type of the GamePiece
     */
    String getType();

    /**
     * Set a game-specific property, can be associated with a {@link GamePiece}.
     * @param key the key that identifies the property
     * @param val the value of the property
     */
    void setProperty(Object key, Object val);

    /**
     * Get the {@link GamePiece} property identified by the given key.
     * @param key the key that identifies the desired property
     * @return the property identified by the given key
     */
    Object getProperty(Object key);
}