#ifndef ANIMAL_H
#define ANIMAL_H

#include <string>
using namespace std;

class Animal {

    private:
        string name;
    
    public:
        Animal(string name);
        virtual ~Animal();
        virtual void makesSound();
};

#endif