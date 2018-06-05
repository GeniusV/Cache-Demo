package io.github.geniusv.role.service;

import io.github.geniusv.dao.model.Role;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 8/12/17.
 */
@Transactional
public interface RoleService {

    void addRoleToUser(Long roleId, Long userId);

    void deleteRoleFromUser(Long roleId, Long userId);

    List<Role> getUserRolesById(Long userId);
}
