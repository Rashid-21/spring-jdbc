package az.spring.jdbc;

import az.spring.jdbc.config.SpringJdbcConfig;
import az.spring.jdbc.dao.EmployeeDao;
import az.spring.jdbc.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans/spring-jdbc-config.xml");
        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);


           //Inset - Update
        Employee add = new Employee();
        add.setName("Ruslan");
        add.setSurname("Orucov");
        add.setAge(27);
        add.setSalary(1400);

//        employeeDao.insert(add);

//        employeeDao.update(add);

//        employeeDao.delete(2);

        //Employee-count
        long count = employeeDao.count();
        System.out.println("count: " + count);


//        //Find
//        Employee find = employeeDao.getEmployeeById(1);
//        System.out.println(find);

        //All-Employee
        System.out.println(employeeDao.getAllEmployee());


    }
}
