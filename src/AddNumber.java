



public class AddNumber {
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	         val = x;
	         next = null;
	      }
	  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode iterator1=l1,iterator2=l2;
        
        ListNode riterator=null;
        ListNode result=null;
        int c = 0;
        
        if(iterator1!=null||iterator2!=null||c!=0){
            
            result= new ListNode(0);
            riterator = result;
            do{
                int val=0;
                if(riterator == null)
                riterator = new ListNode(0);
                if(iterator1!=null && iterator2!=null){
           val  = iterator1.val + iterator2.val+c;
             c = val/10;
            val = val%10;
          
            iterator1 = iterator1.next;
            iterator2 = iterator2.next;
                }else if(iterator1!=null){
                    val = iterator1.val +c;
                     c = val/10; 
                 val = val%10;
              
               iterator1 = iterator1.next;
                }else if(iterator2!=null){
                    val = iterator2.val +c;
                       c = val/10; 
                 val = val%10;
            
                iterator2 = iterator2.next;
                }
                else{
                    val = c;
                    c=0;
                }
            riterator.val = val;
            riterator = riterator.next;
            
            }while(iterator1!=null||iterator2!=null||c!=0);
            return result;
        }
        return null;
        
    }
    public static void main(String[] args) {
		
	}
}