#include <iostream>

using namespace std;

float area (float length, float breadth){
    return length * breadth;
}

int main () {
    int len , bre ;
    cout << "Enter length and breadth: ";
    cin >> len >> bre;
    cout << "The area of rectangle is: " << area ( len, bre);
    return 0;

}