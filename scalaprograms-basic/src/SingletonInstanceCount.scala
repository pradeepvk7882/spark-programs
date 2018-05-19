

class SingletonInstanceCount {
  
  SingletonInstanceCount.instanceCout += 1
  
}

object SingletonInstanceCount {
  
  var instanceCout = 0;
  
  def printInstanceCount(): Unit = {println(instanceCout)}
}

object Main {
  
  def main(args: Array[String]): Unit = {
    
    for(i<- 1 to 10) new SingletonInstanceCount()
    SingletonInstanceCount.printInstanceCount()
    
  }
}