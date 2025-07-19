package br.com.bank.controller.api;

import br.com.bank.controller.request.CardRequest;
import br.com.bank.model.Card;
import br.com.bank.service.CardUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cards")
public class CardController {

    private final CardUseCase cardUseCase;

    public CardController(CardUseCase cardUseCase) {
        this.cardUseCase = cardUseCase;
    }
}
