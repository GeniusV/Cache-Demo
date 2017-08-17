package dao.mapper;

import dao.model.UserRole;
import dao.model.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    long countByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int deleteByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int insertSelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    List<UserRole> selectByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    UserRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Thu Aug 17 16:13:28 CST 2017
     */
    int updateByPrimaryKey(UserRole record);

    List<Long> selectPrimaryKeyByExample(UserRoleExample example);

    List<Long> selectPrimaryKeyLimitedByExample(@Param("offset") Long offset, @Param("num") Long num, @Param("example") UserRoleExample example);
}