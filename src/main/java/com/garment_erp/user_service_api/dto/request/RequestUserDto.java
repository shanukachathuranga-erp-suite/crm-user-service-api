package com.garment_erp.user_service_api.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestUserDto {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
}
