object countChange {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(232); 
  def countChange(money: Int, coins: List[Int]): Int={
    if(money==0)
      1
    else if(money>0 && !coins.isEmpty)
      countChange(money-coins.head,coins)+countChange(money,coins.tail)
    else
      0
  };System.out.println("""countChange: (money: Int, coins: List[Int])Int""");$skip(27); val res$0 = 
  countChange(3,List(1,2));System.out.println("""res0: Int = """ + $show(res$0));$skip(27); val res$1 = 
  countChange(5,List(1,2));System.out.println("""res1: Int = """ + $show(res$1))}
}
