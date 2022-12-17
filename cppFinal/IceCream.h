#ifndef ICECREAM_H
#define ICECREAM_H

#include <string>
#include "Topping.h"
using namespace std;

class IceCream {

    protected:
        string flavor;
        Topping topping;

    public:
        IceCream(string flavor);
        ~IceCream();
        virtual void addTopping(string topping);
        virtual void display();

};

#endif