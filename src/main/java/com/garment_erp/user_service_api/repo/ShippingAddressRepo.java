package com.garment_erp.user_service_api.repo;

import com.garment_erp.user_service_api.entity.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingAddressRepo extends JpaRepository<ShippingAddress, String> {
}
