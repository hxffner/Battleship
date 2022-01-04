package hu.nye.battleship;

import hu.nye.battleship.persistence.impl.XmlGameSavesRepository;
import hu.nye.battleship.service.game.SaveGame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("hu.nye.battleship");



        //SaveGame saveGame = new SaveGame(1,1,1,1);

        //XmlGameSavesRepository xmlGameSavesRepository = new XmlGameSavesRepository(marshaller, unmarshaller);
        //xmlGameSavesRepository.save(saveGame);
    }
}
