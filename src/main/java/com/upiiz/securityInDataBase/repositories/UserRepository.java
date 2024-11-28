package com.upiiz.securityInDataBase.repositories;

import com.upiiz.securityInDataBase.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Metodo para buscar un usuario por su nombre de usuario
    Optional<UserEntity> findUserEntityByUsername(String username);
}
