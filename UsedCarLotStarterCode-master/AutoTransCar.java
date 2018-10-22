public class AutoTransCar extends Car{ 
private boolean cruzControlOn;

public  AutoTransCar(){
   super();
   cruzControlOn=false;
}

public void toggleCruzControl(){
    cruzControlOn= ! cruzControlOn;
}

public  AutoTransCar (int p, String m, boolean ccOn, String v, String t, int y, String ma){
   super(p,m,v,t,ma,y);
   cruzControlOn=ccOn;
}

private void setCruzControl(boolean cc){
  cruzControlOn=cc;
}
private boolean getCruzControl(){
  return cruzControlOn;
}


}


 