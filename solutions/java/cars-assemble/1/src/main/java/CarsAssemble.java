public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed < 5)
        {
            return speed * 221;
        }
        if  (speed > 4 && speed < 9)
        {
            return (speed * 221) * (((double)(90)) / 100);
        }
        if (speed == 9)
        {
            return (speed * 221) * (((double)(80) / 100));
        }
        else
        {
            return (speed * 221) * (((double)(77) / 100));
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
