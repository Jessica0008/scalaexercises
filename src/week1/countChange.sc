object countChange {
  def countChange(money: Int, coins: List[Int]): Int={
    if(money==0)
      1
    else if(money>0 && !coins.isEmpty)
      countChange(money-coins.head,coins)+countChange(money,coins.tail)
    else
      0
  }                                               //> countChange: (money: Int, coins: List[Int])Int
  countChange(3,List(1,2))                        //> res0: Int = 2
  countChange(5,List(1,2))                        //> res1: Int = 3
}