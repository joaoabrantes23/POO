def inserir_senha():
  senha = input("digite uma senha: ")
  return senha

def valida_senha(senha):
  if len(senha) >= 6:
    return True
  else:
    return False
  
def main():
    senha = inserir_senha()
    if valida_senha(senha):
        print("Senha válida")
    else:
        print("Senha inválida")

if __name__ == "__main__":
    main()