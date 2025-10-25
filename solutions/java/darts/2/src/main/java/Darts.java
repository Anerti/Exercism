import java.lang.Math;

    
class Darts {
    int score(double xOfDart, double yOfDart) {
        double target = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2)); 
        
        return target <= 1 ? 10
            : target > 1 && target <= 5 ? 5
            : target > 5 && target <= 10 ? 1
            : 0;
    }
}
