package com.upiiz.securityInDataBase.repositories;

import com.upiiz.securityInDataBase.entities.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<RolEntity, Long> {
}
