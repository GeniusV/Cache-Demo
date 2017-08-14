package io.github.geniusv.dao.model;

import java.io.Serializable;

public class UserRole implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_user_role.id
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_user_role.user_id
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_user_role.role_id
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table v_user_role
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_user_role.id
     *
     * @return the value of v_user_role.id
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_user_role.id
     *
     * @param id the value for v_user_role.id
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_user_role.user_id
     *
     * @return the value of v_user_role.user_id
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_user_role.user_id
     *
     * @param userId the value for v_user_role.user_id
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_user_role.role_id
     *
     * @return the value of v_user_role.role_id
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_user_role.role_id
     *
     * @param roleId the value for v_user_role.role_id
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}