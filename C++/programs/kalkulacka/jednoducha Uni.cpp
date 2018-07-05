#include <iostream>
using namespace std;
int fplus()
{
  int a;
  cout << "\nZadajte 1. cislo: ";
  cin >> a;
  int b;
  cout << "\nZadajte 2. cislo: ";
  cin >> b;
  cout << "\n====================\n\n" << a+b << "\n\n";
  fplus();
}
int fminus()
{
  int a;
  cout << "\nZadajte 1. cislo: ";
  cin >> a;
  int b;
  cout << "\nZadajte 2. cislo: ";
  cin >> b;
  cout << "\n====================\n\n" << a-b << "\n\n";
  fminus();
}
int fkrat()
{
  int a;
  cout << "\nZadajte 1. cislo: ";
  cin >> a;
  int b;
  cout << "\nZadajte 2. cislo: ";
  cin >> b;
  cout << "\n====================\n\n" << a*b << "\n\n";
  fkrat();
}
int fdelene()
{
  int a;
  cout << "\nZadajte 1. cislo: ";
  cin >> a;
  int b;
  cout << "\nZadajte 2. cislo: ";
  cin >> b;
  cout << "\n====================\n\n" << a/b << "\n\n";
  fdelene();
}
int mimo()
{
 cout << "\nMimo moznosi!!!\n";
}
int main()
{ 
  cout << "Kalkulacka +-*/\n===============\n\nZadajte:\n1 - pre scitanie\n2 - pre odcitanie\n3 - pre nasobenie\n4 - pre delenie.\n\nVolba: ";
  int za;
  cin >> za;
  cout << "\n";
  if (za == 1) fplus();
  if (za == 2) fminus();
  if (za == 3) fkrat();
  if (za == 4) fdelene();
  cin.get();cin.get();
  return 0;
}
