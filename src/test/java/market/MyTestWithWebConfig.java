package market;

import market.config.RootConfig;
import market.config.WebAppInitializer;
import market.config.WebConfig;
import market.controller.HomeController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by coffeenjava on 2017. 4. 2..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {WebConfig.class})
public class MyTestWithWebConfig {
//    @Autowired
//    ApplicationContext applicationContext;
//    @Test
//    public void test() {
//        homeController = applicationContext.getBean(HomeController.class);
//    }

    MockMvc mockMvc;
//    @Autowired
//    WebApplicationContext webApplicationContext;

    @Autowired
    HomeController homeController;

    @Before
    public void before() {
        mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
    }

    @Test
    public void test() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.view().name("home"));
//        System.out.println(homeController.home());
    }
}
