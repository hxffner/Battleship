package hu.nye.battleship.persistence;

import hu.nye.battleship.service.game.SaveGame;

public interface GameSavesRepository {

    void save(SaveGame currentBoard);

    SaveGame load();

}
