package hu.nye.battleship.configuration;

import hu.nye.battleship.persistence.GameSavesRepository;
import hu.nye.battleship.persistence.impl.XmlGameSavesRepository;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class RepositoryConfiguration {
    @Bean
    Connection connection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection(
                "jdbc:mysql://localhost/battleship","root","");
        return connection;
    }

    GameSavesRepository gameSavesRepository(Marshaller marshaller, Unmarshaller unmarshaller) {
        return new XmlGameSavesRepository(marshaller, unmarshaller);
    }
}
