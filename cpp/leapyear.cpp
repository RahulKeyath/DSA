#include <iostream>

using namespace std;

bool leap (int year) {
    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
        return true;
    }
    else { return false; }
}

int main () {
    int year;
    cout << "Enter year: "; cin >> year;
    leap(year) == 1 ? cout << "Leap Year " : cout << "Not Leap Year";
    return 0;
}