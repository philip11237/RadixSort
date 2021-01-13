public class Radix{
public static int nth(int n, int col){
    if (n<0){
      n=n*-1;
    }
    for (int i =0;i<col;i++){
      n= n/10;
    }
    return n % 10;
  }
  public static int length(int n){
    int counter=0;
    if (n==0){
      return 1;
    }
    while (n>0){
    n= n/10;
      counter++;
    }return counter;
  }
  public static void merge(MyLinkedList original,MyLinkedList[]buckets){
    for (int i =0;i<buckets.length;i++){
        original.extend(buckets[i]);
    }
  }
}
