package io.github.geniusv.dao.model;

import java.io.Serializable;

public class Role implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_role.id
     *
     * @mbg.generated Sat Aug 12 17:51:40 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_role.name
     *
     * @mbg.generated Sat Aug 12 17:51:40 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table v_role
     *
     * @mbg.generated Sat Aug 12 17:51:40 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_role.id
     *
     * @return the value of v_role.id
     *
     * @mbg.generated Sat Aug 12 17:51:40 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_role.id
     *
     * @param id the value for v_role.id
     *
     * @mbg.generated Sat Aug 12 17:51:40 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_role.name
     *
     * @return the value of v_role.name
     *
     * @mbg.generated Sat Aug 12 17:51:40 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_role.name
     *
     * @param name the value for v_role.name
     *
     * @mbg.generated Sat Aug 12 17:51:40 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }
}