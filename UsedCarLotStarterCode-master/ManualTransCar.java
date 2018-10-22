public class ManualTransCar extends Car{
private int numGears;

public ManualTransCar(){
  super();
  setNumGears(5);
}

public  ManualTransCar( int p,String m, int  ng, String v, String t, int y, String ma){
   super(p,m,ma,v,t,y);
   setNumGears(5);
}

public void setNumGears(int ng){
    
    if (3<ng && ng <=6){
  
         numGears=ng;
  }
  else {
       numGears=5;
  }
}

public int getNumGears(){
  return numGears;
}

}