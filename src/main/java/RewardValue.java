
public class RewardValue {

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double convert_from_cash_to_miles() {
        return cashValue / 0.0035;
    }

    public double convert_from_miles_to_cash() {
        return milesValue * 0.0035;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }
}