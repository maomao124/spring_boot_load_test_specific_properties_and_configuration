package mao.spring_boot_load_test_specific_properties_and_configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootLoadTestSpecificPropertiesAndConfigurationApplication
{

    public static void main(String[] args)
    {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpringBootLoadTestSpecificPropertiesAndConfigurationApplication.class, args);
        //PropertiesAndArgs propertiesAndArgs = applicationContext.getBean(PropertiesAndArgs.class);
        //System.out.println(propertiesAndArgs);
    }

}
