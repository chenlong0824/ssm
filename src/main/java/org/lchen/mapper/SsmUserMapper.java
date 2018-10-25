package org.lchen.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.lchen.model.SsmUser;

import java.util.List;

public interface SsmUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssm_user
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ssm_user",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssm_user
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ssm_user (pid, pname, ",
        "password)",
        "values (#{pid,jdbcType=INTEGER}, #{pname,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR})"
    })
    int insert(SsmUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssm_user
     *
     * @mbggenerated
     */
    int insertSelective(SsmUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssm_user
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "pid, pname, password",
        "from ssm_user",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    SsmUser selectByPrimaryKey(Integer pid);

    @Select({
        "select",
        "pid, pname, password",
        "from ssm_user"
    })
    @ResultMap("BaseResultMap")
    List<SsmUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssm_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SsmUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssm_user
     *
     * @mbggenerated
     */
    @Update({
        "update ssm_user",
        "set pname = #{pname,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR}",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SsmUser record);
}