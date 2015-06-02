import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object SudokuSpecification extends Properties("Sudoku") {

  property("startsWith") = forAll { (a: String, b: String) =>
    (a+b).startsWith(a)
  }

}

