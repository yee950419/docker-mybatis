package com.study.mybatis_gradle.user.service;

import com.study.mybatis_gradle.user.dto.ShowUserReqDto;
import com.study.mybatis_gradle.user.dto.ShowUserResDto;
import com.study.mybatis_gradle.user.exception.UserException;
import com.study.mybatis_gradle.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Transactional(readOnly = true)
    @Override
    public ShowUserResDto showUser(ShowUserReqDto showUserReqDto) {

        try {

            ShowUserResDto result = userMapper.showUser(showUserReqDto);

            if(result == null) {
                throw new UserException("해당 유저가 존재하지 않습니다.");
            }

            return result;

        } catch (Exception e) {

            throw new UserException(e.getMessage());
        }
    }
}
