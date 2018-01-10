def fibonacciSeries( n: Int): Unit={
   var  t1:Int =0
   var  t2:Int =1

  println("fibonacci series for Number :"+ n+ ":: ")
   for ( i: Int <- 0 to n ){
     println(t1)
     var sum :Int = t1+t2
      t1 = t2
      t2= sum
   }
}
print(fibonacciSeries(10))





