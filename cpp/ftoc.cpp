#include <iostream>
using namespace std;

float Conversion(float c){
    return (c - 32) * 5 / 9;
}

int main () {
    float f;
    cout << "Enter temperature in Farenheit: ";
    cin >> f;
    cout << "The value of temperature in Celsius is: " << Conversion(f);
    return 0;
}