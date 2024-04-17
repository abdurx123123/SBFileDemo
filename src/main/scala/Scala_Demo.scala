object Scala_Demo {
  def main(args: Array[String]): Unit = {

    var a=0;
    print(a + " ")
    var b=1;
    println(b + " ")
    var c=a+b;
    for (i <- 1 to 20) {
      c=a+b;
      println(c)
      a=b;
      b=c
    }
  }
}
