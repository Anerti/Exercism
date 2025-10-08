import java.util.List;

class ResistorColorTrio {
    private final int KILO = 1000;
    private final int MEGA = KILO * KILO;
    private final int GIGA = KILO * KILO * KILO;
    
    String label(String[] colors) {
        List<String> colorBand = List.of("black", 
                                         "brown", 
                                         "red", 
                                         "orange", 
                                         "yellow", 
                                         "green", 
                                         "blue", 
                                         "violet", 
                                         "grey", 
                                         "white");
        
        double output = Integer.parseInt(
            String.format("%s%s", colorBand.indexOf(colors[0]), colorBand.indexOf(colors[1]))
        );
        output *= Math.pow(10, colorBand.indexOf(colors[2]));

        return output >= GIGA ? (int)(output / GIGA) + " gigaohms"
                : output >= MEGA ? (int)(output / MEGA) + " megaohms"
                : output >= KILO ? (int)(output / KILO) + " kiloohms"
                : (int)output + " ohms";
    }
}
