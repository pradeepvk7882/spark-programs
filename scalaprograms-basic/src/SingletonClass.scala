

object SingletonClass {
  
  def myPrinterService(client: String): Boolean = {
    
    println("test message :" + client)
    true
  }
  
  def print(): Unit = {}
}

object TestSingletonClass {
  
  def main(args: Array[String]):Unit = {
    
    SingletonClass.myPrinterService("Bloomington")
  }
  
}