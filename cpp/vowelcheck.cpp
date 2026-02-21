#include <iostream>

using namespace std;

bool vowelcheck ( char ch ){
    if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
    ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ){ return true; }
    else { return false; }
}

int main () {
    char ch ;
    cout << "Enter character: ";
    cin >> ch;
    if (( vowelcheck ( ch )) == 1 )  cout << "It is a vowel" ;
    else cout << "It is a consonant" ;
}