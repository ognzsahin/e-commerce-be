package org.example.ecommercebackend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cardNo;

    @Column(nullable = false)
    private Integer expireMonth;

    @Column(nullable = false)
    private Integer expireYear;

    @Column(nullable = false)
    private String nameOnCard;  //Kartın üzerindeki isim.

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}