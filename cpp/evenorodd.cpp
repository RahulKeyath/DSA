#include <iostream>

using namespace std ;

bool evenorodd ( int num ) {
    if ( num % 2 == 0 ) { return true ; }
    else { return false ; }

}


int main () {
    int number ;
    cout << "Enter a number to check even or odd: ";
    cin >> number ;
     if ( evenorodd ( number ) == 1 ) { cout << "Even" ; }
    else { cout << "Odd" ; }
    return 0 ; 
}