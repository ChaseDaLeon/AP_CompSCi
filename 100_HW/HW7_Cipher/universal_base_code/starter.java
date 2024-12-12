/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String code = "21 xs uvvy5 q21r 2vx5nvsz n9r o5sl 4pw rvssl 4vs qpsw1w3 q21r 1w y9q5 9yrv 1 79w wvq 41w6 vpq wpx85s c";
		int a = 0;
		while(a<37){
			String q = (Cipher.keyedEncode(code, a));
			System.out.println(q);
			a++;
		}

	}
}
