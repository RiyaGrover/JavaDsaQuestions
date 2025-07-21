// Link : https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-linked-list-1664434326

class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        if(n == 0){
            return false;
        }
        
        Node current = head;
        while(current != null){
            if(current.data == key){
                return true;
        }
        current = current.next;
        
    }
    return false;
  }