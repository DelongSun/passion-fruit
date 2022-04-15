package com.toodin.passion.api;

import com.toodin.passion.dao.UserDao;
import com.toodin.passion.domain.UserEntity;
import com.toodin.passion.ui.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author kenzo
 * @date 2022-03-29 16:26
 */
@RestController(Test.PATH)
public class Test {
    static final String PATH = "/test";

    private final UserDao userDao;

    public Test(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping(PATH)
    public ApiResult process() {
        // Optional<UserEntity> userEntityOpt = userDao.findById(309035554685587456L);
        // Optional<UserEntity> userEntityOpt = userDao.findByUsername("张桂兰");
        // return userEntityOpt.map(ApiResult::success).orElseGet(() -> ApiResult.success(ApiResultCode.NOT_FOUND));

        // List<UserEntity> users = userDao.findTop10ByUsername("张桂兰");
        List<UserEntity> users = userDao.getFirst10ByUsername("张桂兰");


        return ApiResult.success(users);
    }

}
