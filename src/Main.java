public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int credit = 2_000_000; //сумма кредита
        int date = 24; // срок кредита в месяцах

        double payment = service.calculate(credit, date);
        System.out.println("Ежемесячный платеж = " + payment);
    }
}