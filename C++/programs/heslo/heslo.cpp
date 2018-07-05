#include <iostream>
using namespace std;
int main()
{
  int a;
  cout << "PROGRAM HESLO\nZadajte heslo: ";
  cin >> a;
  if (a == 753951)
   cout << "\nHeslo potvrdene.";
  else
   cout << "\nHeslo je zle!";
  cin.get();
  cin.get();
  return 0;
}
