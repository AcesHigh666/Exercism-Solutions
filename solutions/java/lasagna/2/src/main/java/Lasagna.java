public class Lasagna {
    
     public int expectedMinutesInOven() {
        int expectedMinutes;
         expectedMinutes = 40;
        return expectedMinutes;
    }
       
    public int remainingMinutesInOven(int timeInOven) {
       return expectedMinutesInOven() - timeInOven;
    }

    public int preparationTimeInMinutes(int layerAmmount) {
    return layerAmmount * 2;
    }
    
    public int totalTimeInMinutes(int layerAmmount, int timeInOven) {
        return timeInOven + preparationTimeInMinutes(layerAmmount);
    }
}
