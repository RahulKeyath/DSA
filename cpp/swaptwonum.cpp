#include <iostream>

using namespace std ; 

int main () {
    int a , b , temp;
    cout << "Enter value of a: " ;
    cin >> a >> b;
    temp = a ;
    a = b;
    b = temp;
    cout << "Current value of a is :" << a << endl 
    << "And current value of b is: " << b << endl;
    return 0;
}