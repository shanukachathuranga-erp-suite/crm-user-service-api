package com.garment_erp.user_service_api.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseUserDto {
    private String userName;
    private String firstName;
    private String lastName;
    private boolean activeStatus;
    private ResponseUserAvatarDto avatar;   // if an avatar exists, return the actual value, if not send null
    private ResponseBillingAddressDto billingAddressDto;
    private ResponseShippingAddressDto shippingAddressDto;
}
