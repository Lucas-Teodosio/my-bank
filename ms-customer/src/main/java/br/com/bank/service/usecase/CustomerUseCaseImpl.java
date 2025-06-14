package br.com.bank.service.usecase;

import br.com.bank.model.Customer;
import br.com.bank.repository.CustomerRepository;
import br.com.bank.service.CustomerUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerUseCaseImpl implements CustomerUseCase {

    private final CustomerRepository customerRepository;

    @Override
    public void createCustomer(Customer customer) {
        this.customerRepository.save(customer);
    }

    public String sendRequest(String document) {
        Optional<Customer> optionalCustomer = customerRepository.findByDocument(document);

        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            customer.setRequests(customer.getRequests() + 1);
            customerRepository.save(customer);
        } else {
            Customer newCustomer = Customer.builder()
                    .document(document)
                    .requests(1)
                    .build();
            customerRepository.save(newCustomer);
        }

        return "Card requested successfully";
    }

    @Override
    public Optional<Customer> findByDocument(String document) {
        return customerRepository.findByDocument(document);
    }
}
