package mao.spring_boot_load_test_specific_properties_and_configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Project name(项目名称)：spring_boot_load_test_specific_properties_and_configuration
 * Package(包名): mao.spring_boot_load_test_specific_properties_and_configuration
 * Class(类名): PropertiesAndArgs
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/16
 * Time(创建时间)： 13:14
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Component
public class PropertiesAndArgs
{
    //@Value("${test.prop}")
    private String msg;

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("msg：").append(msg).append('\n');
        return stringbuilder.toString();
    }
}
