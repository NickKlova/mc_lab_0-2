package com.example.shopservice;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
               /* .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/mydb")
                .username("root")
                .password("1234")*/
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://eu-cdbr-west-03.cleardb.net:3306/heroku_62b14c8817a46db")
                .username("b038fb9d6909a8")
                .password("e240ba33")
                .build();
    }
}