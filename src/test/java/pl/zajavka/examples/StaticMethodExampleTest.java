package pl.zajavka.examples;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class StaticMethodExampleTest {

    private StaticMethodExample staticMethodExample = new StaticMethodExample();

    @Test
    void getNano() {
        //given
        LocalTime now = LocalTime.now();
        int nanoNow = now.getNano();
        LocalTime nowEarlier = now.minusNanos(100);
        int nanoEarlier = nowEarlier.getNano();


        //when
        int result;
        // mockito inline
        try (MockedStatic<LocalTime> timeMock = Mockito.mockStatic(LocalTime.class)) {
            timeMock.when(LocalTime::now).thenReturn(nowEarlier);
            result = staticMethodExample.getNano();
        }
        //then
        Assertions.assertEquals(result, nanoNow);
        Assertions.assertEquals(result, nanoEarlier);
    }
}