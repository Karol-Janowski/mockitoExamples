package pl.zajavka.examples;

public class Main {
    public static void main(String[] args) {
        // TDD - Test Driven Development
        // rodzaje testow:
        // - jednostkowe - szybkie i najtansze w utrzymaniu - bledny implementacyjne w danej dziedzinie programu
        // -integracyjne - przetestowanie komponentow miedzy ktorymi dochodzi do interakcji, test integracyjny jest jezeli
        // testuje wiecej niz jedna klase - styk dwoch komponentow - klasa z klasa/paczka z paczka - wolniejsze i wieksze
        // przykladowo kod komunikuje sie ze sztuczna baza danych stworzona na potrzeby testow
        // -systemowe/end-to-end - testy na prawdziwej aplikacji maja na celu zasymulowanie prawdziwego uzytkownika,
        // zazwyczaj sa zastepowane przez testerow manualnych
        // selenium testing - technologia do testow e2e
        // piramida testow - zalety i wady poszczegolnych rodzajow testow
        // ISTQB - Miedzynarodowa Rada certyfikacji do testowania oprogramowania
        // International Software Testing Qualifications Board
        // SUT - System Under Test - okreslenie tego co jest  testowane
        // CUT - class under test
        // OUT - object under test
        // MUT - Method under test
        // AUT - application under test

        // Mock - atrap. zaslepka
        // test Doubles = fake, dummy, stab, mock, spy - zastapienie obiektow w testach
        // fake - jego implementacja istnieje, ale jest uproszczona w sposob nienadajacy sie do uzicya na produkcji
        // dummy - rodzaj obiektu, ktory nie jest uzywany, a wylacznie istnieje na potrzeby poprawnego dzialania pewnych metod
        // stub - dostarcza zaprogramowane odpowiedzi na wywolanie metod wykonywanych podczas testow
        // mock - podobnie jak stub, dostarcza zaprogramowane odpowiedzi na wywolania metod
        // wykonywanych podczas testu. Do tego posiada wczesniej zdefiniowane oczekiwania uzycia,
        // ktore w przypadku niespelnienia spowoduja niepowodzenie testu
        // Spy - jest czesciowym mockiem, do tego pozwala na wywolanie prawdziwych metod z obiektu

        InjectedBeanServiceImpl injectedBeanService = new InjectedBeanServiceImpl();
        ExampleBeanService exampleBeanService = new ExampleBeanServiceImpl();
        exampleBeanService.setInjectedBeanService(injectedBeanService);

//        System.out.println(exampleBeanService.sampleMethod());
    }
}
