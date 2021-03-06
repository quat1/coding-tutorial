import io.kotlintest.matchers.collections.shouldContain
import io.kotlintest.matchers.numerics.shouldBeGreaterThan
import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.matchers.numerics.shouldNotBeGreaterThan
import io.kotlintest.matchers.numerics.shouldNotBeGreaterThanOrEqual
import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec

class BasicsDescribeSpec : DescribeSpec({
    describe("Checks on Kotlin basics implementations") {
        context("functions") {
            it("sum1 and sum2 works the same") {
                val a = 1
                val b = 2
                sum1(a, b) shouldBe 3
                sum1(a, b) shouldBeLessThan 4
                sum1(0, 3) shouldBe 3
                sum1(-1, 1) shouldBe 0
                // Add greater less checks
                sum1(3, 0) shouldBe 3
                sum1(a, b) shouldBeGreaterThan 2
                sum1(-5, 8 ) shouldBe 3


            }
        }

        context("variables") {

            val readOnly = 11
            var reassignable = 3
//            it("val can not be reassigned") {
//                readOnly = 12
//            }

            it("can be reassigned") {
                reassignable = 6
                reassignable shouldBe 6
            }
        }

        context("strings") {
            val toge = "toge"
            val ther = "ther"
            val together = "together"

            it("concatenation works") {
                toge + ther shouldBe together
            }

            it("string interpolation works") {
                "$toge$ther" shouldBe together
            }

            it("is not empty") {
                together.isNotBlank() shouldBe true
            }
        }

        context("conditional expressions") {
            val max = 100
            val min = 0

            it("returns max") {
                maxOf(min, max) shouldBe max
            }

            it("") {
                minOf(1, 2)
            }
        }

        // 1) Write minOff function
        //return min value
        context("function minof"){
            val max = 100;
            val min = 0;

            it("return min"){
                minOf(max,min)shouldBe min
            }
            it(""){
                minOf(2,1)
            }
        }

        // 2) Write minOff function
        //created function which return min value
        /*  fun minOf(a: Int, b: Int): Int {
              describe("Return min value of value") {
                  context("functions") {
                      it("return min value"){
              if (a > b) {
                  return a
              } else {
                  return b
              }
                      }
          }
          */

        context("when expression") {
            describe(1) shouldBe "One"
            describe("hello") shouldBe "Greetings"
            // Add other checks
            describe("long") shouldBe String
            describe(true) shouldBe Boolean
            describe("other") shouldBe "Unknown"
        }

        context("collections") {
            val fruits = arrayListOf("Apple", "Orange", "Grapes", "Cherry")

            it("") {
                fruits.count() shouldBe 4
                fruits shouldContain "Apple"

                count(fruits) shouldBe 4
            }
        }
    }
})
