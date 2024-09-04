package com.study.mybatis_gradle.user.service;

import com.study.mybatis_gradle.user.dto.ShowUserReqDto;
import com.study.mybatis_gradle.user.dto.ShowUserResDto;

public interface UserService {

    ShowUserResDto showUser(ShowUserReqDto build);
}
