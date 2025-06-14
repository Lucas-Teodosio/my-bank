package br.com.bank.model;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@Table(name = "tb_customers")
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String document;
    @Column(columnDefinition = "integer default 0")
    private Integer requests = 0;
}
