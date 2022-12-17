#ifndef ICECREAMCUP_H
#define ICECREAMCUP_H

#include <string>
#include "IceCream.h"
using namespace std;

class IceCreamCup : public IceCream {

    protected:
        string type;

    public:
        IceCreamCup(string flavor, string type);
        ~IceCreamCup();
        virtual void addTopping(string topping);
        virtual void display();

};

#endif