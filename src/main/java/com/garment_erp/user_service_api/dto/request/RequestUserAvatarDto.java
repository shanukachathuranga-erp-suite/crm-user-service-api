package com.garment_erp.user_service_api.dto.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestUserAvatarDto {
    private MultipartFile file;

}
