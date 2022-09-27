package LinkedListandMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Nuts_Bolts {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
        char nuts[] = new char[n];
        char bolts[] = new char[n];
        
        for(int i = 0; i < n; i++) {
          nuts[i] = s.next().charAt(0);
        }
        
        for(int i = 0; i < n; i++) {
            bolts[i] = s.next().charAt(0);
        }
        Map<Character, List<Integer>> hm = map(nuts, bolts, n);
        System.out.println(hm);
        s.close();
	}
	static Map<Character, List<Integer>> map(char[] nuts, char[] bolts,int n) {
        Map<Character, List<Integer>> hm = new HashMap<>();
        for(int i = 0; i < n; i++) {
        	hm.put(nuts[i], new LinkedList<>());
        	hm.get(nuts[i]).add(i);
        }
        for(int i = 0; i < n; i++) {
        	hm.get(bolts[i]).add(i);
        }
        return hm;
	}
}
