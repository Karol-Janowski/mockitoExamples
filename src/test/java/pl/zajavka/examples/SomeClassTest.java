package pl.zajavka.examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.zajavka.examples.SomeClass;
import pl.zajavka.examples.SomeOtherClass;

@ExtendWith(MockitoExtension.class)
public class SomeClassTest {

    @InjectMocks
    private SomeClass someClass;

    @Mock
    private SomeOtherClass someOtherClass;

//    @Test
//    void someTest() {
//        Mockito.when(someOtherClass.someOtherMethod()).thenReturn("great");
//
//        someClass.someMethod();
//
//        Mockito.verify();
//    }
}
