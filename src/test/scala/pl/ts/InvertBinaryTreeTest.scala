package pl.ts

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner
import pl.ts.TreeNode.invert

@RunWith(classOf[JUnitRunner])
class InvertBinaryTreeTest extends FunSuite {

  val T4 = TreeNode(4)
  val T5 = TreeNode(5)
  val T6 = TreeNode(6)
  val T7 = TreeNode(7)
  val T2_45 = TreeNode(2, T4, T5)
  val T3_67 = TreeNode(3, T6, T7)
  val T2_54 = TreeNode(2, T5, T4)
  val T3_76 = TreeNode(3, T7, T6)
  /**
   * 1
   * /   \
   * 2     3
   * / \   / \
   * 4   5 6   7
   */
  val T1_23_4567 = TreeNode(1, T2_45, T3_67)
  /**
   * 1
   * /   \
   * 3     2
   * / \   / \
   * 7   6 5   4
   */
  val T1_32_7654 = TreeNode(1, T3_76, T2_54)

  test("A inverted leaf should be same") {
    assert(invert(T4) === T4)
  }

  test("A inverted leafs parent should has inverted leafs") {
    assert(invert(T2_45) === T2_54)
  }

  test("A example tree should be all inverted") {
    assert(invert(T1_23_4567) === T1_32_7654)
  }
}
