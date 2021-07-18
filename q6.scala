//19001665
object q6 extends App{
  def fib(n:Int): Int= n match{
    case x if x==0 => 0
    case x if x==1 => 1
    case x => fib(n-1) + fib(n-2)
  }
  
  def fibseq(n:Int) : Unit ={
    if(n>0) fibseq(n-1)
    println(fib(n))
  }
  fibseq(14)
}