class TaxCalcUtilPTE implements TaxCalcInterface {

    public double calculateTax(double salary){
      private double incometax, proftax, educationcess, totaltax;
      private double incometaxratio = 0.2, proftaxratio = 0.03, cessratio = 0.01;
      
      incometax = salary * incometaxratio;
      proftax = salary * proftaxratio;
      educationcess = salary * cessratio;
      
      totaltax = incometax + proftax + educationcess;
      return totaltax;
      
    }
}
