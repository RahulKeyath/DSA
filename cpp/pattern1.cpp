#include <iostream>
using namespace std;

int main () {
    int num;
    cin >> num;

    int i=1;
    while ( i<=(num-1) )
    {
        int j = 1;
        while (j <= num)
        {
            cout << j << " ";
            j++;
        }
        cout << endl;
        i++;
    }
}