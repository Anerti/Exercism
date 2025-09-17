import java.lang.Math;

    
class Darts {
    int score(double xOfDart, double yOfDart) {
        double target = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2)); 
        if (target <= 1)
        {
            return 10;
        }
        if (target > 1 && target <= 5)
        {
            return 5;
        }
        if (target > 5 && target <= 10)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
