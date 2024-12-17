package pl.zajavka.examples;

public class ExampleBeanServiceImpl implements ExampleBeanService{

    private InjectedBeanService injectedBeanService;

    @Override
    public void setInjectedBeanService(InjectedBeanService injectedBeanService) {
        this.injectedBeanService = injectedBeanService;
    }

    @Override
    public boolean sampleMethod() {
        return injectedBeanService.anotherSampleMethod();
    }
}
