package com.example.AppSebra;

import com.example.AppSebra.AppSebraApplicationTests;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@ContextConfiguration(classes = { AppSebraApplication.class })
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AbstractDefinition {

    public AbstractDefinition() {
    }
}