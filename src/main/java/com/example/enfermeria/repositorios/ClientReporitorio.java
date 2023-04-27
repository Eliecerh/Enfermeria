package com.example.enfermeria.repositorios;

import com.example.enfermeria.modelos.ClientModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientReporitorio extends JpaRepository<ClientModelo, Integer > {
}
