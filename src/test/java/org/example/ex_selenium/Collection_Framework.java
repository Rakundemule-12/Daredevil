package org.example.ex_selenium;

import java.util.HashMap;
import java.util.Map;

public class Collection_Framework {

    public static void main(String[] args) {
//        ArrayList  a = new ArrayList();
//        a.add("ABC");
//        a.add("BCD");
//        a.add(1234);
//        a.add(true);
////        System.out.println(a.contains("ABC"));
////        System.out.println(a.indexOf("ABC"));
////          a.clear();
////        System.out.println(a.isEmpty());
////        System.out.println(a.size());
////        for (int i = 0; i <a.size() ; i++)
////        {
////            System.out.println(a.get(i));
////
////        }
//        System.out.println(a.set(1,"Mahi"));
//        System.out.println(a);

//        System.out.println(a);
//        System.out.println(a.get(2));

//    ArrayList<Integer> b = new ArrayList<>();
//       b.addAll(Arrays.asList(4,6,8,9,1,3,5,2));
////        System.out.println(b);
//        Collections.reverse(b);
//        System.out.println(b);

//        LinkedList a = new LinkedList();
//        a.add("Ananya");
//        a.add("Pavan");
//        a.add("Keerti");
//        a.add("Anjana");
//        a.add("Pandurang");
//        System.out.println(a);
//        Collections.sort(a);
//        System.out.println(a);
//        a.addAll(Arrays.asList("AAAA","BBB","DDDDD"));
//        System.out.println(a);
//        System.out.println(a.indexOf("BBB"));
//
//        for (int i = 0; i<a.size() ; i++)
//        {
//            System.out.print(a.get(i));
//            System.out.print(" ");
//        LinkedHashSet h = new LinkedHashSet();
//        h.add("Kavi");
//        h.add("Meera");
//        h.add("zero");
//        h.add("Keera");
//        h.add("Keera");
//        h.add(null);
//        h.remove(null);
//
//        System.out.println(h);
//
//        Iterator itr = h.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(3,"dsdsd");
        hm.put(6,"fdfdf");
        hm.put(2,"bvbbv");
        hm.put(1,"hjyud");
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        System.out.println(hm.containsKey(6));
        System.out.println(hm.containsValue("bvbbv"));
        System.out.println(hm.containsValue("hjyud"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.get(2));
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(104,"Ravi");
        map.putAll(hm);
        System.out.println(map);

        for(Map.Entry<Integer,String> item: hm.entrySet()){
            System.out.println(item.getKey() + " -> "+ item.getValue());
        }

        }
    }


