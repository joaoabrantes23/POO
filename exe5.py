class Animal:
    def som(self):
        print("O animal faz um som.")

class Cachorro(Animal):
    def som(self):
        print("O cachorro late: Au Au!")

class Gato(Animal):
    def som(self):
        print("O gato mia: Miau!")

def emitir_som_dos_animais(animais):
    for animal in animais:
        animal.som() 
if __name__ == "__main__":
    animais = [Cachorro(), Gato()]

    emitir_som_dos_animais(animais)
