#include<stdio.h>
#include<string.h>
 
int main()
{
   char string[100];
   int c = 0, count[26] = {0};
 
  scanf(" %[^\n]s",string);
 
   while ( string[c] != '\0' )
   {
      if ( string[c] >= 'a' && string[c] <= 'z' ) 
         count[string[c]-'a']++;
 
      c++;
   }
   for ( c = 0 ; c < 26 ; c++ )
   {
      if( count[c] != 0 )
         printf("%c%d ",c+'a',count[c]);
   }
 
   return 0;
}
 