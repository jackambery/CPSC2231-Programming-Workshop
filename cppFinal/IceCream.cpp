#include "IceCream.h"
#include "iostream"
using namespace std;

IceCream::IceCream(string flavor_)
    : flavor(flavor_) {

}

void IceCream::addTopping(string topping) {
    this->topping.addTopping(topping);
}

void IceCream::display() {
    cout << "The flavor of this ice cream is " << flavor << endl;
    this->topping.display();
}

IceCream::~IceCream() {
    
}
