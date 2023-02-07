public class CreditPaymentService {

    public int calculate(int amountOfCredit, int numberOfMonths) {
        double result;
        double percent = 9.9 / 12 / 100; // месячная процентная ставка
        double pow = Math.pow(1 + percent, numberOfMonths);
        double coff = (percent * pow) / (pow -1); // коэффициент аннуитента

        result = amountOfCredit * coff;

        return (int)result;
    }
}
