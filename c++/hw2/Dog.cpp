#include "Dog.h"
#include <iostream>

Dog::Dog(string name_) : Animal(name_) {

}

void Dog::makesSound() {
    cout << "I am an epic dog... woof! woof!" << endl;
}

Dog::~Dog() {
    cout << "bye bye dog...";
}