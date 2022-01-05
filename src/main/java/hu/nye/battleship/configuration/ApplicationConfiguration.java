package hu.nye.battleship.configuration;

import hu.nye.battleship.service.game.GameController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Spring Java configuration class for generic application related Spring Beans.
 */

@Configuration
public class ApplicationConfiguration {
    @Bean(initMethod = "startGame")
    public GameController battleship() {
        return new GameController();
    }
}
