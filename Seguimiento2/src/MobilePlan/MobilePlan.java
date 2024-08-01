package MobilePlan;

public class MobilePlan {
    String operator;
    int fixedCharge;
    int internationalMinuteRate;
    int dataPackageRate;

    public MobilePlan(String operator, int fixedCharge, int internationalMinuteRate, int dataPackageRate) {
        this.operator = operator;
        this.fixedCharge = fixedCharge;
        this.internationalMinuteRate = internationalMinuteRate;
        this.dataPackageRate = dataPackageRate;
    }
}