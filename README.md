### A kata to learn how to use high order functions in Scala.

A high order function is a function that take other functions as parameters or return functions as results. 
<br>  <br>
In `/src/main/scala` directory, the goal is to implement different functions :
* _**DoubleList**_ : <br> 
  @param `l a list of elements of type `Int and `DoubleValue` a function which returns the double of an integer <br>
  @return a list containing the double of each element in `l` 

<br>

* _**sumCubes**_ : <br>
  @return the sum of the cubes of all the integers between `a and `b` the parameters

<br>

* _**placeOrder**_ : <br>
  @param `discount` a fixed parameter  of type Double, a function `calc_price` which calculate the cost of a given list of orders. <br>
  @return the total cost of all orders

  
<br>

Tests are implemented in `/src/main/test` directory.