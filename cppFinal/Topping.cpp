#include "Topping.h"
#include "iostream"
using namespace std;

Topping::Topping() {
    
}

void Topping::addTopping(string topping) {
    toppings.push_back(topping);
}

void Topping::display() {
    cout << "This ice cream has these toppings: " << endl;
    for(string t : toppings) {
        cout << t << endl;
    }
}

Topping::~Topping() {
    
}
