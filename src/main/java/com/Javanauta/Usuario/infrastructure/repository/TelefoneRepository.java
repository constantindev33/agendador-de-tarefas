package com.Javanauta.Usuario.infrastructure.repository;

import com.Javanauta.Aprendendo_Spring.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
