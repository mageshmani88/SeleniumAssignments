package week1.day2;

public class Car {
	public String CarBrand = "TATA";
    boolean ispuncture = true;

   public int getReg() {
        int pin = 7315;
		return pin;
    }
    
   int multipleIntegers(int a, int b, int c) {
        return a * b * c;
    }
    
    public String  getCarModel() {
        return "TIAGO";	   
     }
    
    public static void main(String[] args) {
        Car myCar = new Car();
        String brand = myCar.CarBrand;
        System.out.println(brand);

        int carReg = myCar.getReg();
        System.out.println(carReg);
        
        boolean carPuncture = myCar.ispuncture;
        
        System.out.println(myCar.multipleIntegers(2, 3, 4));
        
        String carModel = myCar.getCarModel();
        System.out.println(carModel);
        
        
       	        
    }
}




