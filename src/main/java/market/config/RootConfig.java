package market.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by coffeenjava on 2017. 3. 19..
 */

@Configuration
@ComponentScan(
    basePackages = {"market"},
    excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION, value= EnableWebMvc.class)
    }
)
public class RootConfig {
}
