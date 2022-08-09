import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1000000;
        double intRate = 9.99;
        int period = 3;
        double payment = service.calculate(creditAmount, intRate, period);

        int result = (int) payment;

        //DecimalFormat decimalFormat = new DecimalFormat("#.##");
        //String result = decimalFormat.format(payment);
        System.out.println("Сумма ежемесячного платежа составляет :" + result);
    }
}
