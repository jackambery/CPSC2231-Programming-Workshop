#include "Cat.h"
#include <iostream>

Cat::Cat(string name_) : Animal(name_) {

}

void Cat::makesSound() {
    cout << "I am a pretty cat... meow! meow!" << endl;
}

Cat::~Cat() {
    cout << "cat deletion...";
}