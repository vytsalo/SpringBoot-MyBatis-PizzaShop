package mapper;

import entities.Item;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Виталя on 22.03.2020.
 */
public interface ItemMapper {

    @Select("select * from Item")
    List<Item> getAll();

    @Select("select * from Item where id = #{id}")
    Item getById(int id);

    @Delete("delete from Item where id = #{id}")
    void delete(int id);

    @Select("select * from item where #{column} = #value")
    List<Item> findByColumn(@Param("column") String column, @Param("value") String value);

    @Update("update Item set " +
            "title = #{title}, description = #{description}, price = #{price}, picUrl = #{picUrl} " +
            "where id = #{id}")
    void update(Item item);

    @Insert("insert into Item" +
            "(title, description, price, picUrl)" +
            "values (#{title}, #{description}, #{price}, #{picUrl})")
    void insert(Item item);

}
