package com.garment_erp.user_service_api.repo;

import com.garment_erp.user_service_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
