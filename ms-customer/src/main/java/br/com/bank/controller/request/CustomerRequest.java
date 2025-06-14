package br.com.bank.controller.request;


import br.com.bank.model.Customer;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {

    private String email;
    private String document;
    private Integer requests;
}
