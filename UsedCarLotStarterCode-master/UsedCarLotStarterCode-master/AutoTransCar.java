public class AutoTransCar extends Car{ 
private boolean cruzControlOn;

public  AutoTransCar(){
   super();
   cruzControlOn=false;
}

public void toggleCruzControl(){
    cruzControlOn= ! cruzControlOn;
}

public  AutoTransCar (int p, String m,  boolean ccOn){
   super(p,m);
   cruzControlOn=ccOn;
}

private void setCruzControl(boolean cc){
  cruzControlOn=cc;
}
private boolean getCruzControl(){
  return cruzControlOn;
}


}


 