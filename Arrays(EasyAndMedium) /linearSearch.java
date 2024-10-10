// Linear search - just iterate and return the index when u find the required number

for(int i = 0 ; i < n ; i++){
    if(arr[i] == num){
        return i ;
    }
    return -1;
}