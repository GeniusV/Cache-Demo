package io.github.geniusv.user.service.impl;

import io.github.geniusv.dao.mapper.UserMapper;
import io.github.geniusv.dao.model.User;
import io.github.geniusv.dao.model.UserExample;
import io.github.geniusv.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by GeniusV on 8/5/17.
 */

@Service
public class SimpleUserService implements UserService {

    @Autowired
    private UserMapper userMapper;

    public int insert(User record) {
        return 0;
    }


    public User getUserById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public User selectByUserName(String userName) {
        UserExample example = new UserExample();
        example.or().andUserNameEqualTo(userName);

        List<User> list = userMapper.selectByExample(example);

        return list.get(0);
    }

    @Override
    public void addUser(User user) {

    }
}




