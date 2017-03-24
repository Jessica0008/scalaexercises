object pascal {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(141); 
  def pascaltriangle(c: Int, r: Int): Int={
    if(c==0 || c==r) 1
    else pascaltriangle(c-1,r-1)+pascaltriangle(c,r-1)
  };System.out.println("""pascaltriangle: (c: Int, r: Int)Int""");$skip(22); val res$0 = 
  pascaltriangle(2,4);System.out.println("""res0: Int = """ + $show(res$0))}

}
