#include "IceCreamCup.h"
#include <iostream>
using namespace std;

IceCreamCup::IceCreamCup(string flavor_, string type_) 
: type(type_), IceCream(flavor_) {

}

void IceCreamCup::addTopping(string topping) {
    if (topping.compare("bonnet") == 0) {
        cout << "sorry msg - no bonnet" << endl;
    }
    else {
        IceCream::addTopping(topping);
    }
}

void IceCreamCup::display() {
    cout << "This ice cream is in a " << type << endl;
    IceCream::display();
}

IceCreamCup::~IceCreamCup() {

}