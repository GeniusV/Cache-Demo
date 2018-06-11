package io.github.geniusv.dao.model;

import java.io.Serializable;

public class Good implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_good.id
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_good.name
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_good.img
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    private String img;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column v_good.price
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    private Float price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table v_good
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_good.id
     *
     * @return the value of v_good.id
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_good.id
     *
     * @param id the value for v_good.id
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_good.name
     *
     * @return the value of v_good.name
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_good.name
     *
     * @param name the value for v_good.name
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_good.img
     *
     * @return the value of v_good.img
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_good.img
     *
     * @param img the value for v_good.img
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column v_good.price
     *
     * @return the value of v_good.price
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column v_good.price
     *
     * @param price the value for v_good.price
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_good
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
        sb.append(", name=").append(name);
        sb.append(", img=").append(img);
        sb.append(", price=").append(price);
        sb.append("]");
        return sb.toString();
    }
}