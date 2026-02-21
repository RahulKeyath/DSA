#include <iostream>

using namespace std;

int main () {
    int a ,b ,c;
    cout << "Enter three numbers: ";
    cin >> a >> b >> c;
    cout << max ( { a , b , c } );
    return 0;
}