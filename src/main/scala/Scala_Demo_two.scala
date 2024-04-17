object Scala_Demo_two {
  def main(args:Array[String]):Unit={

    var count=0;
    val a =37;
    for(i<-1 to a) {
      if (a % i == 0) {
        count = count + 1
      }
    }
      if (count==2){
        println(s"$a is a Prime Number")
      }
      else{
        println(s"$a is not a prime number")
      }


    }



}
