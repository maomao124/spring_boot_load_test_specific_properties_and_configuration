package mao.spring_boot_load_test_specific_properties_and_configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_boot_load_test_specific_properties_and_configuration
 * Package(包名): mao.spring_boot_load_test_specific_properties_and_configuration
 * Class(测试类名): PropertiesAndArgsTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/16
 * Time(创建时间)： 13:18
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest(properties = {"test.prop=hello"}, args = {"--test.args=hello1", "--server.port=8081"})
class PropertiesAndArgsTest
{
    @Value("${test.prop}")
    private String msg;

    @Value("${test.args}")
    private String msg1;

    @Value("${server.port}")
    private String port;

    @Test
    public void test()
    {
        System.out.println(msg);
        System.out.println(msg1);
        System.out.println(port);
    }

}