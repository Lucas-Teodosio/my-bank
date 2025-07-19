package br.com.bank.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@Table(name = "tb_cards")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private CardBrand brand;

    @Column(name = "income", nullable = false, precision = 15, scale = 2)
    private BigDecimal income;
}
