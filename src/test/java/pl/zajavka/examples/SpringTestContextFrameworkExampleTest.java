package pl.zajavka.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = ConfigScanBean.class)
public class SpringTestContextFrameworkExampleTest {

    @Autowired
    private ExampleBeanService exampleBeanService;

    @BeforeEach
    public void setup() {

        Assertions.assertNotNull(exampleBeanService);
    }

    @Test
    public void TestSampleMethod() {
        boolean result = exampleBeanService.sampleMethod();
        Assertions.assertFalse(result);
    }
}
