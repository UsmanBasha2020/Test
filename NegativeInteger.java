import java.io.*;
import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.Collectors;

public class NegativeInteger{
	public static void main(String[] args){

		int i = Integer.parseInt(args[0]);
		//int y = Integer.parseInt(args[1]);
		
		//int i= -10;
		
		System.out.println(Math.abs(i)+" "+i);

		String result = "5"+String.valueOf(Math.abs(i));

		int output =0;
		if(i >= 0){
			output = Integer.parseInt(result);
		}else{
			output = Integer.parseInt(result);
			output = -output;
		}

		System.out.println("The added result is: "+output);

 		ArrayList<Integer> arrL = new ArrayList<Integer>(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add(3); 
        arrL.add(4); 
  
        // Using lambda expression to print all elements 
        // of arrL 
        arrL.forEach(n -> System.out.println(n)); 
  
        // Using lambda expression to print even elements 
        // of arrL 
        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); }); 

        List<Integer> list = Arrays.asList(1,2,3,2,1);
        list.forEach(j -> System.out.println(j));


		String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik"};
		List<String> intr = IntStream.range(0, names.length)
         .filter(k -> k < 2)
         .mapToObj(k -> names[k])
         .collect(Collectors.toList());

        System.out.println(intr);

        Integer temp[] = {1,2,3,4,56,66};
        List<Integer> t1 =IntStream.range(0,temp.length)
        					.filter(l -> l < 3)
        					.mapToObj(l -> temp[l])
        					.collect(Collectors.toList());
        System.out.println(t1);

        Integer temp1[] = {1,2,3,4,56,66,68};
       	Integer t2 =IntStream.range(0,temp1.length-1)
        					.filter(l -> l < 3)
        					.reduce(0,(l,n) -> sumis(temp1[l],n));
        					
        System.out.println("The sum of list is: "+t2);

        List<Integer> list1 = IntStream.range(0,temp1.length)
        						.filter(m -> m < 6)
        						.mapToObj(m -> temp1[m])
        						.collect(Collectors.toList());
       	System.out.println("list1 is: "+list1.stream().reduce(0, (p,q) -> p+q));


       	List<Integer> list3 = Arrays.asList(1,2,3,2,1);
       	list3.stream().filter(r -> r%2 != 0).forEach(System.out::println);

       	System.out.println("11111111111111111");
       	System.out.println(list3.stream().filter(r -> r%2 !=0).findFirst().orElse(0));
		System.out.println("22222222222222222");
       	list3.stream().forEach(s -> {
       		if(s==3){
       			return;
       		}
       		System.out.println(s);
       	});

	}

	public static int sumis(int i, int j){
		System.out.println("111111 "+i+" "+j);
		return i+j;
	}

	
}