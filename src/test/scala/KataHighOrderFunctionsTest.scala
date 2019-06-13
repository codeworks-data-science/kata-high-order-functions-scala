import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

// hof : high order function

trait HofTestTrait {
  val hof = KataHighOrderFunctions
}

@RunWith(classOf[JUnitRunner])
class DoubleListTest extends FunSuite with HofTestTrait {


  test("sum_cubes_between_a_and_b") {
    //GIVEN
    val a = 2
    val b = 4

    //WHEN
    val result = hof.sumCubes(a,b)

    //THEN

    assert(result == (2*2*2 + 3*3*3 + 4*4*4))

  }


  test("double_elements_in_list") {
    //GIVEN
    val l = List(2,4,5)

    //WHEN
    val result = hof.DoubleList(DoubleValue = Int => Int, l = l)

    //THEN

    assert(result == List(4,8,10))

  }

  test("cost_of_orders_with_discount") {
    //GIVEN

    val listOrders = List(("Glazed Donut", 5, 2.50), ("Vanilla Donut", 10, 3.50))
    val price = hof.calc_price(listOrders)
    val discount = 0.5

    //WHEN
    val result = hof.placeOrder(price)(discount)

    //THEN

    val expected = (5*2.5 + 10*3.5)*0.5

    assert(result == expected)

  }

