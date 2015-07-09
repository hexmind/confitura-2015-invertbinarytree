# [Confitura 2015](http://tech.viacom.com/warsawsdc/confitura2015/)
## Invert a Binary Tree

Invert a binary tree.

```
     1
   /   \
  2     3
 / \   / \
4   5 6   7
```
to
```
     1
   /   \
  3     2
 / \   / \
7   6 5   4
```

Data structures:

Scala:
```scala
case class TreeNode(value: Int, left: Option[TreeNode], right: Option[TreeNode])
```

## Solution
See [TreeNode.invert(tree: TreeNode)](src/main/scala/pl/ts/TreeNode.scala)