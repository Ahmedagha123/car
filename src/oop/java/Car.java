
package oop.java;

public class Car {
  private float speed;
  private float distance;
  private float time;
  
  public float gettime(){
  
      this.time =  distance/speed  ;
      return time;
  }
  
  public void setspeed(float s){

  speed=s;
}
  public void setdistance (float d){
  
      distance = d;
  }
  
}