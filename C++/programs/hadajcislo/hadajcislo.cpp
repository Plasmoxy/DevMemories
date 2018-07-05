#include <iostream>
using namespace std;
int fa()
{
 int cislo = 78;
 int odpoved;
 cout << "\nHadaj ake cislo od 0 do 100 si myslim: ";
 cin >> odpoved;
 if (odpoved == cislo) cout << "Cislo je spravne.\n"; else cout << "Cislo je nespravne,\nskus to znovu!\n";
 fa();
}
int main()
{
 fa();
 cin.get();cin.get();
 return 0;
}
