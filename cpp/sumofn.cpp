#include <iostream>

using namespace std;

int main() {
    int number, result = 0;
    cout << "Enter a number: ";
    cin >> number;
    for (int i = 1; i <= number; i++){
        result += i;
    }
    cout << "The sum of "<< number << " numbers is: " << result;
    return 0;
}