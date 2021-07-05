package com.example.demo;

public class RomanDecimal {
		public static void main(String[] args) {
			String roman="VII";
					char[] romanChar=roman.toCharArray();
			int dec=0;
					for(int i=romanChar.length-1;i>=0;i=i-2)
					{
						if(i>0)
						{
							if(value(romanChar[i-1])>=value(romanChar[i]))
							{
								dec=dec+value(romanChar[i]);
								dec=dec+value(romanChar[i-1]);
							}
								
							else
							{
								dec=dec+value(romanChar[i]);
								dec=dec-value(romanChar[i-1]);

							}
														}
						
					}
					System.out.println(dec);
		}
	static int value(char a)
	{
		switch(a)
		{
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'M':
			return 1000;
		default :
			return 0;
			
		}
	}

}
