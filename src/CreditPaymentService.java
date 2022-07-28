public class CreditPaymentService {

    public double calculate(double creditAmount, double interestRate, int period) {

        double rate; // коэффициент аннуитета
        double monthlyIntRate; // месячная процентная ставка

        double monthlyPayment; // сумма ежемесячного платежа

        monthlyIntRate = (interestRate/100)/12;

        period = period * 12; // кол-во периодов выплат

        // расчет коэффициента аннуитета
        rate = monthlyIntRate + monthlyIntRate/(Math.pow((1+monthlyIntRate),period)-1);

        // расчет аннуитетного платежа:
        monthlyPayment = rate * creditAmount;

        return monthlyPayment;

    }
}
