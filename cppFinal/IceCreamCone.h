#ifndef ICECREAMCONE_H
#define ICECREAMCONE_H

#include <string>
#include "IceCream.h"
using namespace std;

class IceCreamCone : public IceCream {

    protected:
        string type;

    public:
        IceCreamCone(string flavor, string type);
        ~IceCreamCone();
        virtual void addTopping(string topping);
        virtual void display();

};

#endif