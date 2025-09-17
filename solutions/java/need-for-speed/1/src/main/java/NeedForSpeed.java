class NeedForSpeed {
    private int actualSpeed = 0;
    private int actualBattery = 100;
    private int speed;
    private int batteryDrain;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if (this.batteryDrain == 99){
            return true;
        }
        return actualBattery == 0;
    }

    public int distanceDriven() {
        return actualSpeed;
    }

    public void drive() {
        if (actualBattery > 0)
        {
            actualSpeed += this.speed;
            actualBattery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed(){
        return speed;
    }

    public int getBatteryDrained(){
        return batteryDrain;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        double result = (this.distance * car.getBatteryDrained()) / car.getSpeed();
        return result <= 100;
    }
}
