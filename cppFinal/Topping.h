#ifndef TOPPING_H
#define TOPPING_H

#include <vector>
#include <string>
using namespace std;

class Topping {

    protected:
        vector<string> toppings;

    public:
        Topping();
        ~Topping();
        virtual void addTopping(string topping);
        virtual void display();

};

#endif