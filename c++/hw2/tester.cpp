
#include "Dog.h"
#include "Cat.h"
#include "BeardedDragon.h"
#include <vector>
#include <iostream>

int main() {
    
    Dog* d1 = new Dog("randy");
    Dog* d2 = new Dog("jeff");
    Cat* c1 = new Cat("kitty");
    Cat* c2 = new Cat("gary");
    BeardedDragon* bd1 = new BeardedDragon("godzilla");
    BeardedDragon* bd2 = new BeardedDragon("larry");

    vector<Animal*> pets;
    pets.push_back(d1);
    pets.push_back(d2);
    pets.push_back(c1);
    pets.push_back(c2);
    pets.push_back(bd1);
    pets.push_back(bd2);

    for (auto a : pets) {
        a->makesSound();
    }

    //release the memory
    delete d1;
    delete d2;
    delete c1;
    delete c2;
    delete bd1;
    delete bd2;

    return 0;
}