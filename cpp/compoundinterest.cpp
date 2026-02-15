#include <iostream>
#include <cmath>

using namespace std;

float Amount ( float P, float R,  float T ){
    return (P * pow(( 1 + (R / 100)) , T));
}

int main (){
    float P , R , T;
    cin >> P >> R >> T;
    cout << Amount(P , R , T) - P;
    return 0;
}