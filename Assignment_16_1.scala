import org.apache.spark.sql.SparkSession

object Assignment_17_1 extends App {

  val spark = SparkSession.builder()
    .master("local")
    .appName("example")
    .config("spark.sql.warehouse.dir", "file:///C:")
    .getOrCreate()

  val sc = spark.sparkContext
  val list_1 = sc.parallelize(1 to 10)

  //sum of list
  println("Sum of even numbers = " + list_1.sum())

  //length of list
  println("Total numbers = " + list_1.count())

  //Average
  println("Average of numbers = " + (list_1.sum()/list_1.count()))

  //filter out even nos
  val even = list_1.filter(x => x%2==0)
  println("Sum of even numbers = " + even.sum())

  //filter out nos divisible by 3 and 5
  val div = list_1.filter(x => (x%3==0 && x%5==0))
  println("Numbers divisible by 3 and 5 = " + div.count())
}
