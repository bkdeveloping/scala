object book extends App {
  def costCalc(x:Int)={
    if(x<=50){
      var y :Double = ((x*24.95)*5/3)+(x*3.0);
      println(y);
      }
    else{
      var z :Double= ((x*24.95)*5/3)+(50*3.0)+((x-50)*0.75);
      println(z);
    }
  }
  costCalc(60);
}
