package com.garment_erp.user_service_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;
import org.yaml.snakeyaml.util.EnumUtils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user")
public class User {
    @Id
    @Column(name = "user_id", unique = true, nullable = false, length = 80)
    private String userId;
    @Column(name = "user_name",unique = true, nullable = false, length = 100)
    private String userName;
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Column(name = "last_name", length = 45, nullable = false)
    private String lastName;
    @Column(name = "active_status", columnDefinition = "TINYINT")
    private boolean activeStatus;
    @Column(name = "otp", nullable = false)
    private int otp;

    //=====================
    @OneToOne(mappedBy = "user")
    private ShippingAddress shippingAddress;

    @OneToOne(mappedBy = "user")
    private BillingAddress billingAddress;


}
