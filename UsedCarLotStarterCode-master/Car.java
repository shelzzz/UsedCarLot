public abstract class Car{

private int price;
private String model;
private String make;
private String trans;
private String vinNumber;
private int year;

public Car(){
  price=0;
  model="undef";
  make="undef";
  trans="auto";
  vinNumber="undef";
  year=0;
}

public Car (int p, String mod, String mak, String t, String v, int y){
  price=p;
  model=mod;
  make=mak;
  trans=t;
  vinNumber=v;
  year=y;
}

public void setPrice(int p){
  price=p;
}

public int getPrice(){
  return  price;
}

public void setModel(String m){
  model=m;
}

public String getModel(){
  return  model;
}

public void setMake(String ma){
  make=ma;
}

public String getMake(){
  return  make;
}

public void setTrans(String t){
  trans=t;
}

public String getTrans(){
  return  trans;
}

public void setVinNumber(String v){
  vinNumber=v;
}

public String getVinNumber(){
  return  vinNumber;
}

public void setYear(int y){
  year=y;
}

public int getYear(){
  return  year;
}
}

