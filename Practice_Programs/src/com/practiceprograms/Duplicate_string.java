package com.practiceprograms;

public class Duplicate_string
{
	java.lang.String str = "beautiful beach";
    char[] carray = str.toCharArray();
        System.out.print("Duplicate Characters in above string are: ");
    for (int i = 0; i < str.length(); i++) {
       for (int j = i + 1; j < str.length(); j++) {
          if (carray[i] == carray[j]) {
             System.out.print(carray[j] + " ");
             break;
          }
       }
	/*java.lang.String c="New life";
	char a[]=c.toCharArray();
	for(int i=0;i<=a[i];i++)
	{
		System.out.println(a[i]);
	}*/

}
}
