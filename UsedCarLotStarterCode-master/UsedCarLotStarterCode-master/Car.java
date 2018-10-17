public abstract class Car{

private int price;
private String model;

public Car(){
  price=0;
  model="undef";
}

public Car (int p, String mod){
  price=p;
  model=mod;
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
}

