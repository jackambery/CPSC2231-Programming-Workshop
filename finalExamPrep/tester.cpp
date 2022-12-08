#include "Diet.h"
#include "Hippo.h"

int main() {

    Diet d = Diet();
    vector<string> v = d.getMeals();

    Hippo* h1 = new Hippo("jack", d);
    Hippo* h2 = new Hippo("henry", d);
    Hippo* h3 = new Hippo("hugo", d);

    vector<Animal*> hippos;
    hippos.push_back(h1);
    hippos.push_back(h2);
    hippos.push_back(h3);

    int index = 0;
    for (Animal* a : hippos) {
        a->getLunch(index);
        index++;
    }

    delete(h1);
    delete(h2);
    delete(h3);

    return 0;
}