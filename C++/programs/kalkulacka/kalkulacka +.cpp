#include <iostream>
using namespace std;
int fa()
{
  int a;
  cout << "KALKULACKA\n==========\n\nZadajte 1. cislo: ";
  cin >> a;
  int b;
  cout << "Zadajte 2. cislo: ";
  cin >> b;
  cout << "\nSucet 1. a 2. cisla je:\n\n" << a+b << "\n\n";
  fa();
}
int main()
{ 
  fa();
  cin.get();cin.get();
  return 0;
}
