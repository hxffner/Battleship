package hu.nye.battleship.configuration;

import hu.nye.battleship.service.game.GameController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean(initMethod = "startGame")
    public GameController battleship() {
        return new GameController();
    }
}
