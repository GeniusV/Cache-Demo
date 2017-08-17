package io.github.geniusv.user.service;

import io.github.geniusv.dao.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by GeniusV on 8/5/17.
 */


@Transactional
public interface UserService {

    User selectByUserName(String userName);

    User getUserById(long id);

    void addUser(User user);

    List<User> getAllUsersByPage(Long offset, Long num);

    Long getUserCount();

    void deleteUser(List<Long> idList);

}
