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
  public static void merge( SortableLinkedList original, SortableLinkedList[]buckets){
    for (int i =0;i<buckets.length;i++){
      original.extend(buckets[i]);
    }
  }
  public static void radixSortSimple(SortableLinkedList data){
    int counter=0;
    for (int i=0;i< data.size();i++){
      if (counter<data.get(i)){
        counter=data.get(i);

      }
    }
    int i =0;
    SortableLinkedList buckets[]=new SortableLinkedList[10];
    for (int b=0;b<buckets.length;b++){
      buckets[b]=new SortableLinkedList();
    }
    while (i<length(counter)){
       while (data.size()>0){
         int x=data.remove(0);
        int index= nth(x,i);
        buckets[index].add(x);
       }
       merge(data,buckets);
          i++;
    }
  }
  public static void radixSort(SortableLinkedList data){

  }
}
