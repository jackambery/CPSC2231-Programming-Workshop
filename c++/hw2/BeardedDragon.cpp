#include "BeardedDragon.h"
#include <iostream>

BeardedDragon::BeardedDragon(string name_) : Animal(name_) {

}

BeardedDragon::~BeardedDragon() {
    cout << "see ya lizard...";
}