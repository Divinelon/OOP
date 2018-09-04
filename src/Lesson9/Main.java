package Lesson9;

public class Main {

    public static void main(String[] args) {
        Device device = new Device("Samsung" ,120,"Ab123ajdjse");
        Monitor monitor = new Monitor("Asus",1200,"AB123dqweqew", 1960,1080);
        System.out.println(device);
        System.out.println(monitor);

        System.out.println(device.equals(monitor));
        System.out.println(monitor.hashCode());
    }

}
class Device{
    private String manufacture;
    private float price;
    private String serialNumber;


    public Device(String manufacture, float price, String serialNumber) {
        this.manufacture = manufacture;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacture='" + manufacture + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {return super.hashCode();
    }
}

class Monitor extends Device{

    private int resolutionX;
    private int resolutionY;


    public Monitor(String manufacture, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacture, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public String toString() {
        return  "Monitor{" + "manufacture " + getManufacture() + " price " + getPrice() + " serialNumber " + getSerialNumber() +
                " resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }


}
class EthernetAdapter {
    int speed;
    String mac;

    public EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (speed != that.speed) return false;
        return mac != null ? mac.equals(that.mac) : that.mac == null;
    }

    @Override
    public int hashCode() {
        int result = speed;
        result = 31 * result + (mac != null ? mac.hashCode() : 0);
        return result;
    }
}
