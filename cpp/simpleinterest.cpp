#include <iostream>
using namespace std;

float SI (float P, float R, float T){
    return ( P * R * T ) / 100;
}

int main () {
    float P , R , T;
    cout << "Enter values of P, R, T: ";
    cin >> P >> R >> T;
    cout << SI (P , R , T);
    return 0;
}