package io.github.geniusv.dao.model;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table v_user
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_user.id
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_user.user_name
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    private String userName;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_user.password
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    private String password;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_user.status
     *
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    private Long status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_user.id
     *
     * @return the value of v_user.id
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_user.id
     *
     * @param id the value for v_user.id
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_user.user_name
     *
     * @return the value of v_user.user_name
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_user.user_name
     *
     * @param userName the value for v_user.user_name
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_user.password
     *
     * @return the value of v_user.password
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_user.password
     *
     * @param password the value for v_user.password
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_user.status
     *
     * @return the value of v_user.status
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_user.status
     *
     * @param status the value for v_user.status
     * @mbg.generated Mon Aug 14 10:47:47 CST 2017
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}