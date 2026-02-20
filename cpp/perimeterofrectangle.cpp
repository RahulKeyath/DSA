#include <iostream>

using namespace std;

float perimeter ( float len , float bre) {
    return 2 * ( len + bre );
}

int main () {
    float len , bre;
    cout << "Enter length and bredth: ";
    cin >> len >> bre;
    cout << perimeter ( len , bre );
    return 0;
}