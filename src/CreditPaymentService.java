public class CreditPaymentService {

    public int calculate(int a, int b) {
        double result;
        double percent = 9.9 / 12 / 100; // месячная процентная ставка
        double pow = Math.pow(1 + percent, b);
        double coff = (percent * pow) / (pow -1); // коэффициент аннуитента

        result = a * coff;

        return (int)result;
    }
}
