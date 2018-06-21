package io.github.geniusv.dao.model;

import java.io.Serializable;

public class Order implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_order.id
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_order.user_id
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_order.good
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    private Long good;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_order.num
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table v_order
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_order.id
     *
     * @return the value of v_order.id
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_order.id
     *
     * @param id the value for v_order.id
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_order.user_id
     *
     * @return the value of v_order.user_id
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_order.user_id
     *
     * @param userId the value for v_order.user_id
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_order.good
     *
     * @return the value of v_order.good
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public Long getGood() {
        return good;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_order.good
     *
     * @param good the value for v_order.good
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public void setGood(Long good) {
        this.good = good;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_order.num
     *
     * @return the value of v_order.num
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_order.num
     *
     * @param num the value for v_order.num
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_order
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", good=").append(good);
        sb.append(", num=").append(num);
        sb.append("]");
        return sb.toString();
    }
}