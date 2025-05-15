package com.garment_erp.user_service_api.dto.response.paginate;

import com.garment_erp.user_service_api.dto.response.ResponseUserDto;

import java.util.List;

public class ResponseUserPaginatedDto {
    private long count;
    private List<ResponseUserDto> users;
}
