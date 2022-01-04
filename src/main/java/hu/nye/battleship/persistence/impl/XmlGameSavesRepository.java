package hu.nye.battleship.persistence.impl;

import hu.nye.battleship.model.Board;
import hu.nye.battleship.model.MapVO;
import hu.nye.battleship.persistence.GameSavesRepository;
import hu.nye.battleship.persistence.xml.PersistableMapVO;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class XmlGameSavesRepository implements GameSavesRepository {
    @Override
    public void save(MapVO currentBoard) {

        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(PersistableMapVO.class);

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            PersistableMapVO persistableMapVO =
                    new PersistableMapVO(currentBoard.getPlayerRow(), currentBoard.getPlayerColumn(), currentBoard.getEnemyRow(), currentBoard.getEnemyColumn());


            marshaller.marshal(currentBoard, new File("boardstate.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }

    @Override
    public MapVO load() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(PersistableMapVO.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            PersistableMapVO persistableMapVO = (PersistableMapVO) unmarshaller.unmarshal(new File("boardstate.xml"));

            return new MapVO(persistableMapVO.getPlayerRow(), persistableMapVO.getPlayerColumn(), persistableMapVO.getEnemyRow(), persistableMapVO.getEnemyColumn());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Failed to load XML");
    }
}
