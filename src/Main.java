public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;



        int wynik = calculator.dodawanie(a, b);
        System.out.println(wynik);

        int wynikOdejmowania = calculator.odejmowanie(a, b);
        System.out.println(wynikOdejmowania);
    }
}