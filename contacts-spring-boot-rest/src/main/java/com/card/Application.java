package com.card;

import com.card.model.Card;
import com.card.repository.CardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner init(CardRepository cardRepo) {
        return args -> {

            Card card = new Card();
            card.setName("Barclays");
            card.setCardNumber(1239);
            card.setCardLimit(1000);
            card.setBalance(9000);

            cardRepo.save(card);

        };
    }

}
