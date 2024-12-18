package pl.zajavka.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

//@ExtendWith(MockitoExtension.class)
class ExampleBeanServiceImplTest {

    //    @InjectMocks
    private ExampleBeanServiceImpl exampleBeanService;

    //    @Mock
    private InjectedBeanService injectedBeanService;

    @BeforeEach
    void init() {
        this.injectedBeanService = Mockito.mock(InjectedBeanService.class);
        this.exampleBeanService = new ExampleBeanServiceImpl();
        this.exampleBeanService.setInjectedBeanService(injectedBeanService);
    }


    //    @ParameterizedTest
//    @MethodSource
    void sampleMethod(String val1, String val2) {
        // given
        // zapis1
//        Mockito.when(injectedBeanService.anotherSampleMethod(ArgumentMatchers.anyString()))
//                .thenThrow(new RuntimeException("my exception"));
        // zapis2
        Mockito
                .doReturn("some value")
                .when(injectedBeanService)
                .anotherSampleMethod(ArgumentMatchers.anyString());

        //when
//        String result1 = exampleBeanService.sampleMethod("val1");
//        String result2 = exampleBeanService.sampleMethod("val2");
//        String result3 = exampleBeanService.sampleMethod("val3");
//        String result4 = exampleBeanService.sampleMethod("val4");

//        Assertions.assertThrows(RuntimeException.class, () -> exampleBeanService.sampleMethod("some value"));

        String result = exampleBeanService.sampleMethod("some value");

        Assertions.assertEquals("some value", result);
        //then
//        assertEquals("my value", result1);
    }

    static Stream<Arguments> sampleMethod() {
        return Stream.of(
                Arguments.of("val1", "val2"),
                Arguments.of("val3", "val4"),
                Arguments.of("val5", "val6")
        );
    }

//    static class StubInjectedBeanService implements InjectedBeanService {
//
//        @Override
//        public boolean anotherSampleMethod() {
//            return true;
//        }
//    }
}