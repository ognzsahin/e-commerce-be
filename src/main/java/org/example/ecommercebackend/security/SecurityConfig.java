package org.example.ecommercebackend.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //Bu sınıfın bir ayar sınıfı olduğunu Spring'e söyler.Uygulama açılırken Spring bu sınıfı okur.
@EnableWebSecurity  //Web güvenliğini bu sınıftaki kurallara göre yönetmesini ister.
                    // Böylece Spring Boot’un varsayılan kilidi devre dışı kalır.
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // “Güvenlik filtre zinciri” gelen her isteğin geçeceği kurallar listesidir.
        // @Bean bu listeyi Spring’e teslim eder.
        // HttpSecurity ise kuralları kurduğumuz araçtır.

        http
                .csrf(csrf -> csrf.disable())
                // CSRF korumasını kapatır.
                // React’ten gelecek POST/PUT isteklerinin engellenmemesi için.
                // JWT kullanan API’lerde bu koruma gerekmez.

                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
                // “Gelen her isteğe (anyRequest) izin ver (permitAll)” der. Geçici olarak kilidi açan satır bu.
        return http.build();
        // Yazdığımız kuralları birleştirip zinciri üretir ve Spring’e verir.
    }
}