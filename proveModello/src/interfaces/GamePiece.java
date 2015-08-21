package interfaces;

import java.util.Map;

/** Basic class for representing a physical component of the game. */
public interface GamePiece {

    /**
     * @return the ID that identifies the GamePiece.
     */
    String getId();

    /** Set the ID that identifies the GamePiece. */
    void setId(String id);

    /**
     * Set the GameZone to which the GamePiece belongs.
     * Each GamePiece can belong to a single GameZone.
     * @param gameZone the GameZone to which the GamePiece belongs
     */
    void setGameZone(GameZone gameZone);

    /**
     * @return the GameZone to which this GamePiece belongs.
     */
    GameZone getGameZone();
    // TODO entità Stack da definire
    /**
     * @return the {@link Stack} to which this piece belongs, or null if it doesn't belong to a stack.
     */
    //public Stack getParent();

    /**
     * Set the {@link Stack} to which this piece belongs.
     * @param stack the {@link Stack} to which this piece belongs
     */
    //public void setParent(Stack stack);

    /** The plain English name for this piece */
    String getName();

    /** And the translated name for this piece */
    String getLocalizedName();

    /**
     * Get the type of the GamePiece.
     * It can be "token", "dice", or "card".
     * @return the type of the GamePiece
     */
    String getType();

    /**
     * Set a game-specific property, can be associated with a piece.
     * @param key the key that identifies the property
     * @param val the value of the property
     */
    void setProperty(Object key, Object val);

    /**
     * Get the property identified by the given key.
     * @param key the key that identifies the desired property
     * @return the property identified by the given key
     */
    Object getProperty(Object key);
}