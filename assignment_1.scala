package Assignment_16

object assignment_1 extends App {

  var numbers = List[Int] (1,2,3,4,5,6,7,8,9,10)

  //finding the sum
  var sum = numbers.sum
  //finding the length of list
  var length = numbers.length
  //checking for even numbers from list and yeilding it to new list
  var even = for {x <- numbers if(x%2 == 0)} yield x
  //finding list items divisible by 3 and 5 both
  var division = for {x <- numbers if(x%3 == 0 && x%5 == 0)} yield x


  println("Numbers on which we are working : " + numbers.mkString(","))
  println("Sum = "  + sum)
  println("Total elements = " + length)
  //rounding up the average to two decimal places
  println("Average = " + BigDecimal(sum/(length.toFloat)).setScale(2,BigDecimal.RoundingMode.HALF_UP))
  println("Sum of " + even.mkString(",") + " = " + even.sum)
  println("The number of elements divisible by both 3 and 5 = " + division.length)

}
