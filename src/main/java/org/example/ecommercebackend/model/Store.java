package org.example.ecommercebackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String storeName;

    @Column(nullable = false)
    private String storePhone;  //String tutuyoruz, çünkü başındaki "0 ve +" gibi karakterler Long ile kaybolur.

    @Column(nullable = false,  unique = true)
    private String taxNo;

    @Column(nullable = false)
    private String bankAccount;


    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;
}
