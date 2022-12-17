#include "IceCreamCone.h"
#include <iostream>
using namespace std;

IceCreamCone::IceCreamCone(string flavor_, string type_) 
: type(type_), IceCream(flavor_) {

}

void IceCreamCone::addTopping(string topping) {
    if (topping.compare("banana") == 0) {
        cout << "sorry msg - no banana" << endl;
    }
    else {
        IceCream::addTopping(topping);
    }
}

void IceCreamCone::display() {
    cout << "This ice cream is in a " << type << endl;
    IceCream::display();
}

IceCreamCone::~IceCreamCone() {

}