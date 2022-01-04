package hu.nye.battleship.persistence.impl;

import hu.nye.battleship.persistence.GameSavesRepository;
import hu.nye.battleship.persistence.xml.PersistableSaveGame;
import hu.nye.battleship.service.game.SaveGame;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class XmlGameSavesRepository implements GameSavesRepository {

    private final Marshaller marshaller;
    private final Unmarshaller unmarshaller;

    public XmlGameSavesRepository(Marshaller marshaller, Unmarshaller unmarshaller) {
        this.marshaller = marshaller;
        this.unmarshaller = unmarshaller;
    }


    @Override
    public void save(SaveGame currentBoard) {


        try {
            PersistableSaveGame persistableSaveGame =
                    new PersistableSaveGame(currentBoard.getPlayerRowSave(), currentBoard.getPlayerColumnSave(), currentBoard.getEnemyRowSave(), currentBoard.getEnemyColumnSave());



            marshaller.marshal(persistableSaveGame, new File("boardstate.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }

    @Override
    public SaveGame load() {
        try {
            PersistableSaveGame persistableSaveGame = (PersistableSaveGame) unmarshaller.unmarshal(new File("boardstate.xml"));

            return new SaveGame(persistableSaveGame.getPlayerRowSave(), persistableSaveGame.getPlayerColumnSave(), persistableSaveGame.getEnemyRowSave(), persistableSaveGame.getEnemyColumnSave());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Failed to load XML");
    }
}
