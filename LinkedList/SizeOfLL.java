// Link : https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-nodes-of-linked-list

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        
        int count =0;
        Node temp= head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}