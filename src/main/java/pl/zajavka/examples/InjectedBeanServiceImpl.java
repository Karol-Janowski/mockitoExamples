package pl.zajavka.examples;

public class InjectedBeanServiceImpl implements InjectedBeanService{

    @Override
    public String anotherSampleMethod(String someValue) {
        return "some value: " + someValue;
    }
}
