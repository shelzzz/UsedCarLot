
/**
 * revision of UsedCarLot class
 *
 * @author Shelja Sarin and Tanvi Vaidya
 * @date: 10/19/2018
 */
import java.util.*; 
import java.util.Scanner; 

public class UsedCarLot2
{
  int totalValue;
  String searchCriteria;
  int intInput;
  String stringInput;
  //Creates ArrayLists to store Car objects 
  List<Car> UsedCars = new ArrayList<Car>();
 public UsedCarLot2(){
     //Creating Cars
     Car c1=(Car) new AutoTransCar(2500,"VW Bug", false, "1D7RV1GT0A5137108", "auto", 2015, "Volkswagon");
     totalValue=c1.getPrice();
     Car c2=(Car) new AutoTransCar(5000,"Ford Mustang", false, "3HGCG1641XG070722", "auto", 2016, "Ford");
     totalValue+=c2.getPrice();
     Car c3=(Car) new ManualTransCar(12000,"Honda Fit", 5, "1GNUKKE32AR159343", "manual", 2014, "Honda");
     totalValue+=c3.getPrice();
     //adding cars to UsedCars list
     UsedCars.add(c1);
     UsedCars.add(c2);
     UsedCars.add(c3);
     // This is how you would have to determin number of gears of a manual trans
     // car.  Why?
     System.out.println("c3 num gears = " + ((ManualTransCar)c3).getNumGears());
     
}

    public Car addCar(int p, String m, int ng, boolean cc, String v, String t, int y, String ma){
         if (t.equals("auto")){
             Car c=(Car) new AutoTransCar(p,m, false, v, t, y, ma);
             totalValue+=c.getPrice();
             return c;
            }
            if (t.equals("manual")) {
              Car c= (Car) new ManualTransCar(p,m, ng, v, t, y, ma);
              totalValue+=c.getPrice();  
              return c;
            }
            System.out.println("AddCar: Incorrect car type passed to addCar method!");
            return null;
        }
    
    /**
     * removeCar takes a Car variable as a param, and returns a null pointer,
     * thus setting the Car that you are trying to remove to null.  Why can't
     * we do this inside the method?
     * To call: c=removeCar(c);
     * @param c the car that you want to remove
     */
    public Car removeCar(Car c){
        totalValue-=c.getPrice();
        return null;
        // you could call System.gc() to force garbage collection
    }

    /**
     * Just a test method to allow testing through Bluej
     * @param n the car (c1,c2...) that you want to remove
     
    public  void testRemove(int n){
        if (n==1) { Car c1=removeCar(c1);}
        if (n==2) { Car c2=removeCar(c2);}
        if (n==3) { Car c3=removeCar(c3);}
    } */

 
   public void main(String[] args) {
       // Reads a single line from the console and stores into var       
       System.out.println("What would you like to search by?(options: make, model, price, year, trans, vinNumber)");
       Scanner in = new Scanner(System.in);
       searchCriteria = in.nextLine();
       
       // Reads a integer from the console and stores into var
       System.out.println("Enter the Criteria: ");
       intInput=in.nextInt();
       stringInput=in.nextLine();
       
       in.close();            
 
    }
   public void filterCars(){
       int k;
       String reply;
       List<Car> results = new ArrayList<Car>();
   switch(searchCriteria){
       case "price":
       for (k=0;k<UsedCars.size();k++){
          if (UsedCars.get(k).getPrice() <= intInput){
              results.add(UsedCars.get(k));
            }  
       }
       case "model":
       for (k=0;k<UsedCars.size();k++){
          if (UsedCars.get(k).getModel() == stringInput){
              results.add(UsedCars.get(k));
            }  
       }
       case "make":
       for (k=0;k<UsedCars.size();k++){
          if (UsedCars.get(k).getMake() == stringInput){
              results.add(UsedCars.get(k));
            }  
       }
       case "trans":
       for (k=0;k<UsedCars.size();k++){
          if (UsedCars.get(k).getTrans() == stringInput){
              results.add(UsedCars.get(k));
            }  
       }
       case "vinNumber":
       for (k=0;k<UsedCars.size();k++){
          if (UsedCars.get(k).getVinNumber() == stringInput){
              results.add(UsedCars.get(k));
            }  
       }
       case "year":
       for (k=0;k<UsedCars.size();k++){
          if (UsedCars.get(k).getYear() >= intInput){
              results.add(UsedCars.get(k));
            }  
       }
       default:
       System.out.println("Search field invalid");
   }
   System.out.println("Here are your results:");
   for (k=0;k<results.size();k++){
       System.out.println(results.get(k).toString());
    }
   System.out.println("Would you like to remove these results from the lot?(Y/N)");
   Scanner in = new Scanner(System.in);
   reply = in.nextLine();
   if (reply == "Y"){
     for (k=0;k<results.size();k++){
        Car x = removeCar(results.get(k));
       }
    }
   if (reply == "N"){
      System.out.println("results were not removed");
    }
    else{
      System.out.println("Incorrect Input");  
    }
}
}
 //List<Car> result = UsedCars.stream().filter(item -> item.price.equals(priceInput));//.collect(Collectors.toList());
