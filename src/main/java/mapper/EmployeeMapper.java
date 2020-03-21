package mapper;

import entities.Employee;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

/**
 * Created by vasilevvs on 16.03.2020.
 */

//сделать интерфейс маппера с общими методами

//todo personName impl EmployeeMapperImpl ->
//https://www.codeflow.site/ru/article/mybatis

public interface EmployeeMapper {

   /* String getById = "SELECT * FROM Employee " +
                     "WHERE ID = #{id}";
*/
    /*String deleteById = "DELETE from Employee " +
                        "WHERE ID = #{id}";*/

   /* String insert = "INSERT INTO Employee " +
                    "(name, surname, patronymic, dateOfBirth, phone, email ) " +
                    "VALUES (#{name}, #{surname}, #{patronymic}, #{dateOfBirth}, #{phone}, #{email})";
*/
    String update = "UPDATE Employee SET " +
                    "(name = #{name}, surname = #{surname}, patronymic = #{patronymic}, " +
                    "phone = #{phone}, email = #{email} ) " +
                    "WHERE id = #{id}";


    //@Select("select max(id) from Employee")
    @SelectProvider(type = EmployeeMapperImpl.class)
    Integer getMaxId();

    @SelectProvider(type = EmployeeMapperImpl.class)
    List<Employee> getAll();

    @SelectProvider(type = EmployeeMapperImpl.class)
    Employee getById(int id);

    @SelectProvider(type = EmployeeMapperImpl.class)
    void delete(int id);




    //%value%
    //@Select("select * from user where ${column} = #{value}")
    @SelectProvider(type = EmployeeMapperImpl.class)
    Employee findByColumn(@Param("column") String column, @Param("value") String value);



    @Update(update)
    void update(Employee employee);

    //todo сделать каждую сущность отдельным методом(фул интерфейс, класс с SQL, и actionProvider)

 /*   InsertStatementProvider<SimpleTableRecord> insertStatement = insert(record)
            .into(simpleTable)
            .map(id).toProperty("id")
            .map(firstName).toProperty("firstName")
            .map(lastName).toProperty("lastName")
            .map(birthDate).toProperty("birthDate")
            .map(employed).toProperty("employed")
            .map(occupation).toProperty("occupation")
            .build()
            .render(RenderingStrategies.MYBATIS3);
*/
/*
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SimpleTableRecord> insertStatement);*/

//todo сделать для наглядности несколькими способами


    //@Insert(insert)
    @InsertProvider(type = EmployeeMapperImpl.class)
    //@Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Employee employee);






    //Employee connections with another entity
    //job-Employees-links - a table for description communication between Employees and jobs
    //отдельную сущность делать?
    @Select("inner join")
    List<Object> getAllEmployeesWithJob();
    //getLastOrdersWithItems
    //

    /*
    * Номер заказа - состав заказа - через запятую - преобразовать в \n - дата - фио клиента - фио сотрудника - итоговая сумма - статус
    *
    *
    * */

/*@Select(getAll)
    @Results(value = {
            @Result(property = "id", column = "ID"),
            @Result(property = "name", column = "NAME"),
            @Result(property = "surname", column = "SURNAME"),
            @Result(property = "patronymic", column = "PATRONYMIC"),
            @Result(property = "dateOfBirth", column = "DATEOFBIRTH"),
            @Result(property = "phone", column = "PHONE"),
            @Result(property = "email", column = "EMAIL")
    })*/


}