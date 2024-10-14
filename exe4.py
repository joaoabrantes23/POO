class Animal:
    def som(self):
        print("O animal faz um som.")

class Cachorro(Animal):
    def som(self):
        print("O cachorro late: Au Au!")

class Gato(Animal):
    def som(self):
        print("O gato mia: Miau!")

if __name__ == "__main__":
    cachorro = Cachorro()
    gato = Gato()

    cachorro.som()  
    gato.som()    
