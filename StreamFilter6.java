package hcl.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter6 {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(5);
		al.add(15);
		int li=al.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println(li);

	}

}