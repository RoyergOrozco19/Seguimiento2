package Envío;

public class Envio {
    public String guideNum;
    private String date;
    private String packageType;
    public String clientID;
    private int weight;
    private String cityOrigin;
    private String destinyCity;
    private int cost;
    private String shippingStatus;

    public Envio(String guideNum, String date, String packageType, String clientID, int weight, String cityOrigin, String destinyCity, int cost, String shippingStatus) {
        this.guideNum = guideNum;
        this.date = date;
        this.packageType = packageType;
        this.clientID = clientID;
        this.weight = weight;
        this.cityOrigin = cityOrigin;
        this.destinyCity = destinyCity;
        this.cost = cost;
        this.shippingStatus = shippingStatus;
    }

    @Override
    public String toString() {
        return "Envio{" +
                "guideNum='" + guideNum + '\'' +
                ", date='" + date + '\'' +
                ", packageType='" + packageType + '\'' +
                ", clientID='" + clientID + '\'' +
                ", weight=" + weight +
                ", cityOrigin='" + cityOrigin + '\'' +
                ", destinyCity='" + destinyCity + '\'' +
                ", cost=" + cost +
                ", shippingStatus='" + shippingStatus + '\'' +
                '}';
    }
}
