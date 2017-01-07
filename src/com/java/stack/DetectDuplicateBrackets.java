package com.java.stack;

public class DetectDuplicateBrackets {

	public static boolean detectDupBrac(String exp){
		boolean flag = false;
		
		StackG<String> stack = new StackG(exp.length());
		
		for(int i=0; i<exp.length(); i++){
			char tmp = exp.charAt(i);
			if(tmp+"" == ")"){
				if(stack.peek().equals("(")){
					flag = true;
					break;
				}else{
					while(!stack.pop().equals("(")){}
				}
				
			}else{
				stack.push(tmp+"");
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		String exp1 = "((a+b)+((c+d)))";
		String exp2 = "(((a+(b)))+(c+d))";
		String exp3 = "((a+(b))=(c+d))";
		System.out.println(exp1+" : "+detectDupBrac(exp1));
		System.out.println(exp2+" : "+detectDupBrac(exp2));
		System.out.println(exp3+" : "+detectDupBrac(exp3));
	}

}
