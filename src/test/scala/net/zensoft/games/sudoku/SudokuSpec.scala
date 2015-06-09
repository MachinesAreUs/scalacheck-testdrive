import net.zensoft.games.sudoku.Sudoku
import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen

object SudokuSpecification extends Properties("Sudoku") {

  property("all rows have the 9 digits") = forAll { (problem: Array[Array[Integer]]) =>
    val sudoku = new Sudoku(problem)
    sudoku != null
  }

  property("all columns have the 9 digits") = forAll { (problem: Array[Array[Integer]]) =>
    problem.sortWith(_.size < _.size).size == problem.size
  }
  
  //implicit def intToInteger(i: Int) = i:java.lang.Integer
  
  def getInteger: Gen[Integer] = Gen.choose(1:java.lang.Integer, 9:java.lang.Integer)

}

