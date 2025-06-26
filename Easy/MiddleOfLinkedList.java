class Solution {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> array = new ArrayList<>();
        int l = 0;
        while(head != null) {
            array.add(head);
            head = head.next; 
            ++l; 
        }
        return array.get(l / 2);
    }
}
