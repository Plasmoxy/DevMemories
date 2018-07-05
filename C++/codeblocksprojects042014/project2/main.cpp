//©SEBOHACKER 2014
//KEY CODES AT: http://www.kbdedit.com/manual/low_level_vk_list.html

#include <iostream>
#include <windows.h>

using namespace std;

int main()
{
    system("cls");
    if(GetAsyncKeyState('A')){              //zisti stlaceny klaves --- wyborne na virusy na keyloggery
            cout << "A IS ON == 1";
    } else {
        cout << "A IS OFF == 0";
    }
    Sleep(1);
    main();
    return 0;
}
