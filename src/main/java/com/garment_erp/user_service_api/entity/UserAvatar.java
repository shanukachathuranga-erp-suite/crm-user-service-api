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
public class UserAvatar {
    @Id
    @Column(name = "avatar_id", nullable = false, unique = true, length = 80)
    private String avatarId;
    @Embedded
    private FileResource fileResource;


}
