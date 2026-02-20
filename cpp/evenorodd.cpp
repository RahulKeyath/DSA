#include <iostream>

using namespace std ;

string evenorodd ( int num ) {
    if ( num % 2 == 0 ) { return "true" ; }
    else { return "false" ; }

}


int main () {
    int number ;
    cout << "Enter a number to check even or odd: ";
    cin >> number ;
    cout << evenorodd ( number );
    return 0 ; 
}