#include <iostream>

using namespace std;

int main () {
    int num;
    cin >> num;
    int sum = 0;
    int prod = 1;

    for ( int i = 1; i <= num; i ++ ){
         sum += num%10;
         prod = prod * (num%10);
         num = num/10;
    }
    int res = prod;
    cout << prod - sum;
}