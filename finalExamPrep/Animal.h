#ifndef ANIMAL_H
#define ANIMAL_H

#include <string>
#include "Diet.h"
using namespace std;

class Animal {

    private:
        string name;
        Diet diet;
    
    public:
        Animal(string name, Diet diet);
        virtual ~Animal();
        virtual void getLunch(int index);
};

#endif