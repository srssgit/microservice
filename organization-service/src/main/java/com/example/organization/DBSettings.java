/*
 * package com.example.organization;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.boot.context.properties.ConfigurationProperties;
 * import org.springframework.boot.jdbc.DataSourceBuilder; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * import lombok.Data;
 * 
 * @Data
 * 
 * @Configuration
 * 
 * @ConfigurationProperties(prefix = "db") public class DBSettings {
 * 
 * private String url; private String userName; private String password;
 * 
 * @Bean public DataSource postgresqlDataSource() { return DataSourceBuilder
 * .create() .build(); } }
 */