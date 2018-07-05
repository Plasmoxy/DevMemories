#include <iostream>
using namespace std;
int main()
{
  string a = "pomazanka";
  string b;
  string stav;
  string volba1;
  string volba1involba1;
  cout << "\nProsim zadajte heslo: ";
  cin >> b;
  if (b == a)
   stav = "1";
  else
   stav = "0";
  if (stav == "0") {cout << "Zadane heslo je nespravne!";}
  
  if (stav == "1") {
    cout << "0000000000000000000000\n0                    0\n0  OO  OOO  OO   OOO 0\n0 O    O    O O  O O 0\n0  O   OOO  OO   O O 0\n0   O  O    O O  O O 0\n0 OO   OOO  OO   OOO 0\n0                    0\n0000000000000000000000\n\n";
    cout << "Heslo bolo potvrdene.\n\nVolby:\n1 : Vypis osobne udaje\n2 : Vipis hesla.\n3 : Volby obrazkov\n\nvolba: ";  
  }
  cin >> volba1;
  if (volba1 == "1") {
             cout << "\n\n Meno: Sebastian\n Priezvisko: Petrik\n Bydlisko: Lipany\n Stat: Slovensko\n Web: seboserver.sweb.cz\n";
             }
  if (volba1 == "2") {
             cout << "\n\n Tento program:'pomazanka'\n";
             }
  if (volba1 == "3") {
             cout << "\n\n 1 : Zaciatocny obrazok\n\nvolba: ";
             cin >> volba1involba1;
             if (volba1involba1 == "1") {
                                cout << "\n0000000000000000000000\n0                    0\n0  OO  OOO  OO   OOO 0\n0 O    O    O O  O O 0\n0  O   OOO  OO   O O 0\n0   O  O    O O  O O 0\n0 OO   OOO  OO   OOO 0\n0                    0\n0000000000000000000000\n";
                                }
             }                   
  cin.get();cin.get();
  return 0;
}
