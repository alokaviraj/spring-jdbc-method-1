package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "let`s start" );
        
        //spring jdbc =>jdbc templets
        
        @SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springjdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//        System.out.println("hello");
        //insert query
        String query="insert into student(id,name,city) values(?,?,?)";
        
        //fire the query
        int result = template.update(query,141,"aviraj","sitamarhi");
        System.out.println("number of record inserted..."+result);
        
    }
}
