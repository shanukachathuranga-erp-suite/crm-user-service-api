package com.garment_erp.user_service_api.repo;

import com.garment_erp.user_service_api.entity.BillingAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingAddressRepo extends JpaRepository<BillingAddress, String > {
}
