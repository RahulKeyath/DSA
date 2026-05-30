#include <iostream>
using namespace std;

int main () {
    int num;
    cin >> num;

    int i = 1;
    int res = 1;
    while ( i <= num){
        int j = 1;
        while ( j <= i ){
            cout << res << " ";
            res++;
            j++;
        }
        cout << endl;
        i++;
    }
}