package app;

import entities.Employee;
import entities.Item;
import mapper.EmployeeMapper;
import mapper.ItemMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utils.Utils;

import java.util.Date;

@SpringBootApplication
@MapperScan("mapper")
public class Application implements CommandLineRunner {

  //todo add mybatis sql queries logs
  //todo Один интерфейс пёрсон маппер, а реализуют его классы, которые используют dynamic SQL


  @Autowired
  private EmployeeMapper personMapper;


  @Autowired
  private ItemMapper itemMapper;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {


    itemMapper.getAll().forEach(t -> System.out.println(t));

/*
    for (int i = 0; i < 10; i++)
      personMapper.insert((Employee) Utils.fillRandomRecord(new Employee()));

      personMapper.getAll().forEach(t -> System.out.println(t.toString()));

      System.out.println();
      System.out.println();
      System.out.println();

      System.out.println(personMapper.getById(3));

      System.out.println(personMapper.getMaxId());


      personMapper.delete(4);
*/


/*
      System.out.println("Deletion completed");


      Employee temp = personMapper.getById(7);
      temp.setDateOfBirth(new Date());
      personMapper.update(temp);

      System.out.println("Updating completed");
*/

     /* return new SQL()
              .SELECT("id", "name")
              .FROM("PERSON")
              .OFFSET_ROWS("#{offset}")
              .FETCH_FIRST_ROWS_ONLY("#{limit}")
              .toString();
    }*/
//https://mybatis.org/mybatis-3/statement-builders.html

//
/*
      UpdateStatementProvider updateStatement = update(animalData)
              .set(bodyWeight).equalTo(record.getBodyWeight())
              .set(animalName).equalToNull()
              .where(id, isIn(1, 5, 7))
              .or(id, isIn(2, 6, 8), and(animalName, isLike("%bat")))
              .or(id, isGreaterThan(60))
              .and(bodyWeight, isBetween(1.0).and(3.0))
              .build()
              .render(RenderingStrategies.MYBATIS3);

      int rows = mapper.update(updateStatement);

      */




      //System.out.println("Auto-generated ID is " + emp.getId());
    }
  }
