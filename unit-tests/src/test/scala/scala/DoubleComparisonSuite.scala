package scala

object DoubleComparisonSuite extends tests.Suite {
  test("fcmp") {
    // These were code-generated on the JVM using:
    //
    // scala> val values = Seq(("0.0d", 0.0d),
    //                         ("-0.0d", -0.0d),
    //                         ("Double.MaxValue", Double.MaxValue),
    //                         ("Double.MinValue", Double.MinValue),
    //                         ("Double.NaN", Double.NaN),
    //                         ("42.0d", 42.0d),
    //                         ("-42.0d", -42.0d),
    //                         ("Double.PositiveInfinity", Double.PositiveInfinity),
    //                         ("Double.NegativeInfinity", Double.NegativeInfinity))
    //
    // scala> val ops = Seq(("<", (_: Double) < (_: Double)),
    //                      ("<=", (_: Double) <= (_: Double)),
    //                      (">", (_: Double) > (_: Double)),
    //                      (">=", (_: Double) >= (_: Double)),
    //                      ("==", (_: Double) == (_: Double)),
    //                      ("!=", (_: Double) != (_: Double)))
    //
    // scala> values.flatMap { case (s1, v1) =>
    //          values.flatMap { case (s2, v2) =>
    //            ops.map { case (op, f) =>
    //              s"assert(($s1 $op $s2) == ${f(v1, v2)})"
    //            }
    //          }
    //        }.foreach(println)
    assert((0.0d < 0.0d) == false)
    assert((0.0d <= 0.0d) == true)
    assert((0.0d > 0.0d) == false)
    assert((0.0d >= 0.0d) == true)
    assert((0.0d == 0.0d) == true)
    assert((0.0d != 0.0d) == false)
    assert((0.0d < -0.0d) == false)
    assert((0.0d <= -0.0d) == true)
    assert((0.0d > -0.0d) == false)
    assert((0.0d >= -0.0d) == true)
    assert((0.0d == -0.0d) == true)
    assert((0.0d != -0.0d) == false)
    assert((0.0d < Double.MaxValue) == true)
    assert((0.0d <= Double.MaxValue) == true)
    assert((0.0d > Double.MaxValue) == false)
    assert((0.0d >= Double.MaxValue) == false)
    assert((0.0d == Double.MaxValue) == false)
    assert((0.0d != Double.MaxValue) == true)
    assert((0.0d < Double.MinValue) == false)
    assert((0.0d <= Double.MinValue) == false)
    assert((0.0d > Double.MinValue) == true)
    assert((0.0d >= Double.MinValue) == true)
    assert((0.0d == Double.MinValue) == false)
    assert((0.0d != Double.MinValue) == true)
    assert((0.0d < Double.NaN) == false)
    assert((0.0d <= Double.NaN) == false)
    assert((0.0d > Double.NaN) == false)
    assert((0.0d >= Double.NaN) == false)
    assert((0.0d == Double.NaN) == false)
    assert((0.0d != Double.NaN) == true)
    assert((0.0d < 42.0d) == true)
    assert((0.0d <= 42.0d) == true)
    assert((0.0d > 42.0d) == false)
    assert((0.0d >= 42.0d) == false)
    assert((0.0d == 42.0d) == false)
    assert((0.0d != 42.0d) == true)
    assert((0.0d < -42.0d) == false)
    assert((0.0d <= -42.0d) == false)
    assert((0.0d > -42.0d) == true)
    assert((0.0d >= -42.0d) == true)
    assert((0.0d == -42.0d) == false)
    assert((0.0d != -42.0d) == true)
    assert((0.0d < Double.PositiveInfinity) == true)
    assert((0.0d <= Double.PositiveInfinity) == true)
    assert((0.0d > Double.PositiveInfinity) == false)
    assert((0.0d >= Double.PositiveInfinity) == false)
    assert((0.0d == Double.PositiveInfinity) == false)
    assert((0.0d != Double.PositiveInfinity) == true)
    assert((0.0d < Double.NegativeInfinity) == false)
    assert((0.0d <= Double.NegativeInfinity) == false)
    assert((0.0d > Double.NegativeInfinity) == true)
    assert((0.0d >= Double.NegativeInfinity) == true)
    assert((0.0d == Double.NegativeInfinity) == false)
    assert((0.0d != Double.NegativeInfinity) == true)
    assert((-0.0d < 0.0d) == false)
    assert((-0.0d <= 0.0d) == true)
    assert((-0.0d > 0.0d) == false)
    assert((-0.0d >= 0.0d) == true)
    assert((-0.0d == 0.0d) == true)
    assert((-0.0d != 0.0d) == false)
    assert((-0.0d < -0.0d) == false)
    assert((-0.0d <= -0.0d) == true)
    assert((-0.0d > -0.0d) == false)
    assert((-0.0d >= -0.0d) == true)
    assert((-0.0d == -0.0d) == true)
    assert((-0.0d != -0.0d) == false)
    assert((-0.0d < Double.MaxValue) == true)
    assert((-0.0d <= Double.MaxValue) == true)
    assert((-0.0d > Double.MaxValue) == false)
    assert((-0.0d >= Double.MaxValue) == false)
    assert((-0.0d == Double.MaxValue) == false)
    assert((-0.0d != Double.MaxValue) == true)
    assert((-0.0d < Double.MinValue) == false)
    assert((-0.0d <= Double.MinValue) == false)
    assert((-0.0d > Double.MinValue) == true)
    assert((-0.0d >= Double.MinValue) == true)
    assert((-0.0d == Double.MinValue) == false)
    assert((-0.0d != Double.MinValue) == true)
    assert((-0.0d < Double.NaN) == false)
    assert((-0.0d <= Double.NaN) == false)
    assert((-0.0d > Double.NaN) == false)
    assert((-0.0d >= Double.NaN) == false)
    assert((-0.0d == Double.NaN) == false)
    assert((-0.0d != Double.NaN) == true)
    assert((-0.0d < 42.0d) == true)
    assert((-0.0d <= 42.0d) == true)
    assert((-0.0d > 42.0d) == false)
    assert((-0.0d >= 42.0d) == false)
    assert((-0.0d == 42.0d) == false)
    assert((-0.0d != 42.0d) == true)
    assert((-0.0d < -42.0d) == false)
    assert((-0.0d <= -42.0d) == false)
    assert((-0.0d > -42.0d) == true)
    assert((-0.0d >= -42.0d) == true)
    assert((-0.0d == -42.0d) == false)
    assert((-0.0d != -42.0d) == true)
    assert((-0.0d < Double.PositiveInfinity) == true)
    assert((-0.0d <= Double.PositiveInfinity) == true)
    assert((-0.0d > Double.PositiveInfinity) == false)
    assert((-0.0d >= Double.PositiveInfinity) == false)
    assert((-0.0d == Double.PositiveInfinity) == false)
    assert((-0.0d != Double.PositiveInfinity) == true)
    assert((-0.0d < Double.NegativeInfinity) == false)
    assert((-0.0d <= Double.NegativeInfinity) == false)
    assert((-0.0d > Double.NegativeInfinity) == true)
    assert((-0.0d >= Double.NegativeInfinity) == true)
    assert((-0.0d == Double.NegativeInfinity) == false)
    assert((-0.0d != Double.NegativeInfinity) == true)
    assert((Double.MaxValue < 0.0d) == false)
    assert((Double.MaxValue <= 0.0d) == false)
    assert((Double.MaxValue > 0.0d) == true)
    assert((Double.MaxValue >= 0.0d) == true)
    assert((Double.MaxValue == 0.0d) == false)
    assert((Double.MaxValue != 0.0d) == true)
    assert((Double.MaxValue < -0.0d) == false)
    assert((Double.MaxValue <= -0.0d) == false)
    assert((Double.MaxValue > -0.0d) == true)
    assert((Double.MaxValue >= -0.0d) == true)
    assert((Double.MaxValue == -0.0d) == false)
    assert((Double.MaxValue != -0.0d) == true)
    assert((Double.MaxValue < Double.MaxValue) == false)
    assert((Double.MaxValue <= Double.MaxValue) == true)
    assert((Double.MaxValue > Double.MaxValue) == false)
    assert((Double.MaxValue >= Double.MaxValue) == true)
    assert((Double.MaxValue == Double.MaxValue) == true)
    assert((Double.MaxValue != Double.MaxValue) == false)
    assert((Double.MaxValue < Double.MinValue) == false)
    assert((Double.MaxValue <= Double.MinValue) == false)
    assert((Double.MaxValue > Double.MinValue) == true)
    assert((Double.MaxValue >= Double.MinValue) == true)
    assert((Double.MaxValue == Double.MinValue) == false)
    assert((Double.MaxValue != Double.MinValue) == true)
    assert((Double.MaxValue < Double.NaN) == false)
    assert((Double.MaxValue <= Double.NaN) == false)
    assert((Double.MaxValue > Double.NaN) == false)
    assert((Double.MaxValue >= Double.NaN) == false)
    assert((Double.MaxValue == Double.NaN) == false)
    assert((Double.MaxValue != Double.NaN) == true)
    assert((Double.MaxValue < 42.0d) == false)
    assert((Double.MaxValue <= 42.0d) == false)
    assert((Double.MaxValue > 42.0d) == true)
    assert((Double.MaxValue >= 42.0d) == true)
    assert((Double.MaxValue == 42.0d) == false)
    assert((Double.MaxValue != 42.0d) == true)
    assert((Double.MaxValue < -42.0d) == false)
    assert((Double.MaxValue <= -42.0d) == false)
    assert((Double.MaxValue > -42.0d) == true)
    assert((Double.MaxValue >= -42.0d) == true)
    assert((Double.MaxValue == -42.0d) == false)
    assert((Double.MaxValue != -42.0d) == true)
    assert((Double.MaxValue < Double.PositiveInfinity) == true)
    assert((Double.MaxValue <= Double.PositiveInfinity) == true)
    assert((Double.MaxValue > Double.PositiveInfinity) == false)
    assert((Double.MaxValue >= Double.PositiveInfinity) == false)
    assert((Double.MaxValue == Double.PositiveInfinity) == false)
    assert((Double.MaxValue != Double.PositiveInfinity) == true)
    assert((Double.MaxValue < Double.NegativeInfinity) == false)
    assert((Double.MaxValue <= Double.NegativeInfinity) == false)
    assert((Double.MaxValue > Double.NegativeInfinity) == true)
    assert((Double.MaxValue >= Double.NegativeInfinity) == true)
    assert((Double.MaxValue == Double.NegativeInfinity) == false)
    assert((Double.MaxValue != Double.NegativeInfinity) == true)
    assert((Double.MinValue < 0.0d) == true)
    assert((Double.MinValue <= 0.0d) == true)
    assert((Double.MinValue > 0.0d) == false)
    assert((Double.MinValue >= 0.0d) == false)
    assert((Double.MinValue == 0.0d) == false)
    assert((Double.MinValue != 0.0d) == true)
    assert((Double.MinValue < -0.0d) == true)
    assert((Double.MinValue <= -0.0d) == true)
    assert((Double.MinValue > -0.0d) == false)
    assert((Double.MinValue >= -0.0d) == false)
    assert((Double.MinValue == -0.0d) == false)
    assert((Double.MinValue != -0.0d) == true)
    assert((Double.MinValue < Double.MaxValue) == true)
    assert((Double.MinValue <= Double.MaxValue) == true)
    assert((Double.MinValue > Double.MaxValue) == false)
    assert((Double.MinValue >= Double.MaxValue) == false)
    assert((Double.MinValue == Double.MaxValue) == false)
    assert((Double.MinValue != Double.MaxValue) == true)
    assert((Double.MinValue < Double.MinValue) == false)
    assert((Double.MinValue <= Double.MinValue) == true)
    assert((Double.MinValue > Double.MinValue) == false)
    assert((Double.MinValue >= Double.MinValue) == true)
    assert((Double.MinValue == Double.MinValue) == true)
    assert((Double.MinValue != Double.MinValue) == false)
    assert((Double.MinValue < Double.NaN) == false)
    assert((Double.MinValue <= Double.NaN) == false)
    assert((Double.MinValue > Double.NaN) == false)
    assert((Double.MinValue >= Double.NaN) == false)
    assert((Double.MinValue == Double.NaN) == false)
    assert((Double.MinValue != Double.NaN) == true)
    assert((Double.MinValue < 42.0d) == true)
    assert((Double.MinValue <= 42.0d) == true)
    assert((Double.MinValue > 42.0d) == false)
    assert((Double.MinValue >= 42.0d) == false)
    assert((Double.MinValue == 42.0d) == false)
    assert((Double.MinValue != 42.0d) == true)
    assert((Double.MinValue < -42.0d) == true)
    assert((Double.MinValue <= -42.0d) == true)
    assert((Double.MinValue > -42.0d) == false)
    assert((Double.MinValue >= -42.0d) == false)
    assert((Double.MinValue == -42.0d) == false)
    assert((Double.MinValue != -42.0d) == true)
    assert((Double.MinValue < Double.PositiveInfinity) == true)
    assert((Double.MinValue <= Double.PositiveInfinity) == true)
    assert((Double.MinValue > Double.PositiveInfinity) == false)
    assert((Double.MinValue >= Double.PositiveInfinity) == false)
    assert((Double.MinValue == Double.PositiveInfinity) == false)
    assert((Double.MinValue != Double.PositiveInfinity) == true)
    assert((Double.MinValue < Double.NegativeInfinity) == false)
    assert((Double.MinValue <= Double.NegativeInfinity) == false)
    assert((Double.MinValue > Double.NegativeInfinity) == true)
    assert((Double.MinValue >= Double.NegativeInfinity) == true)
    assert((Double.MinValue == Double.NegativeInfinity) == false)
    assert((Double.MinValue != Double.NegativeInfinity) == true)
    assert((Double.NaN < 0.0d) == false)
    assert((Double.NaN <= 0.0d) == false)
    assert((Double.NaN > 0.0d) == false)
    assert((Double.NaN >= 0.0d) == false)
    assert((Double.NaN == 0.0d) == false)
    assert((Double.NaN != 0.0d) == true)
    assert((Double.NaN < -0.0d) == false)
    assert((Double.NaN <= -0.0d) == false)
    assert((Double.NaN > -0.0d) == false)
    assert((Double.NaN >= -0.0d) == false)
    assert((Double.NaN == -0.0d) == false)
    assert((Double.NaN != -0.0d) == true)
    assert((Double.NaN < Double.MaxValue) == false)
    assert((Double.NaN <= Double.MaxValue) == false)
    assert((Double.NaN > Double.MaxValue) == false)
    assert((Double.NaN >= Double.MaxValue) == false)
    assert((Double.NaN == Double.MaxValue) == false)
    assert((Double.NaN != Double.MaxValue) == true)
    assert((Double.NaN < Double.MinValue) == false)
    assert((Double.NaN <= Double.MinValue) == false)
    assert((Double.NaN > Double.MinValue) == false)
    assert((Double.NaN >= Double.MinValue) == false)
    assert((Double.NaN == Double.MinValue) == false)
    assert((Double.NaN != Double.MinValue) == true)
    assert((Double.NaN < Double.NaN) == false)
    assert((Double.NaN <= Double.NaN) == false)
    assert((Double.NaN > Double.NaN) == false)
    assert((Double.NaN >= Double.NaN) == false)
    assert((Double.NaN == Double.NaN) == false)
    assert((Double.NaN != Double.NaN) == true)
    assert((Double.NaN < 42.0d) == false)
    assert((Double.NaN <= 42.0d) == false)
    assert((Double.NaN > 42.0d) == false)
    assert((Double.NaN >= 42.0d) == false)
    assert((Double.NaN == 42.0d) == false)
    assert((Double.NaN != 42.0d) == true)
    assert((Double.NaN < -42.0d) == false)
    assert((Double.NaN <= -42.0d) == false)
    assert((Double.NaN > -42.0d) == false)
    assert((Double.NaN >= -42.0d) == false)
    assert((Double.NaN == -42.0d) == false)
    assert((Double.NaN != -42.0d) == true)
    assert((Double.NaN < Double.PositiveInfinity) == false)
    assert((Double.NaN <= Double.PositiveInfinity) == false)
    assert((Double.NaN > Double.PositiveInfinity) == false)
    assert((Double.NaN >= Double.PositiveInfinity) == false)
    assert((Double.NaN == Double.PositiveInfinity) == false)
    assert((Double.NaN != Double.PositiveInfinity) == true)
    assert((Double.NaN < Double.NegativeInfinity) == false)
    assert((Double.NaN <= Double.NegativeInfinity) == false)
    assert((Double.NaN > Double.NegativeInfinity) == false)
    assert((Double.NaN >= Double.NegativeInfinity) == false)
    assert((Double.NaN == Double.NegativeInfinity) == false)
    assert((Double.NaN != Double.NegativeInfinity) == true)
    assert((42.0d < 0.0d) == false)
    assert((42.0d <= 0.0d) == false)
    assert((42.0d > 0.0d) == true)
    assert((42.0d >= 0.0d) == true)
    assert((42.0d == 0.0d) == false)
    assert((42.0d != 0.0d) == true)
    assert((42.0d < -0.0d) == false)
    assert((42.0d <= -0.0d) == false)
    assert((42.0d > -0.0d) == true)
    assert((42.0d >= -0.0d) == true)
    assert((42.0d == -0.0d) == false)
    assert((42.0d != -0.0d) == true)
    assert((42.0d < Double.MaxValue) == true)
    assert((42.0d <= Double.MaxValue) == true)
    assert((42.0d > Double.MaxValue) == false)
    assert((42.0d >= Double.MaxValue) == false)
    assert((42.0d == Double.MaxValue) == false)
    assert((42.0d != Double.MaxValue) == true)
    assert((42.0d < Double.MinValue) == false)
    assert((42.0d <= Double.MinValue) == false)
    assert((42.0d > Double.MinValue) == true)
    assert((42.0d >= Double.MinValue) == true)
    assert((42.0d == Double.MinValue) == false)
    assert((42.0d != Double.MinValue) == true)
    assert((42.0d < Double.NaN) == false)
    assert((42.0d <= Double.NaN) == false)
    assert((42.0d > Double.NaN) == false)
    assert((42.0d >= Double.NaN) == false)
    assert((42.0d == Double.NaN) == false)
    assert((42.0d != Double.NaN) == true)
    assert((42.0d < 42.0d) == false)
    assert((42.0d <= 42.0d) == true)
    assert((42.0d > 42.0d) == false)
    assert((42.0d >= 42.0d) == true)
    assert((42.0d == 42.0d) == true)
    assert((42.0d != 42.0d) == false)
    assert((42.0d < -42.0d) == false)
    assert((42.0d <= -42.0d) == false)
    assert((42.0d > -42.0d) == true)
    assert((42.0d >= -42.0d) == true)
    assert((42.0d == -42.0d) == false)
    assert((42.0d != -42.0d) == true)
    assert((42.0d < Double.PositiveInfinity) == true)
    assert((42.0d <= Double.PositiveInfinity) == true)
    assert((42.0d > Double.PositiveInfinity) == false)
    assert((42.0d >= Double.PositiveInfinity) == false)
    assert((42.0d == Double.PositiveInfinity) == false)
    assert((42.0d != Double.PositiveInfinity) == true)
    assert((42.0d < Double.NegativeInfinity) == false)
    assert((42.0d <= Double.NegativeInfinity) == false)
    assert((42.0d > Double.NegativeInfinity) == true)
    assert((42.0d >= Double.NegativeInfinity) == true)
    assert((42.0d == Double.NegativeInfinity) == false)
    assert((42.0d != Double.NegativeInfinity) == true)
    assert((-42.0d < 0.0d) == true)
    assert((-42.0d <= 0.0d) == true)
    assert((-42.0d > 0.0d) == false)
    assert((-42.0d >= 0.0d) == false)
    assert((-42.0d == 0.0d) == false)
    assert((-42.0d != 0.0d) == true)
    assert((-42.0d < -0.0d) == true)
    assert((-42.0d <= -0.0d) == true)
    assert((-42.0d > -0.0d) == false)
    assert((-42.0d >= -0.0d) == false)
    assert((-42.0d == -0.0d) == false)
    assert((-42.0d != -0.0d) == true)
    assert((-42.0d < Double.MaxValue) == true)
    assert((-42.0d <= Double.MaxValue) == true)
    assert((-42.0d > Double.MaxValue) == false)
    assert((-42.0d >= Double.MaxValue) == false)
    assert((-42.0d == Double.MaxValue) == false)
    assert((-42.0d != Double.MaxValue) == true)
    assert((-42.0d < Double.MinValue) == false)
    assert((-42.0d <= Double.MinValue) == false)
    assert((-42.0d > Double.MinValue) == true)
    assert((-42.0d >= Double.MinValue) == true)
    assert((-42.0d == Double.MinValue) == false)
    assert((-42.0d != Double.MinValue) == true)
    assert((-42.0d < Double.NaN) == false)
    assert((-42.0d <= Double.NaN) == false)
    assert((-42.0d > Double.NaN) == false)
    assert((-42.0d >= Double.NaN) == false)
    assert((-42.0d == Double.NaN) == false)
    assert((-42.0d != Double.NaN) == true)
    assert((-42.0d < 42.0d) == true)
    assert((-42.0d <= 42.0d) == true)
    assert((-42.0d > 42.0d) == false)
    assert((-42.0d >= 42.0d) == false)
    assert((-42.0d == 42.0d) == false)
    assert((-42.0d != 42.0d) == true)
    assert((-42.0d < -42.0d) == false)
    assert((-42.0d <= -42.0d) == true)
    assert((-42.0d > -42.0d) == false)
    assert((-42.0d >= -42.0d) == true)
    assert((-42.0d == -42.0d) == true)
    assert((-42.0d != -42.0d) == false)
    assert((-42.0d < Double.PositiveInfinity) == true)
    assert((-42.0d <= Double.PositiveInfinity) == true)
    assert((-42.0d > Double.PositiveInfinity) == false)
    assert((-42.0d >= Double.PositiveInfinity) == false)
    assert((-42.0d == Double.PositiveInfinity) == false)
    assert((-42.0d != Double.PositiveInfinity) == true)
    assert((-42.0d < Double.NegativeInfinity) == false)
    assert((-42.0d <= Double.NegativeInfinity) == false)
    assert((-42.0d > Double.NegativeInfinity) == true)
    assert((-42.0d >= Double.NegativeInfinity) == true)
    assert((-42.0d == Double.NegativeInfinity) == false)
    assert((-42.0d != Double.NegativeInfinity) == true)
    assert((Double.PositiveInfinity < 0.0d) == false)
    assert((Double.PositiveInfinity <= 0.0d) == false)
    assert((Double.PositiveInfinity > 0.0d) == true)
    assert((Double.PositiveInfinity >= 0.0d) == true)
    assert((Double.PositiveInfinity == 0.0d) == false)
    assert((Double.PositiveInfinity != 0.0d) == true)
    assert((Double.PositiveInfinity < -0.0d) == false)
    assert((Double.PositiveInfinity <= -0.0d) == false)
    assert((Double.PositiveInfinity > -0.0d) == true)
    assert((Double.PositiveInfinity >= -0.0d) == true)
    assert((Double.PositiveInfinity == -0.0d) == false)
    assert((Double.PositiveInfinity != -0.0d) == true)
    assert((Double.PositiveInfinity < Double.MaxValue) == false)
    assert((Double.PositiveInfinity <= Double.MaxValue) == false)
    assert((Double.PositiveInfinity > Double.MaxValue) == true)
    assert((Double.PositiveInfinity >= Double.MaxValue) == true)
    assert((Double.PositiveInfinity == Double.MaxValue) == false)
    assert((Double.PositiveInfinity != Double.MaxValue) == true)
    assert((Double.PositiveInfinity < Double.MinValue) == false)
    assert((Double.PositiveInfinity <= Double.MinValue) == false)
    assert((Double.PositiveInfinity > Double.MinValue) == true)
    assert((Double.PositiveInfinity >= Double.MinValue) == true)
    assert((Double.PositiveInfinity == Double.MinValue) == false)
    assert((Double.PositiveInfinity != Double.MinValue) == true)
    assert((Double.PositiveInfinity < Double.NaN) == false)
    assert((Double.PositiveInfinity <= Double.NaN) == false)
    assert((Double.PositiveInfinity > Double.NaN) == false)
    assert((Double.PositiveInfinity >= Double.NaN) == false)
    assert((Double.PositiveInfinity == Double.NaN) == false)
    assert((Double.PositiveInfinity != Double.NaN) == true)
    assert((Double.PositiveInfinity < 42.0d) == false)
    assert((Double.PositiveInfinity <= 42.0d) == false)
    assert((Double.PositiveInfinity > 42.0d) == true)
    assert((Double.PositiveInfinity >= 42.0d) == true)
    assert((Double.PositiveInfinity == 42.0d) == false)
    assert((Double.PositiveInfinity != 42.0d) == true)
    assert((Double.PositiveInfinity < -42.0d) == false)
    assert((Double.PositiveInfinity <= -42.0d) == false)
    assert((Double.PositiveInfinity > -42.0d) == true)
    assert((Double.PositiveInfinity >= -42.0d) == true)
    assert((Double.PositiveInfinity == -42.0d) == false)
    assert((Double.PositiveInfinity != -42.0d) == true)
    assert((Double.PositiveInfinity < Double.PositiveInfinity) == false)
    assert((Double.PositiveInfinity <= Double.PositiveInfinity) == true)
    assert((Double.PositiveInfinity > Double.PositiveInfinity) == false)
    assert((Double.PositiveInfinity >= Double.PositiveInfinity) == true)
    assert((Double.PositiveInfinity == Double.PositiveInfinity) == true)
    assert((Double.PositiveInfinity != Double.PositiveInfinity) == false)
    assert((Double.PositiveInfinity < Double.NegativeInfinity) == false)
    assert((Double.PositiveInfinity <= Double.NegativeInfinity) == false)
    assert((Double.PositiveInfinity > Double.NegativeInfinity) == true)
    assert((Double.PositiveInfinity >= Double.NegativeInfinity) == true)
    assert((Double.PositiveInfinity == Double.NegativeInfinity) == false)
    assert((Double.PositiveInfinity != Double.NegativeInfinity) == true)
    assert((Double.NegativeInfinity < 0.0d) == true)
    assert((Double.NegativeInfinity <= 0.0d) == true)
    assert((Double.NegativeInfinity > 0.0d) == false)
    assert((Double.NegativeInfinity >= 0.0d) == false)
    assert((Double.NegativeInfinity == 0.0d) == false)
    assert((Double.NegativeInfinity != 0.0d) == true)
    assert((Double.NegativeInfinity < -0.0d) == true)
    assert((Double.NegativeInfinity <= -0.0d) == true)
    assert((Double.NegativeInfinity > -0.0d) == false)
    assert((Double.NegativeInfinity >= -0.0d) == false)
    assert((Double.NegativeInfinity == -0.0d) == false)
    assert((Double.NegativeInfinity != -0.0d) == true)
    assert((Double.NegativeInfinity < Double.MaxValue) == true)
    assert((Double.NegativeInfinity <= Double.MaxValue) == true)
    assert((Double.NegativeInfinity > Double.MaxValue) == false)
    assert((Double.NegativeInfinity >= Double.MaxValue) == false)
    assert((Double.NegativeInfinity == Double.MaxValue) == false)
    assert((Double.NegativeInfinity != Double.MaxValue) == true)
    assert((Double.NegativeInfinity < Double.MinValue) == true)
    assert((Double.NegativeInfinity <= Double.MinValue) == true)
    assert((Double.NegativeInfinity > Double.MinValue) == false)
    assert((Double.NegativeInfinity >= Double.MinValue) == false)
    assert((Double.NegativeInfinity == Double.MinValue) == false)
    assert((Double.NegativeInfinity != Double.MinValue) == true)
    assert((Double.NegativeInfinity < Double.NaN) == false)
    assert((Double.NegativeInfinity <= Double.NaN) == false)
    assert((Double.NegativeInfinity > Double.NaN) == false)
    assert((Double.NegativeInfinity >= Double.NaN) == false)
    assert((Double.NegativeInfinity == Double.NaN) == false)
    assert((Double.NegativeInfinity != Double.NaN) == true)
    assert((Double.NegativeInfinity < 42.0d) == true)
    assert((Double.NegativeInfinity <= 42.0d) == true)
    assert((Double.NegativeInfinity > 42.0d) == false)
    assert((Double.NegativeInfinity >= 42.0d) == false)
    assert((Double.NegativeInfinity == 42.0d) == false)
    assert((Double.NegativeInfinity != 42.0d) == true)
    assert((Double.NegativeInfinity < -42.0d) == true)
    assert((Double.NegativeInfinity <= -42.0d) == true)
    assert((Double.NegativeInfinity > -42.0d) == false)
    assert((Double.NegativeInfinity >= -42.0d) == false)
    assert((Double.NegativeInfinity == -42.0d) == false)
    assert((Double.NegativeInfinity != -42.0d) == true)
    assert((Double.NegativeInfinity < Double.PositiveInfinity) == true)
    assert((Double.NegativeInfinity <= Double.PositiveInfinity) == true)
    assert((Double.NegativeInfinity > Double.PositiveInfinity) == false)
    assert((Double.NegativeInfinity >= Double.PositiveInfinity) == false)
    assert((Double.NegativeInfinity == Double.PositiveInfinity) == false)
    assert((Double.NegativeInfinity != Double.PositiveInfinity) == true)
    assert((Double.NegativeInfinity < Double.NegativeInfinity) == false)
    assert((Double.NegativeInfinity <= Double.NegativeInfinity) == true)
    assert((Double.NegativeInfinity > Double.NegativeInfinity) == false)
    assert((Double.NegativeInfinity >= Double.NegativeInfinity) == true)
    assert((Double.NegativeInfinity == Double.NegativeInfinity) == true)
    assert((Double.NegativeInfinity != Double.NegativeInfinity) == false)
  }
}
