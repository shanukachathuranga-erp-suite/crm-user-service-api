package com.garment_erp.user_service_api.repo;

import com.garment_erp.user_service_api.entity.UserAvatar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAvatarRepo extends JpaRepository<UserAvatar, String> {
}
