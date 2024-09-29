package com.demoboletto.dto.request;

import com.demoboletto.type.EProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
@Schema(name = "UserProfileUpdateDto", description = "request for updating user profile")
public record UserProfileUpdateDto(
        @NotBlank(message = "닉네임은 필수 값입니다.")
        @JsonProperty("nickName")
        @Schema(description = "유저 닉네임", example = "닉네임쓰")
        String nickName,

        @NotBlank(message = "이름은 필수 값입니다.")
        @JsonProperty("name")
        @Schema(description = "유저 이름", example = "홍길동")
        String name
) {
}
