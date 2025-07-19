package br.com.bank.service.usecase;

import br.com.bank.external.CardMessage;
import br.com.bank.model.Customer;
import br.com.bank.repository.CardRepository;
import br.com.bank.service.CustomerUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerUseCaseImpl implements CustomerUseCase {

    private final CardMessage cardMessage;
    private final CardRepository cardRepository;

    @Override
    public void createCustomer(Customer customer) {
        this.cardRepository.save(customer);
    }

    @Override
    public String sendRequest(String document) {
        var customer = this.cardRepository.findByDocument(document);
        var request = customer.get().getRequests();
        customer.get().setRequests(request+1);
        this.cardRepository.saveAndFlush(customer.get());
        this.cardMessage.publish(document);
        return "Card requested successfully";
    }
}
