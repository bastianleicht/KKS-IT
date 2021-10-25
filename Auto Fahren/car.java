public class Car
{
    double tankVolume;
    double fuelLevelTank;
    double dailyKm;
    double drivenKm;
    double fuelUsage;
    
    public Car(double tankVolume, double fuelUsage)
    {
        this.tankVolume = tankVolume;
        this.fuelUsage = fuelUsage;
    }

    public void refuel(double fuelVolume)
    {
        this.fuelLevelTank += fuelVolume;
    }

    public void drive(double kilometers)
    {
        this.fuelLevelTank -= (kilometers * this.fuelUsage)
    }

    public double calculateRange()
    {
        return this.fuelLevelTank / this.fuelUsage;
    }

    public void display()
    {
        System.out.println("Total kilometers: " + this.drivenKm + 'km');
        System.out.println("Distance traveled since last refueling: " + this.dailyKm + 'km');
        System.out.println("Level of the tank: " + this.fuelLevelTank + 'l');
        System.out.println("Range: " + calculateRange() + 'km');
    }
}