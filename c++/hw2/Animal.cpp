#include "Animal.h"
#include <iostream>
using namespace std;

Animal::Animal(string name_) 
    : name(name_) {
}

void Animal::makesSound () {
    cout << "**crickets**" << endl;
}

Animal::~Animal() {

}