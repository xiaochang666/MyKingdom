package io.imking.core.mapping;

import io.imking.core.domain.KDMedals;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface KDMedalsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kd_medals
     *
     * @mbg.generated
     */
    @Delete({
        "delete from kd_medals",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kd_medals
     *
     * @mbg.generated
     */
    @Insert({
        "insert into kd_medals (id, medalCode, ",
        "medalName, imgsrc, ",
        "remark, createTime)",
        "values (#{id,jdbcType=BIGINT}, #{medalcode,jdbcType=VARCHAR}, ",
        "#{medalname,jdbcType=VARCHAR}, #{imgsrc,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{createtime,jdbcType=TIMESTAMP})"
    })
    int insert(KDMedals record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kd_medals
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, medalCode, medalName, imgsrc, remark, createTime",
        "from kd_medals",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="medalCode", property="medalcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="medalName", property="medalname", jdbcType=JdbcType.VARCHAR),
        @Result(column="imgsrc", property="imgsrc", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    KDMedals selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kd_medals
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, medalCode, medalName, imgsrc, remark, createTime",
        "from kd_medals"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="medalCode", property="medalcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="medalName", property="medalname", jdbcType=JdbcType.VARCHAR),
        @Result(column="imgsrc", property="imgsrc", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<KDMedals> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kd_medals
     *
     * @mbg.generated
     */
    @Update({
        "update kd_medals",
        "set medalCode = #{medalcode,jdbcType=VARCHAR},",
          "medalName = #{medalname,jdbcType=VARCHAR},",
          "imgsrc = #{imgsrc,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "createTime = #{createtime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(KDMedals record);
}