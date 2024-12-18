package pl.zajavka.examples;

import java.time.LocalTime;

public class StaticMethodExample {

    public int getNano() {
        LocalTime now = LocalTime.now();
        return now.getNano();
    }
}
