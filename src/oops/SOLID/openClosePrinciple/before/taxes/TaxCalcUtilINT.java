class TaxCalcUtilINT implements TaxCalcInterface {
    public double calculateTax(double salary){
      private double incometax, proftax, educationcess, totaltax;
      private double incometaxratio = 0.15, proftaxratio = 0, cessratio = 0;
      private double exemption = 300000;
      
      if (salary < exemption)
        return 0;
        
      incometax = salary * incometaxratio;
      proftax = salary * proftaxratio;
      educationcess = salary * cessratio;
      
      totaltax = incometax + proftax + educationcess;
      return totaltax;
      
    }
}
