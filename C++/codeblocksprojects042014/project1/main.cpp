#include <iostream>

using namespace std;

int main()
{
    string number_operator = "";
    int number_a = 0;
    int number_b = 0;

    cout << "\nKalkulator...\n\n";
    cout << "\nA: ";cin >> number_a;
    cout << "\nB: ";cin >> number_b;
    cout << "\nZvolte Si Operator: "; cin >> number_operator;

    if (number_operator == "+") {
        cout << "\nA + B = ";cout << number_a + number_b;
    } else { // else1
    if (number_operator == "-") {
        cout << "\nA - B = ";cout << number_a - number_b;
    } else { // else2
    if (number_operator == "*") {
        cout << "\nA * B = ";cout << number_a * number_b;
    } else { // else3
    if (number_operator == "/") {
        cout << "\nA / B = ";cout << number_a / number_b;
    } else { // else_false
        cout << "\n\nERROR: Operator you've been entered is not supported!";
    }}}} //end of else1,else2,else3,else_false


    cout << "\n\n";
    system("pause");
    system("cls");
    main();
    return(0);
}
