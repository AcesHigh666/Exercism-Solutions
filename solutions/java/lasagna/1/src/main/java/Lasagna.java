public class Lasagna {
    
    // TODO: define the 'expectedMinutesInOven()' method
    
     public int expectedMinutesInOven() {
        int expectedMinutes;
         expectedMinutes = 40;
        return expectedMinutes;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    
    public int remainingMinutesInOven(int timeInOven) {
       return expectedMinutesInOven() - timeInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layerAmmount) {
    return layerAmmount * 2;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layerAmmount, int timeInOven) {
        return timeInOven + layerAmmount * 2;
    }
}
