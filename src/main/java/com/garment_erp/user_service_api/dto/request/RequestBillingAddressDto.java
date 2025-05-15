package com.garment_erp.user_service_api.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestBillingAddressDto {
    private String country;
    private String city;
    private String street;
}
