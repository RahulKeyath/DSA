#include <iostream>
using namespace std;

int main () {
    int a , b;
    cout << "Enter value of a and b: " << endl;
    cin >> a >> b;

    b = b + a;
    a = b - a;
    b = b - a;

    cout << "value of a: " << a << endl << "value of b: "<< b;
    return 0;
}