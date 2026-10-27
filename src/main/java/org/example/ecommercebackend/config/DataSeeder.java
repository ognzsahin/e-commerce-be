package org.example.ecommercebackend.config;

import lombok.RequiredArgsConstructor;
import org.example.ecommercebackend.model.Role;
import org.example.ecommercebackend.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        createRoleIfNotExists("customer", "Müşteri");
        createRoleIfNotExists("store", "Mağaza");
        createRoleIfNotExists("admin", "Admin");
    }

    private void createRoleIfNotExists(String code, String name) {
        if(roleRepository.findByCode(code).isEmpty()) {
            Role role = new Role();
            role.setCode(code);
            role.setName(name);
            roleRepository.save(role);
        }
    }

}