package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	public static void main(String[] args) {
		List<String> palindrome=new ArrayList<String>();
		String a="kztakrekvefgchersuoiuatzlmwynzjhdqqftjcqmntoyckqfawikkdrnfgbwtdpbkymvwoumurjdzygyzsbmwzpcxcdmmpwzmeibligwiiqbecxwyxigikoewwrczkanwwqukszsbjukzumzladrvjefpegyicsgctdvldetuegxwihdtitqrdmygdrsweahfrepdcudvyvrggbkthztxwicyzazjyeztytwiyybqdsczozvtegodacdokczfmwqfmyuixbeeqluqcqwxpyrkpfcdosttzooykpvdykfxulttvvwnzftndvhsvpgrgdzsvfxdtzztdiswgwxzvbpsjlizlfrlgvlnwbjwbujafjaedivvgnbgwcdbzbdbprqrflfhahsvlcekeyqueyxjfetkxpapbeejoxwxlgepmxzowldsmqllpzeymakcshfzkvyykwljeltutdmrhxcbzizihzinywggzjctzasvefcxmhnusdvlderconvaisaetcdldeveeemhugipfzbhrwidcjpfrumshbdofchpgcsbkvaexfmenpsuodatxjavoszcitjewflejjmsuvyuyrkumednsfkbgvbqxfphfqeqozcnabmtedffvzwbgbzbfydiyaevoqtfmzxaujdydtjftapkpdhnbmrylcibzuqqynvnsihmyxdcrfftkuoymzoxpnashaderlosnkxbhamkkxfhwjsyehkmblhppbyspmcwuoguptliashefdklokjpggfiixozsrlwmeksmzdcvipgkwxwynzsvxnqtchgwwadqybkguscfyrbyxudzrxacoplmcqcsmkraimfwbauvytkxdnglwfuvehpxd";
		StringBuilder sb=new StringBuilder();
		String rev="";
		for(int i=0;i<a.length();i++)
		{
			for(int j=i;j<=a.length();j++)
			{
				rev=sb.append(a.substring(i, j)).reverse().toString();
				if(a.substring(i, j).equals(rev))
					palindrome.add(a.substring(i, j));
				
				sb.delete(0, a.length());
			}
		}
		int size=0;int index=0;
		for(int i=0;i<palindrome.size();i++)
		{
			if(palindrome.get(i).length()>size)
			{
				size=palindrome.get(i).length();
				index=i;
			}
				
		}
		System.out.println(palindrome.get(index));
		System.out.println(palindrome);
				}

}
