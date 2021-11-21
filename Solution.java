//Justin Butler
// 11/20/2021

class Solution {
    public ListNode partition(ListNode head, int x) {
        List<Integer> greater = new ArrayList<>();
        ListNode root = new ListNode(0);
        ListNode curr = root;
        //1. We traverse the list for all values
        while(head != null)
        {
            //2. When the value is less than are targest, we add it to our newly constructed linked-list.
            if(head.val < x)
            {
                curr.next = new ListNode(head.val);
                curr = curr.next;
                
            }
            //3. We will append it to the end, in its normal order if its not
            else
            {
                greater.add(head.val);
            }
            head = head.next;
        }
        //4. Append our remaining values.
        for(int i : greater)
        {
                curr.next = new ListNode(i);
                curr = curr.next;
        }
        return root.next;
    }
}
