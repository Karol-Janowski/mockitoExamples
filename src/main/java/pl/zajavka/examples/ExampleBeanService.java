package pl.zajavka.examples;

public interface ExampleBeanService {

    void setInjectedBeanService(InjectedBeanService injectedBeanService);
    String sampleMethod(String someValue);
}
