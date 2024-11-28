package com.upiiz.securityInDataBase.repositories;

import com.upiiz.securityInDataBase.entities.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<PermissionEntity, Long> {
}
