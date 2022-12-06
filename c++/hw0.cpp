#include <iostream>
#include <cmath>
#include <vector>
using namespace std;

int main() {
    string firstname;
    string lastname;
    cout << "Type your firstname: \n";
    cin >> firstname;
    cout << "Type your lastname: \n";
    cin >> lastname;
    cout << "Good morning, " << firstname << " " << lastname << "\n";

    for (int i = 0; i < 10; i++) {
        if (i % 2 == 1) {
            cout << "Square root of " << i << ": " << sqrt(1) << "\n";
        }
        else {
            cout << "Log of " << i << ": " << log(i) << "\n";
        }
    }

    string arr[5] = {"ate a lot", "sailed a boat", "saw my family", "watched a movie", "slept a lot"};
    for (string s : arr) {
        cout << "This past holiday I: " << s << "\n";
    }

    vector<float> vect;
    vect.push_back(0.5);
    vect.push_back(0.6);
    vect.push_back(1.99);
    vect.push_back(5.5);
    vect.push_back(44.44);

    cout << "\nFirst item in the vector: " << vect.front(); //first
    cout << "\nLast item in the vector: " << vect.back(); // last
    cout << "\nSize of the vector: " << vect.size(); // size
    cout << "\n3rd item in the vector: " << vect.at(3); // postion 3
    
    cout << "\nAll items in the vector: \n";
    for (float f : vect) {
        cout << f << "\n";
    }
    
    cout << "Removng item in position 3...\n";
    vector<float>::iterator iter;
    iter = vect.begin();
    iter++;
    iter++;
    vect.erase(iter);
    
    for (float f : vect) {
        cout << f << "\n";
    }

    return 0;
}