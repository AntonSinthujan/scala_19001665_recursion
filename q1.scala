//19001665
object q1 extends App {
def prime(n:Int, m:Int=2): Boolean = m match{
  case x if x==n =>true
  case x if gcd(n,x)>1 => false
  case x => prime(n,x+1)
}

def gcd(a:Int, b:Int): Int=b match{
  case 0 => a
  case x if x>a => gcd(x,a)
  case x => gcd(x,a%x)
}
println(prime(8))
}
