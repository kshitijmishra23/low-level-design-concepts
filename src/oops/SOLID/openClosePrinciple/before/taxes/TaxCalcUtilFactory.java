
class TaxCalcUtilFactory{
    public TaxCalcInterface getTaxCalculator(Employee e){
         if (e.getNbHoursPerWeek() == 40){
             return new TaxCalcUtilFTE();
         }
         else if (e.getNbHoursPerWeek() == 20){
             return new TaxCalcUtilPTE();
         }
         else{
             return new TaxCalcUtilINT();
         }
    }
}
