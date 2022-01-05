package hu.nye.battleship.persistence;

import hu.nye.battleship.service.game.SaveGame;

/**
 * Interface for storing and retrieving current game states.
 */
public interface GameSavesRepository {

    void save(SaveGame currentBoard);

    SaveGame load();

}
