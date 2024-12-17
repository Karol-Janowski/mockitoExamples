package pl.zajavka.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class ExampleBeanServiceImplTest {

    @InjectMocks
    private ExampleBeanServiceImpl exampleBeanService;

    @Mock
    private InjectedBeanService injectedBeanService;

    @Test
    void sampleMethod() {
        // given
        Mockito.when(injectedBeanService.anotherSampleMethod(ArgumentMatchers.any())).thenReturn("my value");

        //when
        String result1 = exampleBeanService.sampleMethod("val1");
        String result2 = exampleBeanService.sampleMethod("val2");
        String result3 = exampleBeanService.sampleMethod("val3");
        String result4 = exampleBeanService.sampleMethod("val4");

        //then
        assertEquals("my value", result1);
    }

//    static class StubInjectedBeanService implements InjectedBeanService {
//
//        @Override
//        public boolean anotherSampleMethod() {
//            return true;
//        }
//    }
}