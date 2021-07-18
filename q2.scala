//19001665
object q2 extends App {
  
  
def prime(n:Int, m:Int=2): Int = m match{
  case x if x==n =>1
  case x if gcd(n,x)>1 => 0
  case x => prime(n,x+1)
}


def gcd(a:Int, b:Int): Int=b match{
  case 0 => a
  case x if x>a => gcd(x,a)
  case x => gcd(x,a%x)
}


def primeseq(n:Int) : Unit={
  if(n>0) {
    if(prime(n) == 1){
      println(n)
    }
    primeseq(n-1)
  }
}

primeseq(10)
}
