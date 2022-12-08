#include "Diet.h"
#include <iostream>
using namespace std;

Diet::Diet() {
    init();
}

void Diet::init() {
    meals.push_back("cheeseburger");
    meals.push_back("pizza");
    meals.push_back("chicken sandwich");
}

vector<string> Diet::getMeals() {
    return meals;
}

Diet::~Diet() {
    cout << "diet is gone";
}