package dao.mapper;

import dao.model.User;
import dao.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int updateByPrimaryKey(User record);

    List<Long> selectPrimaryKeyByExample(UserExample example);

    List<Long> selectPrimaryKeyLimitedByExample(@Param("offset") Long offset, @Param("num") Long num, @Param("example") UserExample example);
}