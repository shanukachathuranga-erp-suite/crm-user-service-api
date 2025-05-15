package com.garment_erp.user_service_api.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseUserAvatarDto {
    private String hash;
    private String directory;
    private String fileName;
    private String resourceUrl;

}
