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


        /*
        return new SQL()
    .SELECT("id", "name")
    .FROM("PERSON")
    .LIMIT("#{limit}")
    .OFFSET("#{offset}")
    .toString();*/


    }

    public String delete(){
        return new SQL().
                DELETE_FROM(tableName).
                WHERE("ID = #{id}").toString();
    }

    //todo public?
    public String getMaxId(){
        return new SQL().
                SELECT("MAX(id)").
                FROM(tableName).toString();
    }

    public String findByColumn(){
        return new SQL().
                SELECT("*").
                FROM(tableName).
                WHERE("${column} = %#{value}%").toString();
    }

    /*
    *  String insert = "INSERT INTO Employee " +
                    "(name, surname, patronymic, dateOfBirth, phone, email ) " +
                    "VALUES (#{name}, #{surname}, #{patronymic}, #{dateOfBirth}, #{phone}, #{email})";*/

    public String insert(){
        return new SQL().
                INSERT_INTO(tableName).
                SET("name, surname, patronymic, dateOfBirth, phone, email").
                INTO_VALUES("#{name}, #{surname}, #{patronymic}, #{dateOfBirth}, #{phone}, #{email}").toString();
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


}
