package io.imking.core.mapping;

import io.imking.core.domain.KDUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface KDUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kd_user
     *
     * @mbg.generated
     */
    @Delete({
        "delete from kd_user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kd_user
     *
     * @mbg.generated
     */
    @Insert({
        "insert into kd_user (id, userName, ",
        "pwd, email, slat, ",
        "avatar, sex, phone, ",
        "brithday, nickName, ",
        "trueName, status, ",
        "createTime, updateTime, ",
        "address, workyears, ",
        "job, dream, introduce, ",
        "balance, points)",
        "values (#{id,jdbcType=BIGINT}, #{username,jdbcType=VARCHAR}, ",
        "#{pwd,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{slat,jdbcType=VARCHAR}, ",
        "#{avatar,jdbcType=VARCHAR}, #{sex,jdbcType=TINYINT}, #{phone,jdbcType=VARCHAR}, ",
        "#{brithday,jdbcType=VARCHAR}, #{nickname,jdbcType=VARCHAR}, ",
        "#{truename,jdbcType=VARCHAR}, #{status,jdbcType=TINYINT}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{updatetime,jdbcType=TIMESTAMP}, ",
        "#{address,jdbcType=VARCHAR}, #{workyears,jdbcType=INTEGER}, ",
        "#{job,jdbcType=VARCHAR}, #{dream,jdbcType=VARCHAR}, #{introduce,jdbcType=VARCHAR}, ",
        "#{balance,jdbcType=BIGINT}, #{points,jdbcType=BIGINT})"
    })
    int insert(KDUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kd_user
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, userName, pwd, email, slat, avatar, sex, phone, brithday, nickName, trueName, ",
        "status, createTime, updateTime, address, workyears, job, dream, introduce, balance, ",
        "points",
        "from kd_user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="userName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="pwd", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="slat", property="slat", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="brithday", property="brithday", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickName", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="trueName", property="truename", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="workyears", property="workyears", jdbcType=JdbcType.INTEGER),
        @Result(column="job", property="job", jdbcType=JdbcType.VARCHAR),
        @Result(column="dream", property="dream", jdbcType=JdbcType.VARCHAR),
        @Result(column="introduce", property="introduce", jdbcType=JdbcType.VARCHAR),
        @Result(column="balance", property="balance", jdbcType=JdbcType.BIGINT),
        @Result(column="points", property="points", jdbcType=JdbcType.BIGINT)
    })
    KDUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kd_user
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, userName, pwd, email, slat, avatar, sex, phone, brithday, nickName, trueName, ",
        "status, createTime, updateTime, address, workyears, job, dream, introduce, balance, ",
        "points",
        "from kd_user"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="userName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="pwd", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="slat", property="slat", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="brithday", property="brithday", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickName", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="trueName", property="truename", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updateTime", property="updatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="workyears", property="workyears", jdbcType=JdbcType.INTEGER),
        @Result(column="job", property="job", jdbcType=JdbcType.VARCHAR),
        @Result(column="dream", property="dream", jdbcType=JdbcType.VARCHAR),
        @Result(column="introduce", property="introduce", jdbcType=JdbcType.VARCHAR),
        @Result(column="balance", property="balance", jdbcType=JdbcType.BIGINT),
        @Result(column="points", property="points", jdbcType=JdbcType.BIGINT)
    })
    List<KDUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kd_user
     *
     * @mbg.generated
     */
    @Update({
        "update kd_user",
        "set userName = #{username,jdbcType=VARCHAR},",
          "pwd = #{pwd,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "slat = #{slat,jdbcType=VARCHAR},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=TINYINT},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "brithday = #{brithday,jdbcType=VARCHAR},",
          "nickName = #{nickname,jdbcType=VARCHAR},",
          "trueName = #{truename,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "createTime = #{createtime,jdbcType=TIMESTAMP},",
          "updateTime = #{updatetime,jdbcType=TIMESTAMP},",
          "address = #{address,jdbcType=VARCHAR},",
          "workyears = #{workyears,jdbcType=INTEGER},",
          "job = #{job,jdbcType=VARCHAR},",
          "dream = #{dream,jdbcType=VARCHAR},",
          "introduce = #{introduce,jdbcType=VARCHAR},",
          "balance = #{balance,jdbcType=BIGINT},",
          "points = #{points,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(KDUser record);
}