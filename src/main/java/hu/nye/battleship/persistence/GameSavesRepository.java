package hu.nye.battleship.persistence;

import hu.nye.battleship.model.MapVO;

public interface GameSavesRepository {

    void save(MapVO currentBoard);

    MapVO load();

}
