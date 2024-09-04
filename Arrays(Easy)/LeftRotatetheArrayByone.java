

temp = arr[1];

for(int i =1 ; i < n ; i++){
    arr[i-1] = arr[i];
}
arr[n-1] = temp;


