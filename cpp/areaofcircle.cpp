#include <iostream>

using namespace std;

float area (float radius) {
    return 2 * 3.14 * radius;
}

int main () {
    float radius;
    cout << "Enter radius of circle: ";
    cin >> radius;
    cout << area (radius);
    return 0;
}