class Assignment_13_2_2 (){
  var n1=0
  var n2=1

  def fibonacciSeries( n:Int) : Unit={
    var n3 = 0
    if( n>0){
      n3=  n1+n2
      n1=n2
      n2= n3
      println(n3)
      fibonacciSeries(n-1)
    }

  }
}


object TestAssignment_13_2_2 {
  def main(args: Array[String]): Unit = {
    var obj = new Assignment_13_2
    println("fibonacciSeries ::")
    obj.fibonacciSeries(10)
  }
}



