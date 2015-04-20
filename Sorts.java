import java.util.*;
import java.util.Arrays;

public class Sorts{

  public void selectionSort(int[] list){

    int index=0;
    for(int i = 0; i<list.length-1; i++){
      for(int a = i+1; a<list.length; a++){
        if(list[a]<list[index]){
          index = a;
        }
      }
      int temp = list[index];
      list[index] = list[i];
      list[i] = temp;
    }
  }
  public void bubbleSort(int[] list){
    for(int outer=list.length-1; outer>0;outer--){
      for(int inner=0; inner<outer; inner++){
        if(list[inner]>list[inner+1]){
          int temp = list[inner];
          list[inner]=list[inner+1];
          list[inner+1]=temp;
        }
      }
    }
  }
  public void insertionSort(int[] list){
    int temp;
    if(list.length<=1)
      return;

    for(int i = 1; i<list.length; i++){
      for(int a=i; a>0; a--){
        if(list[a-1]<list[a])
          break;
        temp=list[a-1];
        list[a-1]=list[a];
        list[a]=temp;
      }
    }
  }

  private void merge(int[] a, int first, int mid, int last){
    int[] temp = new int[last-first+1];
    int index=0;
    int f = first;
    int m = mid;
    while(f<mid || m<=last){
      if((f<mid) && (m>last || a[f] < a[m])){
        temp[index]=a[f];
        f++;
      } else {
        temp[index]=a[m];
        m++;
      }
      index++;
    }
    for(int i = 0; i<temp.length; i++){
      a[first+i]=temp[i];
    }
  }

  public void mergeSort(int[] a, int first, int last){
    if (first < last) {
      int middle = first + (last - first) / 2;
      mergeSort(a,first, middle);
      mergeSort(a, middle + 1, last);
      merge(a, first, middle+1, last);
    }
  }

