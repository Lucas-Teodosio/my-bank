package br.com.bank.service;

import br.com.bank.model.Card;
import br.com.bank.repository.CardRepository;
import br.com.bank.utils.processDocument;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CardUseCase {

    private final CardRepository cardRepository;

    public void createCard(Card card) {
         this.cardRepository.save(card);
    }

    public void verifyCard(String document) {
        boolean isEven = processDocument.isLastDigitEven(document);

        if (isEven) {
            System.out.println("Deu bom");
        } else {
            System.out.println("Deu errado");
        }
    }
}
