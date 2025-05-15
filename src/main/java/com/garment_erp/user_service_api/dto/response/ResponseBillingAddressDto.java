package com.garment_erp.user_service_api.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseBillingAddressDto {
    private String id;
    private String country;
    private String city;
    private String street;

}
