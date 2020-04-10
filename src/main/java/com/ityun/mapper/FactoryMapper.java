package com.ityun.mapper;

import com.ityun.domain.Factory;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * mybatis demo
 */
@Mapper
public interface FactoryMapper {
    @Select("select * from factory where id = #{id}")
    Factory findById(@Param("id") int id);

    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "work", column = "work")
    })
    @Select("select * from factory")
    List<Factory> all();

    @Insert("insert into factory (name, age, work) values (#{name}, #{age}, #{work})")
    int insert(@Param("name") String name, @Param("age") int age, @Param("work") String work);

    @Delete("delete from factory where id = #{id}")
    int deleteById(@Param("id") int id);

    @Update("update factory set name = #{name}, age = #{age} where id = #{id}")
    int updateById(@Param("id") int id, @Param("name") String name, @Param("age") int age);

}
