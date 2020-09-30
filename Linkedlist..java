import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int d)
	{
	data=d;
	}
}
class operation
{Node start;
	void insertfirst(int d)
	{   
		
		Node newnode=new Node(d);
		newnode.next=start;
		start=newnode;

	}
	void deletefirst()

	{
		//System.out.println(start);
		if(start==null)
		System.out.println("empty list");
		else
		start=start.next;
	}
	void display()
	{
		Node ptr;
		ptr=start;
		if(ptr==null)
		{
			System.out.println("empty list");
			return;
		}
		while(ptr!=null)
		{
			System.out.println(ptr.data+"\n");
			ptr=ptr.next;
		}
	}
 
 	void delete_node(int key)
       {
    	if(start==null)
    	{
    		System.out.println("empty list");
    		return;
    	}
    	if(start.data==key)
    	{
    		start=start.next;
    		return;
    	}
    	Node ptr=start;
    	while(ptr.next!=null)
    	{
    		if(ptr.next.data==key)
    		{
    			ptr.next=ptr.next.next;
    			return;
    		}
    		ptr=ptr.next;
    	}
    	System.out.println("key is not found");
      }
	void insertafter(int key,int data)
	{
		if(start==null)
		{
			System.out.println("empty");
			return;
        }
        Node ptr=start;
        while(ptr!=null)
        {
        	if(ptr.data==key)
        		{
        			Node newnode=new Node(data);
        			newnode.next=ptr.next;
        			ptr.next=newnode;
        			return;
                }
                ptr=ptr.next;
        }
        System.out.println("key not found");
	}
	void insert_last(int dt)
    {
    	Node newnode=new Node(dt);
    	if(start==null)
    	{
    		start=newnode;
    		return;
    	}
    	Node ptr=start;
    	while(ptr.next!=null)
    		ptr=ptr.next;
    	   ptr.next=newnode;
    }
    void delete_last()
    {
    	if(start==null)
    	{
    		System.out.println("empty list");
    		return;
    	}
    	if(start.next==null)
    	{
    		start=null;
    		return;
    	}
    	Node ptr=start;
    	while(ptr.next.next!=null)
    		ptr=ptr.next;
    	ptr.next=null;
    }
   
}
class linkedlist1
{
	public static void main(String args[])
	{
		int ch;
		Scanner s=new Scanner(System.in);
		operation o=new operation();
		do
		{
			System.out.println("1.insert\n2.delete\n3.display\n4.insertafter\n5.insert_last\n6.delete_last\n7.deletenode\n8.exit");
			ch=s.nextInt();
			switch(ch)
			{ 
				case 1:
				      System.out.println("enter data");
				      int data=s.nextInt();
				      o.insertfirst(data);
				      int data2=s.nextInt();
				      o.insertfirst(data2);
                      break;
				case 2:
				       o.deletefirst();
				       break;
				 case 3:
				        o.display();
				        break;
				  case 4:
				  		 System.out.println("enter key");
				  		 int key=s.nextInt();
				  		 System.out.println("enter data");
				  		 int data1=s.nextInt();
				  		 o.insertafter(key,data1);
				  		 break;
				 case 5:
				        System.out.println("enter a data");
				        int dt=s.nextInt();
				        o.insert_last(dt);
				        break;
				 case 6:
				        o.delete_last();
				        break;
					
				case 7:
				        System.out.println("enter a key");
				        int db=s.nextInt();
				        o.delete_node(db);
				        break;
				 
            }
		}while(ch<7);
	}
}
