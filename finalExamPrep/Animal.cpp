#include "Animal.h"
#include <iostream>
using namespace std;

Animal::Animal(string name_, Diet diet_) 
    : name(name_), diet(diet_) {
}

void Animal::getLunch(int index) {
    cout << "Lunch is: " << diet.getMeals().at(index) << endl;
}

Animal::~Animal() {

}