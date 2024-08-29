
// Question : https://www.youtube.com/watch?v=WMxNhIBA92I&list=PL-Jc9J83PIiFc7hJ5eeCb579PS8p-en4f&index=6 

class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int result[] = new int[n + m];
        int i = 0 , j = 0, k = 0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                result[k] = a[i];
                i++;
                k++;
            } else {
                result[k] = b[j];
                j++;
                k++;
            }
        }

        while(i < a.length){
            result[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            result[k] = b[j];
            j++;
            k++;
        }
    
    }
   
}