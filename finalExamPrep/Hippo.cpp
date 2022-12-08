#include "Hippo.h"
#include <iostream>
using namespace std;

Hippo::Hippo(string name_, Diet diet_) : Animal(name_, diet_) {

}

void Hippo::getLunch(int index) {
    cout << "lunch is: " << diet.getMeals().at(index) << endl;
}

Hippo::~Hippo() {
    cout << "hippo is gone" << endl;
}