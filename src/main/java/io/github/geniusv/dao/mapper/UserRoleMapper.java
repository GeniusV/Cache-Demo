package io.github.geniusv.dao.mapper;

import io.github.geniusv.dao.model.UserRole;
import io.github.geniusv.dao.model.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    long countByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    int deleteByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    int insertSelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    List<UserRole> selectByExample(UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    UserRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_user_role
     *
     * @mbg.generated Sat Jun 09 23:54:42 CST 2018
     */
    int updateByPrimaryKey(UserRole record);

    /**
    * @mbg.generated
    */
    List<Long> selectPrimaryKeyByExample(UserRoleExample example);

    /**
    * @mbg.generated
    */
    List<Long> selectPrimaryKeyLimitedByExample(@Param("offset") Long offset, @Param("num") Long num, @Param("example") UserRoleExample example);
}