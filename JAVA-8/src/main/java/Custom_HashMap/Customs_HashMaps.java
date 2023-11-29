package Custom_HashMap;

import java.util.ArrayList;

public class Customs_HashMaps
{
    public static class Nodes
    {
        static Nodes head;
        int value;
        int key;
        Nodes next;
        Nodes(int key,int val)
        {
            this.value = val;
            this.key= key;
            this.next=null;
        }
    }
    static int computeHashCode(int val)
    {
        return val%100;
    }
    static boolean put(int key,int value,ArrayList<Nodes> customMap)
    {
        int index = computeHashCode(key);
        Nodes temp = customMap.get(index);
        if(temp==null)
        {
            temp = new Nodes(-1,-1);
        }
        while (temp.next!=null)
        {
            if(temp.key==key)
            {
                temp.value=value;
            }
            temp=temp.next;
        }
        Nodes node = new Nodes(key,value);
        temp.next=node;
        return true;
    }
    static int get(int key,ArrayList<Nodes> customMap)
    {
        int index = computeHashCode(key);
        Nodes temp = customMap.get(index);
        while (temp!=null)
        {
            if(temp.key==key)
            {
                return temp.value;
            }
            temp=temp.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Nodes> customMap = new ArrayList<>();
        //Initializing the map :
        for(int i=0;i<100;i++)
        {
            customMap.add(new Nodes(-1,-1));
        }
        int key = 9;
        int val = 10;
        if(key!=0)
        {
            put(key,val,customMap);
        }
        System.out.println(get(key,customMap));
    }
}
