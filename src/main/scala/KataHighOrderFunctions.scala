object KataHighOrderFunctions {
  def main(a: Array[String]): Unit = {
    println("Hello world")
  }

  // Functions that take other functions as parameters or that return functions as results are called higher order functions.

  /**
    * We want a function DoubleList which returns the double of the elements in a list of integers.
    *
    * @param l a list of elements of type Int and "DoubleValue" a function which returns the double of an integer
    * @return a list containing the double of each element in l
    */


  def DoubleList(DoubleValue: Int => Int, l: List[Int]): List[Int] = {
    ???
  }


  /**
    * We want a function that returns the sum of the cubes of all the integers between a and b:
    *
    * @param a, b integers
    * @return the sum of the cubes of all the integers between a and b
    *
    * Hint : create a function that returns the cube of an integer and pass it as a parameter of the function sumCubes
    */


  def sumCubes(a: Int, b: Int): Int = {
    ???
  }


  /**
    * We want a function "placeOrder" which define a higher order function
    *
    * @param discount a fixed parameter  of type Double, a function "calc_price" which
    *        calculate the cost of a given list of orders.
    *
    *        We define an order as follows : List[(Name, quantity, price)].
    *        example : List("Glazed Donut", 5, 2.0). The function calc_price should return 5*2.0 = 10.0
    * @return the total cost of all orders
    */

  def placeOrder(orders: List[(String, Int, Double)])(discount: Double): Double = {
    ???
  }



}


