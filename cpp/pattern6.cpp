#include <iostream>
using namespace std;

int main(){
    int num;
    cin >> num;

    int i = 1;
    while ( i <= num ){
        int j = 1;
        int k = 1;
        while ( k <= num - i ){
            cout << " ";
            k++;
        }
        while ( j <= (i*2) - 1 ){
            cout << "*";
            j++;
        }
        cout << endl;
        i++;
    }
}