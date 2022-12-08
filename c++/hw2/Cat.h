#ifndef CAT_H
#define CAT_H

#include "Animal.h"

class Cat : public Animal {

    public:
        Cat(string name);
        void makesSound();
        ~Cat();
};

#endif