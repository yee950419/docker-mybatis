package com.study.mybatis_gradle.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ShowUserReqDto {

    private Long id;
}
