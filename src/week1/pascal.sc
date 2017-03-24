object pascal {
  def pascaltriangle(c: Int, r: Int): Int={
    if(c==0 || c==r) 1
    else pascaltriangle(c-1,r-1)+pascaltriangle(c,r-1)
  }                                               //> pascaltriangle: (c: Int, r: Int)Int
  pascaltriangle(2,4)                             //> res0: Int = 6

}