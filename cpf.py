def inserir_cpf():
    cpf = input("Digite o CPF: ")
    return cpf

def valida_cpf(cpf):
    cpf = ''.join(filter(str.isdigit, cpf))
    if len(cpf) == 11:
        return cpf
    else:
        return None

def mascara_cpf(cpf):
    cpf_vetor = list(cpf)
    cpf_vetor_mascarado = cpf_vetor[:3] + ['.', '*', '*', '*', '.', '*', '*', '*', '-'] + cpf_vetor[-2:]
    return ''.join(cpf_vetor_mascarado)

def main():
    cpf = inserir_cpf()
    if valida_cpf(cpf):
        cpf_mascarado = mascara_cpf(valida_cpf(cpf))
        print("CPF:", cpf_mascarado)
    else:
        print("CPF inválido!")

if __name__ == "__main__":
    main()