package pl.zajavka.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

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
        Mockito.when(injectedBeanService.anotherSampleMethod()).thenReturn(true);

        //when
        boolean result = exampleBeanService.sampleMethod();

        //then
        assertTrue(result);
    }

    static class StubInjectedBeanService implements InjectedBeanService {

        @Override
        public boolean anotherSampleMethod() {
            return true;
        }
    }
}