public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() 
    {
        return 40;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes)
    {
        return expectedMinutesInOven() - minutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayer)
    {
        return 2 * numberOfLayer;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayer, int numberOfMinutes)
    {
        return preparationTimeInMinutes(numberOfLayer) + numberOfMinutes;
    }
}
