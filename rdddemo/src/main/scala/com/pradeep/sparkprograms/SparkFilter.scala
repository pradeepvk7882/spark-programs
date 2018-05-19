package com.pradeep.sparkprograms

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object SparkFilter {
    def main(args: Array[String]) = {
    
  val conf = new SparkConf().setAppName("FilterProgram").setMaster("local")
  val sc = new SparkContext(conf)
  
  val rdd1 = sc.parallelize(1 to 1000)
  val rdd2 = rdd1.filter(_%2 == 0)
  rdd2.collect().foreach(println)
  sc.stop()
 
  }
   
}