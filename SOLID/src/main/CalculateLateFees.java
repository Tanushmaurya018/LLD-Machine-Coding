package main;


// here we are passing LateFeeCalculator interface instead of a concrete class thus DIP

public class CalculateLateFees {

    public int calculateLateFees(int days, LateFeeCalculator[] items){
        int total = 0;

        for(LateFeeCalculator item : items){
            total += item.getCalculateLateFees(days);
        }
        return total;
    }
}
