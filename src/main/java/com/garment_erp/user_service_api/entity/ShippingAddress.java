package com.garment_erp.user_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "shipping_address")
public class ShippingAddress {
    @Id
    @Column(name = "address_id", nullable = false, unique = true, length = 80)
    private String addressId;
    @Column(name = "country", nullable = false, length = 80)
    private String country;
    @Column(name = "city", nullable = false, length = 45)
    private String city;
    @Column(name = "street", nullable = false, length = 45)
    private String street;

    //=====================
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private  User user;


}
