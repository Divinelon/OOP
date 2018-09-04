package Lesson6;


public class Distance {
    public double distance;
    public void print(){

    }

    static class Converter{
        static double kmInMiles(double distanceInKm)
        {
            return distanceInKm / 1.6;
        }

        static double kmInMetr(double distanceKmInMetr)
        {
            return (distanceKmInMetr * 0.001);
        }
    }
}
