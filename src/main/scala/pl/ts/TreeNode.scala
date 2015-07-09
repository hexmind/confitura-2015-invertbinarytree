package pl.ts

case class TreeNode(value: Int, left: Option[TreeNode], right: Option[TreeNode])

object TreeNode {

  def apply(value: Int): TreeNode = TreeNode(value, Option.empty, Option.empty)

  def apply(value: Int, l: TreeNode, r: TreeNode): TreeNode = TreeNode(value, Option(l), Option(r))

  def invert(tree: TreeNode): TreeNode = {
    val left = invert(tree.left)
    val right = invert(tree.right)
    TreeNode(tree.value, right, left)
  }

  private def invert(treeOpt: Option[TreeNode]): Option[TreeNode] = for (t <- treeOpt) yield invert(t)
}


