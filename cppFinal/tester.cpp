
#include "IceCream.h"
#include "IceCreamCone.h"
#include "IceCreamCup.h"
#include <vector>
#include <iostream>

int main() {

    vector<IceCream*> icv;

    IceCream* ic1 = new IceCreamCone("vanilla", "cone");
    IceCream* ic2 = new IceCreamCone("chocolate", "cone");
    IceCream* ic3 = new IceCreamCup("rocky road", "cup");
    
    // testing logic
    ic1->addTopping("banana");
    ic3->addTopping("bonnet");

    ic1->addTopping("sprinkles");
    ic2->addTopping("oreos");
    ic3->addTopping("gummy sharks");

    icv.push_back(ic1);
    icv.push_back(ic2);
    icv.push_back(ic3);

    for(IceCream* ic : icv) {
        ic->display();
        cout << endl;
    }

    delete(ic1);
    delete(ic2);
    delete(ic3);

    return 0;
}