package mapper;

import entities.Employee;
import org.apache.ibatis.builder.annotation.ProviderMethodResolver;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Виталя on 21.03.2020.
 */
public class EmployeeMapperImpl implements ProviderMethodResolver{

    private static final String tableName = Employee.class.getSimpleName();

    public String getAll() {
        return new SQL().
                SELECT("*").
                FROM(tableName).toString();
    }

    public String getById(){
        return new SQL().
                SELECT("*").
                FROM(tableName).
                WHERE("ID = #{id}").toString();
    }

    public String delete(){
        return new SQL().
                DELETE_FROM(tableName).
                WHERE("ID = #{id}").toString();
    }

    public String getMaxId(){
        return new SQL().
                SELECT("MAX(id)").
                FROM(tableName).toString();
    }

    //обработки ошибок?
    //+ %value%
    //personMapper.findByColumn("name","Arnold");
    public String findByColumn(){
        return new SQL().
                SELECT("*").
                FROM(tableName).
                WHERE("${column} = #{value}").toString();
    }

    public String insert(){
        return new SQL().
                INSERT_INTO(tableName).
                VALUES("name, surname, patronymic, dateOfBirth, phone, email",
                        "#{name}, #{surname}, #{patronymic}, #{dateOfBirth}, #{phone}, #{email}").toString();
    }

    public String update(){
        return new SQL().
                UPDATE(tableName).
                SET("name = #{name}, surname = #{surname}, patronymic = #{patronymic}, " +
                "phone = #{phone}, email = #{email}").
                WHERE("id = #{id}").toString();
    }







    /*
      InsertStatementProvider<SimpleTableRecord> insertStatement = insert(record)
            .into(simpleTable)
            .map(id).toProperty("id")
            .map(firstName).toProperty("firstName")
            .map(lastName).toProperty("lastName")
            .map(birthDate).toProperty("birthDate")
            .map(employed).toProperty("employed")
            .map(occupation).toProperty("occupation")
            .build()
            .render(RenderingStrategies.MYBATIS3);*/

        /*
        return new SQL()
    .SELECT("id", "name")
    .FROM("PERSON")
    .LIMIT("#{limit}")
    .OFFSET("#{offset}")
    .toString();*/


}