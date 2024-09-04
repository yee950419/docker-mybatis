package com.study.mybatis_gradle.user.mapper;

import com.study.mybatis_gradle.user.dto.ShowUserReqDto;
import com.study.mybatis_gradle.user.dto.ShowUserResDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    ShowUserResDto showUser(ShowUserReqDto showUserReqDto);

}
