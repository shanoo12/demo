package com.example.demo;

import java.util.Stack;

public class DoBackSpace {
public static void main(String[] args) {
	String S="1#";
	String T="";
	boolean check=true;
	Stack<Character> s1=new Stack<Character>();
	Stack<Character> s2=new Stack<Character>();
	for(char s:S.toCharArray()) {
		if(s=='#')
		{
            if(!s1.empty())
			s1.pop();
		}else {
			s1.add(s);
		}
	}
	for(char s:T.toCharArray()) {
		if(s=='#')
		{
            if(!s2.empty())
			s2.pop();
		}else {
			s2.add(s);
		}
	}
	if(s1.size()!=s2.size())
		check=false;
	while(!s1.empty()&&!s2.empty())
	{
		if(s1.pop()!=s2.pop())
			check= false;
	}
	
	
	System.out.println("check "+check);
    }

}
