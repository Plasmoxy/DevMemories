#include <iostream>
using namespace std;
int main()
{
  string a = "sebo";
  string b;
  cout << "HESLO 2\n\nZadajte heslo: ";
  cin >> b;
  if (b == a)
   cout << "\nHeslo potvrdene.";
  else
   cout << "\nHeslo nespravne.";
  cin.get();cin.get();
  return 0;
}
